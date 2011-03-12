/*
 * Betfair Trickle. Automatic bet placement application. Copyright (C) 2010
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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.dao.MarketDao;
import uk.co.onehp.trickle.dao.MeetingDao;
import uk.co.onehp.trickle.domain.Market;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.services.session.SessionService;
import uk.co.onehp.trickle.util.DateUtil;

import com.betfair.publicapi.types.global.v3.APIRequestHeader;
import com.betfair.publicapi.types.global.v3.BFEvent;
import com.betfair.publicapi.types.global.v3.GetEventsErrorEnum;
import com.betfair.publicapi.types.global.v3.GetEventsReq;
import com.betfair.publicapi.types.global.v3.GetEventsResp;
import com.betfair.publicapi.types.global.v3.MarketSummary;
import com.betfair.publicapi.v3.bfglobalservice.BFGlobalService;
import com.betfair.publicapi.v3.bfglobalservice.BFGlobalService_Service;
import com.google.gson.Gson;

@Service("eventsService")
public class EventsServiceImpl implements EventsService {

	@Autowired
	SessionService sessionService;
	
	@Autowired
	MarketDao marketDao;
	
	@Autowired
	MeetingDao meetingDao;
	
	@Value("$ukMarketId")
	private final String ukMarketId = "298251";
	
	@Value("$meetingIdLimit")
	private final String meetingIdLimit = "26000000";
	
	private final Logger log = Logger.getLogger(EventsServiceImpl.class);
	
	@Override
	@Transactional
	public void getEvents(String req) {
			log.debug("GET EVENTS: " + req);
			final BFGlobalService_Service service = new BFGlobalService_Service();
			final BFGlobalService port = service
					.getBFGlobalService();
			
			final GetEventsReq request = new Gson().fromJson(req, GetEventsReq.class);
			
			final APIRequestHeader header = new APIRequestHeader();
			header.setSessionToken(sessionService.getGlobalSessionToken());
			request.setHeader(header);
			
			final GetEventsResp result = port
					.getEvents(request);
			
			if(result.getErrorCode() == GetEventsErrorEnum.OK){
				sessionService.updateGlobalSession(result.getHeader().getSessionToken());
				sessionService.updateExchangeSession(result.getHeader().getSessionToken());
				
				if(result.getEventParentId() == Integer.parseInt(ukMarketId)){
					final Market market = new Market(result.getEventParentId(), "");
					for(BFEvent bfEvent : result.getEventItems().getBFEvent()){
							if(bfEvent.getEventId()> Integer.parseInt(meetingIdLimit)){
								final Meeting meeting = new Meeting(bfEvent.getEventId(), bfEvent.getEventName());
								meeting.setMarket(market);
								market.addMeeting(meeting);
							}
					}
					marketDao.saveOrUpdate(market);
				}else{
					final Meeting meeting = meetingDao.getMeeting(result.getEventParentId());
					for(MarketSummary marketSummary : result.getMarketItems().getMarketSummary()){
						final Race race = new Race(marketSummary.getMarketId(),marketSummary.getMarketName(),DateUtil.gregorianCalendarToLocalDateTime(marketSummary.getStartTime()));
						race.setMeeting(meeting);
						meeting.addRace(race);
					}
					meetingDao.saveOrUpdate(meeting);
				}
			}
			log.debug("GET EVENTS: " + result.getErrorCode().toString());
	}

}
