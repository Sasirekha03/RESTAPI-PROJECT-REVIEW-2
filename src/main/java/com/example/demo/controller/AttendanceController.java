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

import com.example.demo.model.Attendance;
import com.example.demo.service.AttendanceService;


@RestController
public class AttendanceController {
	
	@Autowired
	AttendanceService as;
	
	@PostMapping("addattnd")
	public Attendance add(@RequestBody Attendance a)
	{
		return as.saveinfo(a);
	}
	
	//to store n profiles *temporary*
	@PostMapping("addnattnd")
	public List<Attendance> addndetails(@RequestBody List<Attendance> a)
	{
		return as.savedetails(a);
	}
	
	@GetMapping("showattendancerecord")
    public List<Attendance> show()
    {
    	return as.showinfo();
    }
	@GetMapping("attndshowbyid/{a_id}")
	public Optional<Attendance> showid(@PathVariable int a_id)
	{
		return as.showbyid(a_id);
	}
	@PutMapping("attndupdatebyid/{a_id}")
	public String modifybyid(@PathVariable int a_id,@RequestBody Attendance a )
	{
		return as.updateinfobyid(a_id, a);
	}
	@DeleteMapping("attnddelid/{a_id}")
	public String deleteinfo(@PathVariable int a_id)
	{
		as.deletepvid(a_id);
		return "Removed successfully";
	}

}
