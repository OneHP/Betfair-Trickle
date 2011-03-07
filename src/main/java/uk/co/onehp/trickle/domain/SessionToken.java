package uk.co.onehp.trickle.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.joda.time.LocalDateTime;
@NamedQueries({
	@NamedQuery(
	name = "getSessionToken",
	query = "from SessionToken st where st.sessionType = :sessionType"
	)
})
@Entity
public class SessionToken extends BaseDomainObject {
	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	private String token;
	private LocalDateTime updatedDateTime;
	private SessionType sessionType;
	
	public void updateToken(String token){
		this.token = token;
		updatedDateTime = new LocalDateTime();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}

	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public LocalDateTime getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setSessionType(SessionType sessionType) {
		this.sessionType = sessionType;
	}

	public SessionType getSessionType() {
		return sessionType;
	}
}
