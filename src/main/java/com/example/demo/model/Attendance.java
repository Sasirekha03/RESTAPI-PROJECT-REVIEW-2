package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attendance {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int a_id;
	    
	    private int empid;
	    private LocalDate attendanceDate;
	    private LocalTime checkInTime;
	    private LocalTime checkOutTime;
		public Attendance() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Attendance(int a_id, int empid, LocalDate attendanceDate, LocalTime checkInTime,
				LocalTime checkOutTime) {
			super();
			this.a_id = a_id;
			this.empid = empid;
			this.attendanceDate = attendanceDate;
			this.checkInTime = checkInTime;
			this.checkOutTime = checkOutTime;
		}
		public int getA_id() {
			return a_id;
		}
		public void setA_id(int a_id) {
			this.a_id = a_id;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public LocalDate getAttendanceDate() {
			return attendanceDate;
		}
		public void setAttendanceDate(LocalDate attendanceDate) {
			this.attendanceDate = attendanceDate;
		}
		public LocalTime getCheckInTime() {
			return checkInTime;
		}
		public void setCheckInTime(LocalTime checkInTime) {
			this.checkInTime = checkInTime;
		}
		public LocalTime getCheckOutTime() {
			return checkOutTime;
		}
		public void setCheckOutTime(LocalTime checkOutTime) {
			this.checkOutTime = checkOutTime;
		}
		
		
}
