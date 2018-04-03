package com.neuedu07.www;

public class SalesEmployee extends ColaEmployee{
	double monthlysales;
	double royaltyrate;
	public SalesEmployee(){
		
	}
	public SalesEmployee(String name,int birth,double monthlysales,double royaltyrate){
		super(name,birth);
		this.monthlysales=monthlysales;
		this.royaltyrate=royaltyrate;
	}
	public double getSalary(int month){
		double salary=0;
		salary=monthlysales*royaltyrate+salary;
		return salary;
	}
}
