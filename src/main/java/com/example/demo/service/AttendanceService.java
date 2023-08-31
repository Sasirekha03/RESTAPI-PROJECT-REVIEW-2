package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Attendance;
import com.example.demo.repository.AttendanceRepo;


@Service
public class AttendanceService {

	@Autowired
	AttendanceRepo ar;
	
	// create the job vacancy
		public Attendance saveinfo(Attendance a)
		{
			return ar.save(a);
		}
	    //read the record
		public List<Attendance> showinfo()
		{
			return ar.findAll();
		}
		
		// create array of records
		public List<Attendance> savedetails(List<Attendance> a)
		{
			return (List<Attendance>)ar.saveAll(a);
		}
		
		//search for profile using its id
		public Optional<Attendance> showbyid(int a_id)
		{
			return ar.findById(a_id);
		}
		//update profile using id 
		public String updateinfobyid(int a_id,Attendance a)
		{
			ar.saveAndFlush(a);
			if(ar.existsById(a_id))
			{
				return "Updated successfully!";
			}
			else
			{
				return "Enter valid id";
			}
		}
		
		//delete when employee leaves the job
		public String deletepvid(int a_id)
		{
			ar.deleteById(a_id);
			return "Deleted successfully";
		}
}
