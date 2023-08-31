package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Leave;


import jakarta.transaction.Transactional;

public interface LeaveRepo extends JpaRepository<Leave, Integer>{
	
	@Query(value="select * from leavetable where l_id=:e or leave_type=:lt",nativeQuery=true)
	public List<Leave> getLeaveInfo(@Param("e") int l_id,@Param("lt") String leaveType);
	
	@Modifying
	@Transactional
	@Query (value="delete from leavetable where l_id=:e ",nativeQuery=true)
	public int deleteLeaveInfo(@Param("e")int l_id);
	
	@Modifying
	@Transactional
	@Query(value="update leavetable set l_id=?1 where l_id=?2",nativeQuery=true)
	public int updateLeaveInfo(int newid,int oldid);


}
