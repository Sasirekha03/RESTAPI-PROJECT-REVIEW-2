package com.example.demo.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="leavetable")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int l_id;

   /* @ManyToOne
    @JoinColumn(name = "empid")
    private Employee employee;
    */
    private int empid;
    private LocalDate startDate;
    private LocalDate endDate;
    private String leaveType;
    private String status;
    private String reason;
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leave(int l_id, int empid, LocalDate startDate, LocalDate endDate, String leaveType, String status,
			String reason) {
		super();
		this.l_id = l_id;
		this.empid = empid;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveType = leaveType;
		this.status = status;
		this.reason = reason;
	}
	public int getId() {
		return l_id;
	}
	public void setId(int l_id) {
		this.l_id = l_id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
    
    
}






