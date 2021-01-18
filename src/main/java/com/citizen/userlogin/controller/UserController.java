package com.citizen.userlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.citizen.userlogin.entities.User;
import com.citizen.userlogin.service.IUserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping(path = "/getUser", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserByEmail(@RequestParam("email") String email){
		
		User user = userService.getUserById(email);
		System.out.println("user : "+user.getUemailid());
		return new ResponseEntity<User>(user, HttpStatus.OK);
	
	}
	
	@PostMapping("/register")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<String> saveUser(@RequestBody User newUser ) {
		
		User user = userService.saveUser(newUser);
		String uemailid = user.getUemailid();
		return new ResponseEntity<String>("User with:" + uemailid + "registered successfully", HttpStatus.OK);
		
	}
	
	/*
	 * @GetMapping(value="{usermail}") public ResponseEntity<User>
	 * getUserById(@PathVariable String usermail) {
	 * 
	 * User user=userService.getUserById(usermail); return new
	 * ResponseEntity<>(user,HttpStatus.OK);
	 * 
	 * }
	 */

}
