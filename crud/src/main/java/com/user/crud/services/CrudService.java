package com.user.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.crud.model.User;
import com.user.crud.model.flight;
import com.user.crud.model.reserv;
import com.user.crud.repo.CrudRepo;
import com.user.crud.repo.CrudRepof;
import com.user.crud.repo.CrudRepov;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;
	public List<User> fetchuserList(){
		return repo.findAll();
	}

	@Autowired
	private CrudRepof repof;
	public List<flight> fetchflightList(){
		return repof.findAll();
	}
	
	@Autowired
	private CrudRepov repov;
	public List<reserv> fetchreservList(){
		return repov.findAll();
	}
	
	
	public reserv saveReservToDB(reserv resv) {
		return repov.save(resv);
	}
	
	public User saveUserToDB(User user) {
		return repo.save(user);
	}
	
}
