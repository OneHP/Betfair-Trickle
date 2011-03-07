/**
 * 
 */
package uk.co.onehp.trickle.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Embeddable public class HorsePk implements Serializable{
	private static final long serialVersionUID = 3835203125064176663L;
	int runnerId;
	int raceId;
	
	HorsePk(){
		
	}
	
	public HorsePk(int runnerId, int raceId){
		this.runnerId = runnerId;
		this.raceId = raceId;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this).toString();
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
}