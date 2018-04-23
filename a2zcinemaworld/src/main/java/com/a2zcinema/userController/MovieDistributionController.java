package com.a2zcinema.userController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.a2zcinema.model.MovieDistribution;
import com.a2zcinema.model.Users;
import com.a2zcinema.service.MovieDistributionService;

@RestController
public class MovieDistributionController {
	@Autowired
	private MovieDistributionService movieService;
	
	@GetMapping(value="/getAll")
	public ResponseEntity<Object> getAll(){
		Object user =movieService.getAll();
		ResponseEntity<Object> response=new ResponseEntity<>(user,HttpStatus.OK);
		return response;
	}
	@RequestMapping(value = "/getMovie/{name}", method = RequestMethod.GET)
	 public ResponseEntity<Object> getMovie(@PathVariable("name") String name) {
	 Object movie=movieService.getMovie(name);
	 ResponseEntity<Object> response=new ResponseEntity<>(movie,HttpStatus.OK);

	 return response;
	 }
}
