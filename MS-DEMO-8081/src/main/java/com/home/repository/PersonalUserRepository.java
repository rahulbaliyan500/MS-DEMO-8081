package com.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.entity.PersonalUserEntity;

@Repository
public interface PersonalUserRepository extends JpaRepository<PersonalUserEntity, Integer> {

}
