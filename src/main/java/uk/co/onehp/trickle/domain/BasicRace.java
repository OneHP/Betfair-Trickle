package uk.co.onehp.trickle.domain;

import org.joda.time.LocalDateTime;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Serialized;

@Entity
public class BasicRace extends MongoDomainObject {

	private int eventId;
	private final String name;
	@Serialized
	private final LocalDateTime startTime;
	private String meetingName;
	private boolean complete;

	public BasicRace(){
		this.eventId = 0;
		this.name = "";
		this.startTime = new LocalDateTime(0);
		this.meetingName = "";
		this.setComplete(false);
	}

	public BasicRace(int eventId, String name, LocalDateTime startTime, String meetingName) {
		this.eventId = eventId;
		this.name = name;
		this.startTime = startTime;
		this.meetingName = meetingName;
		this.setComplete(false);
	}

	public void markAsComplete(){
		this.setComplete(true);
	}

	public int getEventId() {
		return this.eventId;
	}

	public String getName() {
		return this.name;
	}

	public LocalDateTime getStartTime() {
		return this.startTime;
	}

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	public String getMeetingName() {
		return this.meetingName;
	}

	public void setEventId(int raceId) {
		this.eventId = raceId;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public boolean isComplete() {
		return this.complete;
	}

}
