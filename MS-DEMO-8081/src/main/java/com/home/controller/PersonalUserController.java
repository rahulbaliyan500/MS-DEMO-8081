package com.home.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.dto.PersonalUser;

@RequestMapping(value = "/personalUser")
public interface PersonalUserController {
	
	@GetMapping("/users")
	public List<PersonalUser> users();

}
