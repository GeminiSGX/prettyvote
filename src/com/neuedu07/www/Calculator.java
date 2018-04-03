package com.neuedu07.www;

public class Calculator extends Student{
	double operate;
	double writing;
	public Calculator(){
		
	}
	public Calculator(int studentid,String name,String sex,int age,double midterm,double finalexam,double operate,double writing){
		super(studentid,name,sex,age,midterm,finalexam);
		this.operate=operate;
		this.writing=writing;
	}
	public double total(){
		double total;
		total=operate*0.4+writing*0.2+midterm*0.2+finalexam*0.2;
		return total;
	}
}