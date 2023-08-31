package com.example.demo.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="payroll")
public class PayRoll {
	
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pr_id;
    //private int empid;
    private String name;
    private LocalDate payDate;
    private double baseSalary;  // Base salary before any deductions or bonuses
	@SuppressWarnings("unused")
	private double deductions;  // Total deductions (taxes, benefits, etc.)
	@SuppressWarnings("unused")
    private double bonuses;     // Additional bonuses or incentives
    //private double netSalary;    // Net salary after deductions and bonuses
	
    public PayRoll() {
    	super();
    	// TODO Auto-generated constructor stub
    }

    public PayRoll(int pr_id, String name, LocalDate payDate,double baseSalary) {
		super();
		this.pr_id = pr_id;
		this.name = name;
		this.payDate = payDate;
		this.baseSalary = baseSalary;
		//this.deductions = deductions;
		//this.bonuses = bonuses;
		//this.netSalary = netSalary;
	}

	public int getId() {
		return pr_id;
	}

	public void setId(int pr_id) {
		this.pr_id = pr_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getPayDate() {
		return payDate;
	}

	public void setPayDate(LocalDate payDate) {
		this.payDate = payDate;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getDeductions() {
		return (baseSalary*0.15);
	}
	/*public void setDeductions(double deductions) {
		this.deductions = deductions;
	}*/
	

	public double getBonuses() {
		return baseSalary*0.10;
	}
	
	
	/*public void setBonuses(double bonuses) {
		this.bonuses = bonuses;
	}*/

	//calculation of netsalary taking attendance into consideration
	/*public double getNetSalary() {
		
		return (baseSalary-deductions+bonuses);
	}*/

	
    
    
}
