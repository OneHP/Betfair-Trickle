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

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Race;

@Repository("raceDao")
public class HibernateRaceDao extends HibernateBaseDao implements RaceDao {

	@Override
	public void saveOrUpdate(Race race) {
		super.saveOrUpdate(race);
	}

	@Override
	public Race getRace(int id) {
		return hibernateTemplate.get(Race.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Race> getAllRaces() {
		return hibernateTemplate.findByNamedQuery("ALL_RACES");
	}

}
