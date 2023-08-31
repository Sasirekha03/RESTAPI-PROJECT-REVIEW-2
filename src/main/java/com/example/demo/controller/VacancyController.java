package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vacancy;
import com.example.demo.service.VacancyService;

@RestController
public class VacancyController {
	
	@Autowired
	VacancyService vs;
	
	@PostMapping("addjob")
	public Vacancy add(@RequestBody Vacancy v)
	{
		return vs.saveinfo(v);
	}
	
	//to store n records 
	@PostMapping("addnjob")
	public List<Vacancy> addndetails(@RequestBody List<Vacancy> v)
	{
		return vs.savedetails(v);
	}
	
	@GetMapping("showvacancies")
    public List<Vacancy> show()
    {
    	return vs.showinfo();
    }
	@GetMapping("showbyid/{v_id}")
	public Optional<Vacancy> showid(@PathVariable int v_id)
	{
		return vs.showbyid(v_id);
	}
	@DeleteMapping("delid/{v_id}")
	public String deleteinfo(@PathVariable int v_id)
	{
		vs.deletepvid(v_id);
		return "Removed successfully";
	}
	//for sorted order paging 
	@GetMapping("sortedpaging/{pageno}/{pagesize}/{field}")
	public List<Vacancy> showsotedpageinfo(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String field)
	{
		return vs.getbysortedpage(pageno, pagesize,field);
	}
	
	@GetMapping("showempvacancydetails")
    public List<Vacancy> showempvacancy()
    {
    	return vs.showempvacancyinfo();
    }	
		

}
