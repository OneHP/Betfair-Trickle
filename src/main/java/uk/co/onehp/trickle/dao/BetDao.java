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
package uk.co.onehp.trickle.dao;

import java.util.List;

import uk.co.onehp.trickle.domain.Bet;

public interface BetDao {

	void saveOrUpdate(Bet bet);
	Bet getNextBet();
	List<Bet> getBetsToPlace();
	List<Bet> getUpcomingBetsToPlace();
	List<Bet> getIncompleteBets();
	List<Bet> getCompleteBets();
	void deleteBet(Bet bet);
	void deleteIncompleteBets();
	void wipeBets();
}
