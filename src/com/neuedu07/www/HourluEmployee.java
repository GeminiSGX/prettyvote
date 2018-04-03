package com.neuedu07.www;

public class HourluEmployee extends ColaEmployee{
	double hourlysalary;
	int hour;
	public HourluEmployee(){
		
	}
	public HourluEmployee(String name,int birth,double hourlysalary,int hour){
		super(name,birth);
		this.hourlysalary=hourlysalary;
		this.hour=hour;
	}
	public double getHourlysalary(int month){
		double salary=0;
		if(hour>160){
			salary=(hour-160)*1.5*hourlysalary+160*hourlysalary;
		}else if(hour>160 && month==birth){
			salary=(hour-160)*1.5*hourlysalary+160*hourlysalary+100;
		}else if(hour<160){
			salary=160*hourlysalary;
		}else if(hour<60 && month==birth){
			salary=160*hourlysalary+100;
		}
		return hourlysalary;
	}
}
