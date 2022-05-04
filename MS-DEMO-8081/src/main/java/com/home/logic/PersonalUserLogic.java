package com.home.logic;

import java.util.List;
import java.util.Optional;

import com.home.dto.PersonalUser;

public interface PersonalUserLogic {

	List<PersonalUser> users();

	void addUser(PersonalUser user);

	Optional<PersonalUser>  getUser(Integer id);

}
