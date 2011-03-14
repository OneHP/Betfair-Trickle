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

import uk.co.onehp.trickle.services.session.SessionService;

import com.betfair.publicapi.types.exchange.v5.APIRequestHeader;
import com.betfair.publicapi.types.exchange.v5.PlaceBetsErrorEnum;
import com.betfair.publicapi.types.exchange.v5.PlaceBetsReq;
import com.betfair.publicapi.types.exchange.v5.PlaceBetsResp;
import com.betfair.publicapi.types.exchange.v5.PlaceBetsResult;
import com.betfair.publicapi.v5.bfexchangeservice.BFExchangeService;
import com.betfair.publicapi.v5.bfexchangeservice.BFExchangeService_Service;
import com.google.gson.Gson;

@Service("placeBetsService")
public class PlaceBetsServiceImpl implements PlaceBetsService {

	@Autowired
	SessionService sessionService;
	
	private final Logger log = Logger.getLogger(PlaceBetsServiceImpl.class);
	
	@Override
	@Transactional
	public void placeBets(String req) {
		log.debug("PLACE BETS: " + req);
		final BFExchangeService_Service service = new BFExchangeService_Service();
		final BFExchangeService port = service
				.getBFExchangeService();
		
		final PlaceBetsReq request = new Gson().fromJson(req, PlaceBetsReq.class);
		
		final APIRequestHeader header = new APIRequestHeader();
		header.setSessionToken(sessionService.getExchangeSessionToken());
		request.setHeader(header);
		
		final PlaceBetsResp result = port
				.placeBets(request);
		
		if(result.getErrorCode() == PlaceBetsErrorEnum.OK){
			
		}
		log.debug("PLACE BETS: " + result.getErrorCode().toString());
		for(PlaceBetsResult pbResult : result.getBetResults().getPlaceBetsResult()){
			log.debug("PLACE BETS BET: " + pbResult.getResultCode().toString());
		}
	}

}
