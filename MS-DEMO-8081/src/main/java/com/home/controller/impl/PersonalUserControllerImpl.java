package com.home.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.home.controller.PersonalUserController;
import com.home.dto.PersonalUser;
import com.home.logic.PersonalUserLogic;

@RestController
public class PersonalUserControllerImpl implements PersonalUserController {

	@Autowired
	private PersonalUserLogic personalUserLogic;

	@Override
	public List<PersonalUser> users() {

		return personalUserLogic.users();
	}

}
