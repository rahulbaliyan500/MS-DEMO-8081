package com.home.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.dao.PersonalUserDao;
import com.home.entity.PersonalUserEntity;
import com.home.repository.PersonalUserRepository;

@Repository
public class PersonalUserDaoImpl implements PersonalUserDao {

	@Autowired
	private PersonalUserRepository personalUserRepository;

	@Override
	public List<PersonalUserEntity> users() {
		return personalUserRepository.findAll();
	}

}
