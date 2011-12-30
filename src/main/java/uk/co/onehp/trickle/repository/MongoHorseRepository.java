package uk.co.onehp.trickle.repository;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.Race;

@Repository("horseRepository")
public class MongoHorseRepository extends AbstractMongoRepository implements HorseRepository{

	@Override
	public void saveOrUpdate(Horse horse) {
		this.datastore.save(horse);
	}

	@Override
	public Horse getHorse(Race race, int runnerId) {
		return this.datastore.find(Horse.class).field("runnerId").equal(runnerId).field("race").equal(race).get();
	}

}
