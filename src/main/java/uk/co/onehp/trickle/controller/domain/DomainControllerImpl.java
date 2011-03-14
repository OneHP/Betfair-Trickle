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
package uk.co.onehp.trickle.controller.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.services.domain.DomainService;

@Controller(value="domainController")
public class DomainControllerImpl implements DomainController {
	
	@Autowired
	private DomainService domainService;
	
	@Override
	public void saveStrategy(Strategy strategy) {
		domainService.saveStrategy(strategy);
	}

	@Override
	public List<Strategy> getAllStrategies() {
		return domainService.getAllStrategies();
	}

	@Override
	public List<Meeting> getAllMeetings() {
		return domainService.getAllMeetings();
	}

	@Override
	public void saveBet(Bet bet) {
		domainService.updateBet(bet);
	}

	@Override
	public List<Bet> getIncompleteBets() {
		return domainService.getIncompleteBets();
	}

	@Override
	public void deleteStrategy(Strategy strategy) {
		domainService.deleteStrategy(strategy);
	}

	@Override
	public void deleteBet(Bet bet) {
		domainService.deleteBet(bet);
	}

	@Override
	public void deleteIncompleteBets() {
		domainService.deleteIncompleteBets();
	}

	@Override
	public List<Bet> getCompleteBets() {
		return domainService.getCompleteBets();
	}

}
