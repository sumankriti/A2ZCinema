package com.a2zcinema.daoImpl;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.a2zcinema.dao.AdvertisementDao;
import com.a2zcinema.model.Advertisement;
import com.a2zcinema.model.Users;

@Repository
public class AdvertisementDaoImpl implements AdvertisementDao {

	@Autowired
	private SessionFactory sessionFac;
	
	@Override
	public Object getAdvertisement() {
		String query = "Select * from advertising a where a.adds_type='advertisement'";
		Object users = (Object) this.sessionFac.getCurrentSession().createSQLQuery(query)
				
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		return users;
	}

	@Override
	public Object getCasting() {
		String query = "Select * from advertising a where a.adds_type='casting'";
		Object users = (Object) this.sessionFac.getCurrentSession().createSQLQuery(query)
				
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		return users;
	}

	

	
	
	

	
}
