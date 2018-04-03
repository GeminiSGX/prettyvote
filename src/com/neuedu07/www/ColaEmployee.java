package com.neuedu07.www;

public class ColaEmployee {
	String name;
	int birth;
	public ColaEmployee(){
		
	}
	public ColaEmployee(String name,int birth){
		super();
		this.name=name;
		this.birth=birth;
	}
	public double getSalary(int month){
		double salary=0;
		if(month==birth){
			salary=salary+100;
			return salary;
		}else{
			return salary;			
		}
	}
}
