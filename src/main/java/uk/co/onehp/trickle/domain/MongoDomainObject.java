package uk.co.onehp.trickle.domain;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Id;

public abstract class MongoDomainObject extends BaseDomainObject {

	@Id
	private ObjectId id;

	@Override
	public boolean equals(Object value){
		return this.getId().equals(((MongoDomainObject) value).getId());
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ObjectId getId() {
		return this.id;
	}
}
