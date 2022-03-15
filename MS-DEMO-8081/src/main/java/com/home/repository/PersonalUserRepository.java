package com.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.entity.PersonalUserEntity;

public interface PersonalUserRepository extends JpaRepository<PersonalUserEntity, Integer> {

}
