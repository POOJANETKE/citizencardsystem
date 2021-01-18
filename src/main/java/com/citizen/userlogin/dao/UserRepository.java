package com.citizen.userlogin.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.citizen.userlogin.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User getUserById(Long id);
	
	@Query(value = "SELECT * FROM USERS WHERE USERMAIL = ?1", nativeQuery = true)
	public User findByEmailAddress(String emailAddress);

}
