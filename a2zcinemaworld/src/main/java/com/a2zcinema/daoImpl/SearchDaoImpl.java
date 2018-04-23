package com.a2zcinema.daoImpl;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.a2zcinema.dao.SearchDao;
import com.a2zcinema.model.Users;
@Repository
public class SearchDaoImpl implements SearchDao{

	@Autowired
	private SessionFactory sessionFac;
	@Override
	public Object searchUser(String name) {
//		String qry="select * from  Users u where u.name like (concat(:name,'%'))";
		String qry="SELECT * FROM users u LEFT JOIN actorprofile a ON (u.user_id=a.actor_back_profile_id) WHERE u.name LIKE (concat(:name,'%'))";
		Object user=this.sessionFac.getCurrentSession().createSQLQuery(qry).
				setParameter("name",name).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		return user;
	}
	@Override
	public Users searchUser(Users user) {
		String qry="select * from Users u where u.name like (concat(:name,'%')) or ";
		return null;
	}

}
