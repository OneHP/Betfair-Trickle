package uk.co.onehp.trickle.dao;

import java.util.List;

import uk.co.onehp.trickle.domain.Meeting;

public interface MeetingDao {
	void saveOrUpdate(Meeting meeting);
	Meeting getMeeting(final int id);
	List<Meeting> getAllMeetings();
}
