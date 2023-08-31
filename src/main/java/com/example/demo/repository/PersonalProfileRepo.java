package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PersonalProfile;


public interface PersonalProfileRepo extends JpaRepository<PersonalProfile, Integer>{

}


