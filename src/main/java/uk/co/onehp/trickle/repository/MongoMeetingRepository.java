package uk.co.onehp.trickle.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Meeting;

@Repository("meetingRepository")
public class MongoMeetingRepository extends AbstractMongoRepository implements
MeetingRepository {

	@Override
	public void saveOrUpdate(Meeting meeting) {
		this.datastore.save(meeting);
	}

	@Override
	public Meeting getMeeting(int id) {
		return this.datastore.find(Meeting.class).field("eventId").equal(id).get();
	}

	@Override
	public List<Meeting> getAllMeetings() {
		return this.datastore.find(Meeting.class).field("complete").equal(false).asList();
	}

	@Override
	public void delete(Meeting meeting) {
		this.datastore.delete(meeting);
	}

}
