package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Vacancy;

public interface VacancyRepo extends JpaRepository<Vacancy, Integer>{

}
