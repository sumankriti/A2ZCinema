package com.a2zcinema.daoImpl;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.a2zcinema.dao.MovieDistributionDao;
import com.a2zcinema.model.MovieDistribution;
import com.a2zcinema.model.Users;

@Repository
public class MovieDistributionDaoImpl implements MovieDistributionDao {

	@Autowired
	private SessionFactory sessionFac;
	@Override
	public Object getAll() {
		String qry="select * from movie_distribution";
		Object user=this.sessionFac.getCurrentSession().createSQLQuery(qry).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		return user;
	}
	@Override
	public Object getMovie(String theater_name) {
		/*String qry="select * from movie_distribution m where m.theater_name=:theater_name or m.theater_name like 'name%'";*/
				String qry="select * from  movie_distribution m where m.theater_name like (concat(:theater_name,'%'))";
		Object movie=this.sessionFac.getCurrentSession().createSQLQuery(qry).
				setParameter("theater_name",theater_name).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		return movie;
	}
	
	

}
