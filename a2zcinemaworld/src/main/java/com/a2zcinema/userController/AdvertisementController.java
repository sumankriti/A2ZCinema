package com.a2zcinema.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.a2zcinema.model.Advertisement;
import com.a2zcinema.model.Users;
import com.a2zcinema.service.AdvertisementService;

@RestController
public class AdvertisementController {
	@Autowired
	private AdvertisementService advertisementService;
	
	@GetMapping(value="/getAlladvertisement")
	public ResponseEntity<Advertisement> getAlladvertisement()
	{
		Object user=advertisementService.getAdvertisement();
		ResponseEntity response=new ResponseEntity<>(user,HttpStatus.OK);
		return response;
	}
	
	@RequestMapping(value = "/getAdvertisement", method = RequestMethod.GET)
	 public ResponseEntity<Object> getAdvertisement() {
		Object user =advertisementService.getAdvertisement();
	 

	 return new ResponseEntity<Object>(user, HttpStatus.OK);
	 }
	@RequestMapping(value = "/getCasting", method = RequestMethod.GET)
	 public ResponseEntity<Object> getCasting() {
		Object user =advertisementService.getCasting();
	 

	 return new ResponseEntity<Object>(user, HttpStatus.OK);
	 }
	
	

}
