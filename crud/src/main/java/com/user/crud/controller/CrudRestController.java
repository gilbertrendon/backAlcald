package com.user.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.crud.model.User;
import com.user.crud.model.flight;
import com.user.crud.services.CrudService;

@RestController
public class CrudRestController {
	@Autowired
	private CrudService service;
	
	@GetMapping ("/getuserlist")
	public List<User> fetchUserList(){
		List<User> users = new ArrayList<User>();
		users = service.fetchuserList();
		return users;
	}
	
	
	//For the flights
	@GetMapping("/getflightlist")
    public List<flight> fetchFlights(){
    	List<flight> flights = new ArrayList<flight>();
    	flights = service.fetchflightList();
    	return flights;
    }
	
}
