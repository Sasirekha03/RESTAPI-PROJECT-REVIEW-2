package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Vacancy {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int v_id;
	private int empid;
	private String companyName;
	private String location;
	private String role;
	private String jobType;
	private String workMode;
	private String education;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_empid")
	private List<Employee> applicants = new ArrayList<>();
	
	
	public Vacancy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vacancy(int v_id, int empid, String companyName, String location, String role, String jobType, String workMode,
			String education, List<Employee> applicants) {
		super();
		this.v_id = v_id;
		this.empid = empid;
		this.companyName = companyName;
		this.location = location;
		this.role = role;
		this.jobType = jobType;
		this.workMode = workMode;
		this.education = education;
		this.applicants = applicants;
	}
	public int getId() {
		return v_id;
	}
	public void setId(int v_id) {
		this.v_id = v_id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getWorkMode() {
		return workMode;
	}
	public void setWorkMode(String workMode) {
		this.workMode = workMode;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public List<Employee> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<Employee> applicants) {
		this.applicants = applicants;
	}
	
	
}
