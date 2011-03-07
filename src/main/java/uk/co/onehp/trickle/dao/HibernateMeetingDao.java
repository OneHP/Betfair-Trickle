package uk.co.onehp.trickle.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Meeting;

@Repository("meetingDao")
public class HibernateMeetingDao extends HibernateBaseDao implements MeetingDao {

	@Override
	public Meeting getMeeting(int id) {
		return hibernateTemplate.get(Meeting.class, id);
	}
	
	@Override
	public void saveOrUpdate(Meeting meeting) {
		super.saveOrUpdate(meeting);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Meeting> getAllMeetings() {
		return hibernateTemplate.findByNamedQuery("ALL_MEETINGS");
	}

}
