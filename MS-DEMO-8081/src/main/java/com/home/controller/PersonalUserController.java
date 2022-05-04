package com.home.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.dto.PersonalUser;
import com.home.exception.UserDataAccessException;

@RequestMapping(value = "/personalUser")
public interface PersonalUserController {
	
	@GetMapping("/users")
	public List<PersonalUser> users();
	
	@GetMapping("/id/{id}")
	public ResponseEntity<PersonalUser> getUser(@PathVariable ("id") Integer id) throws UserDataAccessException;
	
	@PostMapping(value = "/user")
	public ResponseEntity<PersonalUser> addUser (@RequestBody PersonalUser user);

}
