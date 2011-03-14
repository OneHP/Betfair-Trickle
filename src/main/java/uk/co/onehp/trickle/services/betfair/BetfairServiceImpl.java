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
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spi.BrowsableEndpoint;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.BetLog;
import uk.co.onehp.trickle.domain.BetType;
import uk.co.onehp.trickle.domain.BettingAspect;
import uk.co.onehp.trickle.domain.Pricing;
import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.services.domain.DomainService;
import uk.co.onehp.trickle.services.session.SessionService;
import uk.co.onehp.trickle.util.BettingUtil;

import com.betfair.publicapi.types.exchange.v5.ArrayOfPlaceBets;
import com.betfair.publicapi.types.exchange.v5.BetCategoryTypeEnum;
import com.betfair.publicapi.types.exchange.v5.BetPersistenceTypeEnum;
import com.betfair.publicapi.types.exchange.v5.BetTypeEnum;
import com.betfair.publicapi.types.exchange.v5.GetMarketPricesReq;
import com.betfair.publicapi.types.exchange.v5.GetMarketReq;
import com.betfair.publicapi.types.exchange.v5.PlaceBets;
import com.betfair.publicapi.types.exchange.v5.PlaceBetsReq;
import com.betfair.publicapi.types.global.v3.GetEventsReq;
import com.betfair.publicapi.types.global.v3.LoginReq;
import com.betfair.publicapi.types.global.v3.ViewProfileReq;
import com.google.common.collect.Maps;
import com.google.gson.Gson;

@Service("betfairService")
public class BetfairServiceImpl implements BetfairService {

	@Value("${bfusername}")
	private String username;

	@Value("${bfpassword}")
	private String password;

	@Value("${sessionTimeout}")
	private int sessionTimeout;

	@Value("${ukMarketId}")
	private int ukMarketId;

	@Autowired
	private CamelContext camelContext;
	
	@Autowired
	private ProducerTemplate producerTemplate;
	
	@Autowired
	private SessionService sessionService;
	
	@Autowired
	private DomainService domainService;

	@Override
	@Transactional
	public void login() {
		if (((BrowsableEndpoint)camelContext.getEndpoint("jms:login")).getExchanges().size() == 0) {
			LoginReq loginReq = new LoginReq();
			loginReq.setUsername(username);
			loginReq.setPassword(password);
			sendRequest(loginReq);
		}
	}

	@Override
	@Transactional
	public void viewProfile() {
		ViewProfileReq viewProfileReq = new ViewProfileReq();
		sendRequest(viewProfileReq);
	}

	@Override
	@Transactional
	public void getMeeting(int meetingId) {
		GetEventsReq getEventsReq = new GetEventsReq();
		getEventsReq.setEventParentId(meetingId);
		sendRequest(getEventsReq);
	}

	@Override
	@Transactional
	public void getUkMarket() {
		GetEventsReq getEventsReq = new GetEventsReq();
		getEventsReq.setEventParentId(ukMarketId);
		sendRequest(getEventsReq);
	}

	@Override
	@Transactional
	public void getRace(int raceId) {
		GetMarketReq getMarketInfoReq = new GetMarketReq();
		getMarketInfoReq.setMarketId(raceId);
		sendRequest(getMarketInfoReq);
	}

	@Override
	@Transactional
	public void getRacePrices(int raceId) {
		GetMarketPricesReq getMarketPricesReq = new GetMarketPricesReq();
		getMarketPricesReq.setMarketId(raceId);
		sendRequest(getMarketPricesReq);
	}
	
	@Override
	@Transactional
	public void placeBet(Bet bet) {
		PlaceBetsReq placeBetsReq = new PlaceBetsReq();
		placeBetsReq.setBets(new ArrayOfPlaceBets());
		//if price falls within range
			//if chasing
				//place entire amount at chased price, market on close
			//else
				//place as much as possible at highest price, market on close
				//place remainder at SP limit on close
		//else
			//place at SP limit on close
		Strategy strategy = bet.getStrategy();
		BigDecimal liability = strategy.getLiability().divide(new BigDecimal(bet.getNumberOfSplits()), BigDecimal.ROUND_HALF_UP);
		Pricing bestPricing = BettingUtil.bestPrice(bet.getHorse().getPrices(), strategy.getAspect());
		if(bestPricing.getPrice().compareTo(strategy.getMaxOdds()) <= 0 && bestPricing.getPrice().compareTo(strategy.getMinOdds()) >= 0){
			if(strategy.getChasePriceByTick() == 0){
				if(bestPricing.getAmountAvailable().compareTo(liability)>=0){
					placeBetsReq.getBets().getPlaceBets().add(createMOCExchangeBet(bet, liability, bestPricing.getPrice()));
				}else{
					placeBetsReq.getBets().getPlaceBets().add(createMOCExchangeBet(bet, bestPricing.getAmountAvailable(), bestPricing.getPrice()));
					placeBetsReq.getBets().getPlaceBets().add(createLimitedSPBet(bet, liability.subtract(bestPricing.getAmountAvailable())));
				}
			} else {
				placeBetsReq.getBets().getPlaceBets().add(createMOCExchangeBet(bet, liability, BettingUtil.findChasePrice(bestPricing.getPrice(), strategy.getChasePriceByTick(), strategy.getAspect())));
			}
		} else {
			placeBetsReq.getBets().getPlaceBets().add(createLimitedSPBet(bet, liability));
		}
		sendRequest(placeBetsReq);
	}
	
	private PlaceBets createLimitedSPBet(Bet bet, BigDecimal liability){
		BigDecimal price = (bet.getStrategy().getAspect() == BettingAspect.BACK ? bet.getStrategy().getMinOdds() : bet.getStrategy().getMaxOdds());
		bet.addLog(new BetLog(new LocalDateTime(), liability, price, BetType.LIMITED_SP));
		domainService.updateBet(bet);
		PlaceBets placeBets = new PlaceBets();
		placeBets.setBetType(bet.getStrategy().getAspect() == BettingAspect.BACK ? BetTypeEnum.B : BetTypeEnum.L);
		placeBets.setBetCategoryType(BetCategoryTypeEnum.L);
		placeBets.setBetPersistenceType(BetPersistenceTypeEnum.NONE);
		placeBets.setMarketId(bet.getHorse().getRaceId());
		placeBets.setSelectionId(bet.getHorse().getRunnerId());
		placeBets.setBspLiability(liability.doubleValue());
		placeBets.setSize(bet.getStrategy().getAspect() == BettingAspect.BACK ? liability.doubleValue() : BettingUtil.libilityToStake(liability, price).doubleValue());
		placeBets.setPrice(price.doubleValue());
		return placeBets;
	}
	
	private PlaceBets createMOCExchangeBet(Bet bet, BigDecimal liability, BigDecimal price){
		bet.addLog(new BetLog(new LocalDateTime(), liability, price, BetType.MOC_EXCHANGE));
		domainService.updateBet(bet);
		PlaceBets placeBets = new PlaceBets();
		placeBets.setBetType(bet.getStrategy().getAspect() == BettingAspect.BACK ? BetTypeEnum.B : BetTypeEnum.L);
		placeBets.setBetCategoryType(BetCategoryTypeEnum.E);
		placeBets.setBetPersistenceType(BetPersistenceTypeEnum.SP);
		placeBets.setMarketId(bet.getHorse().getRaceId());
		placeBets.setSelectionId(bet.getHorse().getRunnerId());
		placeBets.setSize(bet.getStrategy().getAspect() == BettingAspect.BACK ? liability.doubleValue() : BettingUtil.libilityToStake(liability, price).doubleValue());
		placeBets.setPrice(price.doubleValue());
		//Workaround for known bug in betfair
		placeBets.setBspLiability(0.0);
		return placeBets;
	}

	private void sendRequest(Object body) {
		if (body.getClass() != LoginReq.class) {
			if (sessionService.getGlobalSessionTokenUpdateDateTime()
					.plusSeconds(sessionTimeout).isBefore(new LocalDateTime())) {
				login();
			}
		}
		final Map<String, Object> headers = Maps.newHashMap();
		headers.put("requestType", body.getClass().toString());
		producerTemplate.sendBodyAndHeaders("jms:betfair",  
				new Gson().toJson(body), headers);
	}
}
