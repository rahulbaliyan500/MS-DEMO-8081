package com.home.logic.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.dao.PersonalUserDao;
import com.home.dto.PersonalUser;
import com.home.entity.PersonalUserEntity;
import com.home.logic.PersonalUserLogic;

@Service
public class PersonalUserLogicImpl implements PersonalUserLogic {

	@Autowired
	private PersonalUserDao personalUserDao;

	@Override
	public List<PersonalUser> users() {
		List<PersonalUser> findUsers = new ArrayList<PersonalUser>();
		List<PersonalUserEntity> users = personalUserDao.users();
		for (PersonalUserEntity user : users) {
			PersonalUser pUser = new PersonalUser();
			pUser.setId(user.getId());
			pUser.setName(user.getName());
			pUser.setAge(user.getAge());
			findUsers.add(pUser);
		}

		return findUsers;
	}

}
