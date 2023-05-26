package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepo;

@Service
public class UserServiceImplement implements UserService{

	@Autowired
	private UserRepo repo;
	@Override
	public void registerUser(User user) {
		repo.save(user);
		
	}

}
