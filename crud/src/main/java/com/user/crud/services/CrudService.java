package com.user.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.crud.model.User;
import com.user.crud.repo.CrudRepo;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;
	public List<User> fetchuserList(){
		return repo.findAll();
	}

}
