package uk.co.onehp.trickle.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class BetTiming extends BaseDomainObject {

	
	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	private int secondsBeforeOff;
	@Type(type="boolean")
	private boolean processed;
	
	public BetTiming(){
		
	}
	
	public BetTiming(int secondsBeforeOff){
		this.secondsBeforeOff = secondsBeforeOff;
		processed = false;
	}
	
	public int getId() {
		return id;
	}
	public int getSecondsBeforeOff() {
		return secondsBeforeOff;
	}
	public boolean isProcessed() {
		return processed;
	}
	public void markAsProcessed(){
		processed = true;
	}
}
