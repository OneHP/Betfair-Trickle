package uk.co.onehp.trickle.dao;

import java.util.List;

import uk.co.onehp.trickle.domain.Race;

public interface RaceDao {
	void saveOrUpdate(Race race);
	Race getRace(final int id);
	List<Race> getAllRaces();
}
