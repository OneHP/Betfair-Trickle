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
package uk.co.onehp.trickle.repository;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.HorsePk;

@Repository("horseDao")
public class HibernateHorseDao extends HibernateBaseDao implements HorseRepository {

	@Override
	public void saveOrUpdate(Horse horse) {
		super.saveOrUpdate(horse);
	}

	@Override
	public Horse getHorse(HorsePk id) {
		return hibernateTemplate.get(Horse.class, id);
	}

}