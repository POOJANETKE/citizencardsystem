package com.citizen.userlogin.service;

import com.citizen.userlogin.entities.User;

public interface IUserService {

	public User saveUser(User user);

	public User getUserById(String uemailid);

}
