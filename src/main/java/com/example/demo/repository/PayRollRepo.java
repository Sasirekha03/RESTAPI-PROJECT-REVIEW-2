package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PayRoll;

public interface PayRollRepo extends JpaRepository<PayRoll, Integer>{

}
