package uk.co.onehp.trickle.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import uk.co.onehp.trickle.domain.BaseDomainObject;

public abstract class HibernateBaseDao {

	@Autowired
	protected HibernateTemplate hibernateTemplate;

	public void saveOrUpdate(final BaseDomainObject object) {
		hibernateTemplate.saveOrUpdate(object);
	}
	
	public void delete(final BaseDomainObject object){
		hibernateTemplate.delete(object);
	}
}
