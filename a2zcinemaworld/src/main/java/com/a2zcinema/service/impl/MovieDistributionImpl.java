package com.a2zcinema.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.a2zcinema.dao.MovieDistributionDao;
import com.a2zcinema.model.MovieDistribution;
import com.a2zcinema.service.MovieDistributionService;
@Service
public class MovieDistributionImpl implements MovieDistributionService{

	@Autowired
	private MovieDistributionDao movieDao;
	@Override
	@Transactional(readOnly=true)
	public Object getAll() {
		// TODO Auto-generated method stub
		return movieDao.getAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Object getMovie(String name) {
		// TODO Auto-generated method stub
		return movieDao.getMovie(name);
	}
	
	
}
