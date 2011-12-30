package uk.co.onehp.trickle.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

public class AbstractMongoRepository {

	@Autowired
	Morphia morphia;

	@Autowired
	Mongo mongo;

	Datastore datastore;

	@PostConstruct
	public void init(){
		this.datastore = this.morphia.createDatastore(this.mongo, "auction");
	}
}
