package com.a2zcinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.a2zcinema.dao.AdvertisementDao;
import com.a2zcinema.model.Advertisement;
import com.a2zcinema.service.AdvertisementService;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

	@Autowired
	private AdvertisementDao advertisement;
	@Override
	@Transactional(readOnly=true)
	public Object getAdvertisement() {
		// TODO Auto-generated method stub
		return advertisement.getAdvertisement();
	}
	@Override
	@Transactional(readOnly=true)
	public Object getCasting() {
		// TODO Auto-generated method stub
		return advertisement.getCasting();
	}
	
	
}
