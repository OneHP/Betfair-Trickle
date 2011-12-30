/*
 * Betfair Trickle. Automatic bet placement application. Copyright (C) 2011
 * Thomas Inman. This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version. This program is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package uk.co.onehp.trickle.services.betfair;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.repository.RaceRepository;
import uk.co.onehp.trickle.services.session.SessionService;

import com.betfair.publicapi.types.exchange.v5.APIRequestHeader;
import com.betfair.publicapi.types.exchange.v5.GetMarketErrorEnum;
import com.betfair.publicapi.types.exchange.v5.GetMarketReq;
import com.betfair.publicapi.types.exchange.v5.GetMarketResp;
import com.betfair.publicapi.types.exchange.v5.Runner;
import com.betfair.publicapi.v5.bfexchangeservice.BFExchangeService;
import com.betfair.publicapi.v5.bfexchangeservice.BFExchangeService_Service;
import com.google.gson.Gson;

@Service("marketService")
public class MarketServiceImpl implements MarketService {

	@Autowired
	SessionService sessionService;
	
	@Autowired
	RaceRepository raceDao;
	
	private final Logger log = Logger.getLogger(MarketServiceImpl.class);
	
	@Override
	@Transactional
	public void getMarket(String req) {
		log.debug("GET MARKET: " + req);
		final BFExchangeService_Service service = new BFExchangeService_Service();
		final BFExchangeService port = service
				.getBFExchangeService();
		
		final GetMarketReq request = new Gson().fromJson(req, GetMarketReq.class);
		
		final APIRequestHeader header = new APIRequestHeader();
		header.setSessionToken(sessionService.getExchangeSessionToken());
		request.setHeader(header);
		
		final GetMarketResp result = port
				.getMarket(request);
		
		if(result.getErrorCode() == GetMarketErrorEnum.OK){
			sessionService.updateGlobalSession(result.getHeader().getSessionToken());
			sessionService.updateExchangeSession(result.getHeader().getSessionToken());
			
			final Race race = raceDao.getRace(result.getMarket().getMarketId());
			for(Runner runner : result.getMarket().getRunners().getRunner()){
				final Horse horse = new Horse();
				horse.setRaceId(race.getEventId());
				horse.setRunnerId(runner.getSelectionId());
				horse.setName(runner.getName());
				horse.setRace(race);
				race.addHorse(horse);
			}
			raceDao.saveOrUpdate(race);
		}
		log.debug("GET MARKET: " + result.getErrorCode().toString());
	}

}
