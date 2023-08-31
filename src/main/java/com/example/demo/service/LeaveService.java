package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Leave;
import com.example.demo.repository.LeaveRepo;

@Service
public class LeaveService {

	
	@Autowired
	LeaveRepo lr;
	
	// create 
	public Leave saveinfo(Leave v)
	{
		return lr.save(v);
	}
    //read the record
	public List<Leave> showinfo()
	{
		return lr.findAll();
	}
	
	// create array of records
	public List<Leave> savedetails(List<Leave> v)
	{
		return (List<Leave>)lr.saveAll(v);
	}
	
	//search for employees using its id
	public Optional<Leave> showbyid(int id)
	{
		return lr.findById(id);
	}
	
	//delete 
	public String deletepvid(int id)
	{
		lr.deleteById(id);
		return "Deleted";
	}
	
	    //SELECT
		public List<Leave> getemp(int i,String lt)
		{
			return lr.getLeaveInfo(i, lt);
		}
		//DELETE
		public int delemp(int id)
		{
			return lr.deleteLeaveInfo(id);
		}
		//UPDATE
		public int updateemp(int id,int id1) 
		{
			return lr.updateLeaveInfo(id, id1);
		}
	
	
}
