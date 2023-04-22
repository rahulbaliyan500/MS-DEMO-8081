package com.home.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.home.controller.PersonalUserController;
import com.home.dto.PersonalUser;
import com.home.exception.UserDataAccessException;
import com.home.logic.PersonalUserLogic;

@RestController
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false")
public class PersonalUserControllerImpl implements PersonalUserController {

	@Autowired
	private PersonalUserLogic personalUserLogic;

	@Override
	public List<PersonalUser> users() {
		return personalUserLogic.users();
	}

	@Override
	public ResponseEntity<PersonalUser> getUser(Integer id) throws UserDataAccessException {
		PersonalUser user = personalUserLogic.getUser(id)
				.orElseThrow(() -> new UserDataAccessException("UserDataAccessException : ","Not Found Exception Coming : "));
		return ResponseEntity.ok().body(user);
	}

	@Override
	public ResponseEntity<PersonalUser> addUser(PersonalUser user) {
		personalUserLogic.addUser(user);
		return null;
	}

}
