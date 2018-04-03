package com.neuedu07.www;

public class SalariedEmployee extends ColaEmployee{
	double monthsalary;
	public SalariedEmployee(){
		
	}
	public SalariedEmployee(String name,int birth,double monthsalary){
		super(name,birth);
		this.monthsalary=monthsalary;
	}
	public double getMonthsalary(int month){
		double salary=0;
		if(month==birth){
			salary=monthsalary+100;
			return monthsalary;
		}else{
			return monthsalary;
		}
	}
}
