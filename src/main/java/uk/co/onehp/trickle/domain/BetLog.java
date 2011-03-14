package uk.co.onehp.trickle.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.joda.time.LocalDateTime;

@Entity
public class BetLog extends BaseDomainObject {

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	private final LocalDateTime placedDateTime;
	private final BigDecimal liability;
	private final BigDecimal price;
	private final BetType betType;
	
	public BetLog(){
		placedDateTime = null;
		liability = null;
		price = null;
		betType = null;
	}
	
	public BetLog(LocalDateTime placedDateTime, BigDecimal liability, BigDecimal price, BetType betType){
		this.placedDateTime = placedDateTime;
		this.liability = liability;
		this.price = price;
		this.betType = betType;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getPlacedDateTime() {
		return placedDateTime;
	}

	public BigDecimal getLiability() {
		return liability;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BetType getBetType() {
		return betType;
	}
}
