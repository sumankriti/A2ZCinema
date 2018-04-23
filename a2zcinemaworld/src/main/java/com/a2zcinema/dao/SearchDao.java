package com.a2zcinema.dao;

import com.a2zcinema.model.Users;

public interface SearchDao {
	
	public Object searchUser(String name);
	
	public Users searchUser(Users user);

}
