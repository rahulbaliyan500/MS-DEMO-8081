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
import com.home.repository.PersonalUserRepository;

@Service
public class PersonalUserLogicImpl implements PersonalUserLogic {

	@Autowired
	private PersonalUserDao personalUserDao;

	@Autowired
	PersonalUserRepository personalUserRepository;

	@Override
	public List<PersonalUser> users() {
		List<PersonalUser> personalUsers = new ArrayList<PersonalUser>();
		List<PersonalUserEntity> users = personalUserDao.users();

//		for (PersonalUserEntity user : users) {
//			PersonalUser pUser = new PersonalUser();
//			pUser.setId(user.getId());
//			pUser.setName(user.getName());
//			pUser.setAge(user.getAge());
//			findUsers.add(pUser);
//		}
		
		
//		users.forEach(x -> {
//			PersonalUser personalUser = new PersonalUser();
//			personalUser.setId(x.getId());
//			personalUser.setName(x.getName());
//			personalUser.setAge(x.getAge());
//			personalUsers.add(personalUser);
//
//		});

		Iterator<PersonalUserEntity> itr = users.iterator();
		while (itr.hasNext()) {
			PersonalUserEntity personalUserEntity = itr.next();
			PersonalUser personalUser = new PersonalUser();
			personalUser.setId(personalUserEntity.getId());
			personalUser.setName(personalUserEntity.getName());
			personalUser.setAge(personalUserEntity.getAge());
			personalUsers.add(personalUser);
		}

		return personalUsers;
	}

}
