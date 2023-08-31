package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PersonalProfile;
import com.example.demo.repository.PersonalProfileRepo;

@Service
public class PersonalProfileService {
	
	@Autowired
	PersonalProfileRepo ppr;
	
	// create the job vacancy
		public PersonalProfile saveinfo(PersonalProfile pp)
		{
			return ppr.save(pp);
		}
	    //read the record
		public List<PersonalProfile> showinfo()
		{
			return ppr.findAll();
		}
		
		// create array of records
		public List<PersonalProfile> savedetails(List<PersonalProfile> pp)
		{
			return (List<PersonalProfile>)ppr.saveAll(pp);
		}
		
		//search for profile using its id
		public Optional<PersonalProfile> showbyid(int empid)
		{
			return ppr.findById(empid);
		}
		//update profile using id 
		public String updateinfobyid(int empid,PersonalProfile pp)
		{
			ppr.saveAndFlush(pp);
			if(ppr.existsById(empid))
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
			ppr.deleteById(empid);
			return "Deleted successfully";
		}

}
