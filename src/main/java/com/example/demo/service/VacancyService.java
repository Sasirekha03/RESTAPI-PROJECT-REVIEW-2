package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.model.Vacancy;
import com.example.demo.repository.VacancyRepo;

@Service
public class VacancyService {
	
	@Autowired
	VacancyRepo vr;
	
	// create the job vacancy
	public Vacancy saveinfo(Vacancy v)
	{
		return vr.save(v);
	}
    //read the record
	public List<Vacancy> showinfo()
	{
		return vr.findAll();
	}
	
	// create array of records
	public List<Vacancy> savedetails(List<Vacancy> v)
	{
		return (List<Vacancy>)vr.saveAll(v);
	}
	
	
	//search for companies using its id
	public Optional<Vacancy> showbyid(int id)
	{
		return vr.findById(id);
	}
	
	//delete when there are no vacancies
	public String deletepvid(int id)
	{
		vr.deleteById(id);
		return "Better Luck next Time";
	}
	
	//SORTED PAGING 
	public List<Vacancy> getbysortedpage(int pgno,int pgsize,String field)
	{
		Page<Vacancy> p =vr.findAll(PageRequest.of(pgno, pgsize, Sort.by(field).descending()));
		return p.getContent();
	} 

	public List<Vacancy> showempvacancyinfo()
	{
		return vr.findAll(); 
	}
}
