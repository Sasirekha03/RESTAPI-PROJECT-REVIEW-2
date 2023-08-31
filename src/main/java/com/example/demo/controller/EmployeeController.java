package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("addemployee")
	public Employee add(@RequestBody Employee e)
	{
		return es.saveinfo(e);
	}
	
	//to store n profiles *temporary*
	@PostMapping("addnemployee")
	public List<Employee> addndetails(@RequestBody List<Employee> e)
	{
		return es.savedetails(e);
	}
	
	@GetMapping("showemployeedetails")
    public List<Employee> show()
    {
    	return es.showinfo();
    }
	@GetMapping("empshowbyid/{empid}")
	public Optional<Employee> showid(@PathVariable int empid)
	{
		return es.showbyid(empid);
	}
	@PutMapping("empupdatebyid/{empid}")
	public String modifybyid(@PathVariable int empid,@RequestBody Employee e )
	{
		return es.updateinfobyid(empid, e);
	}
	@DeleteMapping("empdelid/{empid}")
	public String deleteinfo(@PathVariable int empid)
	{
		es.deletepvid(empid);
		return "Removed successfully";
	}
	
	@PostMapping("addnempprofile")
	public Employee addemprofile(@RequestBody Employee e)
	{
		return es.saveempprofiledetails(e);
	}
	@GetMapping("showempprofile")
    public List<Employee> showempprofile()
    {
    	return es.showempprofileinfo();
    }
	@PostMapping("addnempattnd")
	public List<Employee> addemattendance(@RequestBody List<Employee> e)
	{
		return es.saveempattnddetails(e);
	}
	@GetMapping("showempattnd")
	public List<Employee> showempattendance()
	{
		return es.showempattndinfo();
	}

}
