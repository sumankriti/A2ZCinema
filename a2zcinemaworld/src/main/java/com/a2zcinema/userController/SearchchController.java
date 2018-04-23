package com.a2zcinema.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.a2zcinema.service.SearchUserService;
import com.a2zcinema.service.UserService;

@RestController
public class SearchchController {
	
	@Autowired
	private SearchUserService userService;
	
	@RequestMapping(value = "/searchUser/{name}", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Object> searchUser(@PathVariable("name") String name) {
		
	 Object user=userService.searchUser(name);
	 ResponseEntity<Object> response=new ResponseEntity<>(user,HttpStatus.OK);
	 return response;
	 }

}
