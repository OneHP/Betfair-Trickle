package uk.co.onehp.trickle.dao;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.HorsePk;

@Repository("horseDao")
public class HibernateHorseDao extends HibernateBaseDao implements HorseDao {

	@Override
	public void saveOrUpdate(Horse horse) {
		super.saveOrUpdate(horse);
	}

	@Override
	public Horse getHorse(HorsePk id) {
		return hibernateTemplate.get(Horse.class, id);
	}

}
