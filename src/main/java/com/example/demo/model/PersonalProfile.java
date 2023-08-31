package com.example.demo.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PersonalProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pp_id;
	private int empid;
	private String name;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	private long mobileNo;
	private String mailId;
	private long aadharNo;
	private String bio;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Employee employee;

	public PersonalProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalProfile(int pp_id, int empid, String name, Date dateOfBirth, long mobileNo, String mailId,
			long aadharNo, String bio, Employee employee) {
		super();
		this.pp_id = pp_id;
		this.empid = empid;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.mobileNo = mobileNo;
		this.mailId = mailId;
		this.aadharNo = aadharNo;
		this.bio = bio;
		this.employee = employee;
	}

	public int getPp_id() {
		return pp_id;
	}

	public void setPp_id(int pp_id) {
		this.pp_id = pp_id;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
