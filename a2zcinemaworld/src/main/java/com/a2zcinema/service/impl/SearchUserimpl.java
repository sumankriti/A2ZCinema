package com.a2zcinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.a2zcinema.dao.SearchDao;
import com.a2zcinema.service.SearchUserService;
@Service
public class SearchUserimpl implements SearchUserService {
   @Autowired
   private SearchDao search;
	@Override
	@Transactional(readOnly=true)
	public Object searchUser(String name) {
		// TODO Auto-generated method stub
		return search.searchUser(name);
	}

}
