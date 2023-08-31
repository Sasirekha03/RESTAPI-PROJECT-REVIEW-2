package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.PayRoll;
import com.example.demo.repository.PayRollRepo;


@Service
public class PayRollService {
	
	@Autowired
	PayRollRepo prr;
	
	// create the job vacancy
		public PayRoll saveinfo(PayRoll pr)
		{
			return prr.save(pr);
		}
	    //read the record
		public List<PayRoll> showinfo()
		{
			return prr.findAll();
		}
		
		// create array of records
		public List<PayRoll> savedetails(List<PayRoll> pr)
		{
			return (List<PayRoll>)prr.saveAll(pr);
		}
		
		//search for the employee using id
		public Optional<PayRoll> showbyid(int id)
		{
			return prr.findById(id);
		}
		
		//delete salary details
		public String deletepvid(int id)
		{
			prr.deleteById(id);
			return "Deleted successfully";
		}
		//update the salary details
		public String updateinfobyid(int id,PayRoll pr)
		{
			prr.saveAndFlush(pr);
			if(prr.existsById(id))
			{
				return "Updated successfully!";
			}
			else
			{
				return "Enter valid id";
			}
		}

}
