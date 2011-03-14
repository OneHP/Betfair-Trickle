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

import com.betfair.publicapi.types.global.v3.LoginErrorEnum;
import com.betfair.publicapi.types.global.v3.LoginReq;
import com.betfair.publicapi.types.global.v3.LoginResp;
import com.betfair.publicapi.v3.bfglobalservice.BFGlobalService;
import com.betfair.publicapi.v3.bfglobalservice.BFGlobalService_Service;
import com.google.gson.Gson;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	SessionService sessionService;
	
	private final Logger log = Logger.getLogger(LoginServiceImpl.class);
	
	@Override
	@Transactional
	public void login(String req) {
			log.debug("LOGIN: " + req);
			final BFGlobalService_Service service = new BFGlobalService_Service();
			final BFGlobalService port = service
					.getBFGlobalService();
			final LoginReq request = new Gson().fromJson(req, LoginReq.class);

			request.setProductId(82);
			final LoginResp result = port
					.login(request);
			
			if(result.getErrorCode() == LoginErrorEnum.OK){
				sessionService.updateGlobalSession(result.getHeader().getSessionToken());
				sessionService.updateExchangeSession(result.getHeader().getSessionToken());
			}
			log.debug("LOGIN: " + result.getErrorCode().toString() + " : " + result.getHeader().getErrorCode().toString());
	}
}
