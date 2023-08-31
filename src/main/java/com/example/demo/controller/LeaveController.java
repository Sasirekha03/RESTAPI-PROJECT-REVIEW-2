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
import com.example.demo.model.Leave;
import com.example.demo.service.LeaveService;

@RestController
public class LeaveController {
	
	@Autowired
	LeaveService ls;
	
	@PostMapping("addlemp")
	public Leave add(@RequestBody Leave l)
	{
		return ls.saveinfo(l);
	}
	
	//to store n records 
	@PostMapping("addnlemp")
	public List<Leave> addndetails(@RequestBody List<Leave> l)
	{
		return ls.savedetails(l);
	}
	
	@GetMapping("showleaverecords")
    public List<Leave> show()
    {
    	return ls.showinfo();
    }
	@GetMapping("showbylid/{l_id}")
	public Optional<Leave> showid(@PathVariable int l_id)
	{
		return ls.showbyid(l_id);
	}
	@DeleteMapping("dellid/{l_id}")
	public String deleteinfo(@PathVariable int l_id)
	{
		ls.deletepvid(l_id);
		return "Removed successfully";
	}
	//SELECT
	@GetMapping("showquery/{l_id}/{leaveType}")
	public List<Leave> showempdetails(@PathVariable int l_id,@PathVariable String leaveType)
	{
		return ls.getemp(l_id, leaveType);
	}
	//DELETE
	@DeleteMapping("deletequery/{l_id}")
	public String delempdetails(@PathVariable int l_id)
	{
		return ls.delemp(l_id)+"deleted";
	}
	//UPDATE
	@PutMapping("updatequery/{newid}/{oldid}")
	public String updateempdetails(@PathVariable int newid,@PathVariable int oldid)
	{
		return ls.updateemp(newid, oldid)+"Updated";
	}
}
