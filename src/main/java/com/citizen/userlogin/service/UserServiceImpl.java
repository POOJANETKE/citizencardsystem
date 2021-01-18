package com.citizen.userlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citizen.userlogin.dao.UserRepository;
import com.citizen.userlogin.entities.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired 
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	@Override
	public User getUserById(String uemailid) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailAddress(uemailid);
	}

}
