package com.example.demo.model;

import java.time.LocalDate;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	    private int empid;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String phoneNumber;
	    private LocalDate hireDate;
	    private String jobTitle;
	    private Double salary;

	    @OneToOne( cascade = CascadeType.ALL)
	    @JoinColumn(name="fk_empid")
	    private PersonalProfile profile;
	    
	    @OneToMany(cascade= CascadeType.ALL)
		@JoinColumn(name="fk_empid")
		private List<Attendance> attendances;
	    
	   /* @OneToMany( cascade = CascadeType.ALL)
	    @JoinColumn(name="fk_empid")
	    private List<Attendance> attendances = new ArrayList<>();*/

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(int empid, String firstName, String lastName, String email, String phoneNumber, LocalDate hireDate,
				String jobTitle, Double salary, PersonalProfile profile, List<Attendance> attendances) {
			super();
			this.empid = empid;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.hireDate = hireDate;
			this.jobTitle = jobTitle;
			this.salary = salary;
			this.profile = profile;
			this.attendances = attendances;
		}

		public int getId() {
			return empid;
		}

		public void setId(int empid) {
			this.empid = empid;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public LocalDate getHireDate() {
			return hireDate;
		}

		public void setHireDate(LocalDate hireDate) {
			this.hireDate = hireDate;
		}

		public String getJobTitle() {
			return jobTitle;
		}

		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		public PersonalProfile getProfile() {
			return profile;
		}

		public void setProfile(PersonalProfile profile) {
			this.profile = profile;
		}

		public List<Attendance> getAttendances() {
			return attendances;
		}

		public void setAttendances(List<Attendance> attendances) {
			this.attendances = attendances;
		}

		
	    
	}

	
	
	


