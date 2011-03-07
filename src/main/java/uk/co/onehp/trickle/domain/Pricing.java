package uk.co.onehp.trickle.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Pricing extends BaseDomainObject {

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	private BigDecimal price;
	private BigDecimal amountAvailable;
	private BettingAspect bettingAspect;
	
	public Pricing(){
		
	}
	
	public Pricing(BigDecimal price, BigDecimal amountAvailable, BettingAspect bettingAspect){
		this.price = price;
		this.amountAvailable = amountAvailable;
		this.bettingAspect = bettingAspect;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setAmountAvailable(BigDecimal amountAvailable) {
		this.amountAvailable = amountAvailable;
	}

	public BigDecimal getAmountAvailable() {
		return amountAvailable;
	}

	public void setBettingAspect(BettingAspect bettingAspect) {
		this.bettingAspect = bettingAspect;
	}

	public BettingAspect getBettingAspect() {
		return bettingAspect;
	}
}
