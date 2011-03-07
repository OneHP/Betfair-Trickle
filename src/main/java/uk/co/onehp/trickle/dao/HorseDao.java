package uk.co.onehp.trickle.dao;

import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.HorsePk;

public interface HorseDao {
	void saveOrUpdate(Horse horse);
	Horse getHorse(final HorsePk id);
}
