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

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.onehp.trickle.dao.HorseDao;
import uk.co.onehp.trickle.dao.RaceDao;
import uk.co.onehp.trickle.domain.BettingAspect;
import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.Pricing;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.services.session.SessionService;

import com.betfair.publicapi.types.exchange.v5.APIRequestHeader;
import com.betfair.publicapi.types.exchange.v5.GetMarketPricesErrorEnum;
import com.betfair.publicapi.types.exchange.v5.GetMarketPricesReq;
import com.betfair.publicapi.types.exchange.v5.GetMarketPricesResp;
import com.betfair.publicapi.types.exchange.v5.Price;
import com.betfair.publicapi.types.exchange.v5.RunnerPrices;
import com.betfair.publicapi.v5.bfexchangeservice.BFExchangeService;
import com.betfair.publicapi.v5.bfexchangeservice.BFExchangeService_Service;
import com.google.common.collect.Lists;
import com.google.gson.Gson;

@Service("marketPricesService")
public class MarketPricesServiceImpl implements MarketPricesService {

	@Autowired
	SessionService sessionService;
	
	@Autowired
	RaceDao raceDao;
	
	@Autowired
	HorseDao horseDao;
	
	private final Logger log = Logger.getLogger(MarketPricesServiceImpl.class);
	
	@Override
	public void getMarketPrices(String req) {
		log.debug("GET MARKET PRICES: " + req);
		final BFExchangeService_Service service = new BFExchangeService_Service();
		final BFExchangeService port = service
				.getBFExchangeService();
		
		final GetMarketPricesReq request = new Gson().fromJson(req, GetMarketPricesReq.class);
		
		final APIRequestHeader header = new APIRequestHeader();
		header.setSessionToken(sessionService.getExchangeSessionToken());
		request.setHeader(header);
		
		final GetMarketPricesResp result = port
				.getMarketPrices(request);
		
		if(result.getErrorCode() == GetMarketPricesErrorEnum.OK){
			sessionService.updateGlobalSession(result.getHeader().getSessionToken());
			sessionService.updateExchangeSession(result.getHeader().getSessionToken());
			
			final Race race = raceDao.getRace(result.getMarketPrices().getMarketId());
			for(RunnerPrices runnerPrices : result.getMarketPrices().getRunnerPrices().getRunnerPrices()){
				updatePrice(runnerPrices, race);
			}
		}
		log.debug("GET MARKET PRICES: " + result.getErrorCode().toString());
	}

	private void updatePrice(RunnerPrices runnerPrices, Race race){
		for(Horse horse : race.getRunners()){
			if(runnerPrices.getSelectionId() == horse.getRunnerId()){
				final List<Pricing> pricings = Lists.newArrayList(convertPricesToPricings(runnerPrices.getBestPricesToBack().getPrice(), BettingAspect.BACK));
				pricings.addAll(convertPricesToPricings(runnerPrices.getBestPricesToLay().getPrice(), BettingAspect.LAY));
				horse.setPrices(pricings);
				horseDao.saveOrUpdate(horse);
				return;
			}
		}
	}
	
	private List<Pricing> convertPricesToPricings(List<Price> prices, BettingAspect bettingAspect){
		final List<Pricing> pricings =  Lists.newArrayList();
		for(Price price : prices){
			pricings.add(new Pricing(new BigDecimal(price.getPrice()), new BigDecimal(price.getAmountAvailable()), bettingAspect));
		}
		return pricings;
	}
}
