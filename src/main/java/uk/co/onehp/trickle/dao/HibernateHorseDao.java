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

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.google.common.collect.Maps;

import uk.co.onehp.trickle.domain.Horse;

@Repository("horseDao")
public class HibernateHorseDao extends HibernateBaseDao implements HorseDao {

	@Override
	public void saveOrUpdate(Horse horse) {
		super.saveOrUpdate(horse);
	}

	@Override
	public Horse getHorse(int runnerId, int raceId) {
		Map<String , Integer> params = Maps.newHashMap();
		params.put("runnerId", runnerId);
		params.put("raceId", raceId);
		return (Horse) hibernateTemplate.findByNamedQueryAndNamedParam("getHorse", new String[]{"runnerId","raceId"}, new Integer[]{runnerId,raceId}).get(0);
	}

}
