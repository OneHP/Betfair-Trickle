package uk.co.onehp.trickle.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.BasicRace;
import uk.co.onehp.trickle.domain.Race;

@Repository("raceRepository")
public class MongoRaceRepository extends AbstractMongoRepository implements RaceRepository {

	@Override
	public void saveOrUpdate(Race race) {
		this.datastore.save(race);
	}

	@Override
	public Race getRace(int eventId) {
		return this.datastore.find(Race.class).field("eventId").equal(eventId).get();
	}

	@Override
	public List<Race> getAllRaces() {
		return this.datastore.find(Race.class).field("complete").equal(false).asList();
	}

	@Override
	public void saveOrUpdate(BasicRace basicRace) {
		this.datastore.save(basicRace);
	}

}
