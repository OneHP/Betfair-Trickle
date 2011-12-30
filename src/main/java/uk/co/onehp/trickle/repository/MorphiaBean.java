package uk.co.onehp.trickle.repository;

import javax.annotation.PostConstruct;

import uk.co.onehp.trickle.domain.SessionToken;

import com.google.code.morphia.Morphia;

public class MorphiaBean extends Morphia {

	@PostConstruct
	public void init(){
		this.map(SessionToken.class);
	}
}
