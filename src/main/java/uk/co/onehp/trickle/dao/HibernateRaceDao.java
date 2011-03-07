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
