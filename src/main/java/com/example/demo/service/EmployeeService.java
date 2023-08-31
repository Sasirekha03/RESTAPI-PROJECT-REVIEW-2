package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo er;
	
	// create the job vacancy
		public Employee saveinfo(Employee e)
		{
			return er.save(e);
		}
	    //read the record
		public List<Employee> showinfo()
		{
			return er.findAll();
		}
		
		// create array of records
		public List<Employee> savedetails(List<Employee> e)
		{
			return (List<Employee>)er.saveAll(e);
		}
		
		//search for profile using its id
		public Optional<Employee> showbyid(int empid)
		{
			return er.findById(empid);
		}
		//update profile using id 
		public String updateinfobyid(int empid,Employee e)
		{
			er.saveAndFlush(e);
			if(er.existsById(empid))
			{
				return "Updated successfully!";
			}
			else
			{
				return "Enter valid id";
			}
		}
		
		//delete when employee leaves the job
		public String deletepvid(int empid)
		{
			er.deleteById(empid);
			return "Deleted successfully";
		}
		
		public Employee saveempprofiledetails(Employee e)
		{
			return er.save(e);
		}
		
		public List<Employee> showempprofileinfo()
		{
			return er.findAll(); 
		}
		public List<Employee> saveempattnddetails(List<Employee> e)
		{
			return (List<Employee>)er.saveAll(e);
		}
		
		public List<Employee> showempattndinfo()
		{
			return er.findAll(); 
		}


}
