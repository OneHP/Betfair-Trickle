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

import com.betfair.publicapi.types.global.v3.APIRequestHeader;
import com.betfair.publicapi.types.global.v3.ViewProfileErrorEnum;
import com.betfair.publicapi.types.global.v3.ViewProfileReq;
import com.betfair.publicapi.types.global.v3.ViewProfileResp;
import com.betfair.publicapi.v3.bfglobalservice.BFGlobalService;
import com.betfair.publicapi.v3.bfglobalservice.BFGlobalService_Service;
import com.google.gson.Gson;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private SessionService sessionService;
	
	private final Logger log = Logger.getLogger(ProfileServiceImpl.class);
	
	@Override
	@Transactional
	public void viewProfile(String req) {
			final BFGlobalService_Service service = new BFGlobalService_Service();
			final BFGlobalService port = service
					.getBFGlobalService();
			final ViewProfileReq request = new Gson().fromJson(req, ViewProfileReq.class);
			
			final APIRequestHeader header = new APIRequestHeader();
			header.setSessionToken(sessionService.getGlobalSessionToken());
			
			request.setHeader(header);
			final ViewProfileResp result = port
					.viewProfile(request);
			
			if(result.getErrorCode() == ViewProfileErrorEnum.OK){
				sessionService.updateGlobalSession(result.getHeader().getSessionToken());
				sessionService.updateExchangeSession(result.getHeader().getSessionToken());
			}
			log.debug(result.getErrorCode().toString());
	}
}
