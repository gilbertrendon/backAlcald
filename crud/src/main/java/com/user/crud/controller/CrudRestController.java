package com.user.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.crud.model.User;
import com.user.crud.model.flight;
import com.user.crud.model.reserv;
import com.user.crud.services.CrudService;

@RestController
public class CrudRestController {
	@Autowired
	private CrudService service;
	
	@GetMapping ("/getuserlist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<User> fetchUserList(){
		List<User> users = new ArrayList<User>();
		users = service.fetchuserList();
		return users;
	}
	
	
	//For the flights
	@GetMapping("/getflightlist")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<flight> fetchFlights(){
    	List<flight> flights = new ArrayList<flight>();
    	flights = service.fetchflightList();
    	return flights;
    }
    
    //fetchreservList
    @GetMapping("/fetchreservlist")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<reserv> fetchReservs(){
    	List<reserv> reservs = new ArrayList<reserv>();
    	reservs = service.fetchreservList();
    	return reservs;
    }
    

    
    @PostMapping("/addreserv")
    public reserv saveReserv(@RequestBody reserv resv) {
    	return service.saveReservToDB(resv);
    }
    
    
	
}
