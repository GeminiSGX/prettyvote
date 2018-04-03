package com.neuedu07.www;

public class Literature extends Student{
	double lecture;
	double works;
	public Literature(){
		
	}
	public Literature(int studentid,String name,String sex,int age,double midterm,double finalexam,double lecture,double works){
		super(studentid,name,sex,age,midterm,finalexam);
		this.lecture=lecture;
		this.works=works;
	}
	public double total(){
		double total;
		total=lecture*0.35+works*0.35+midterm*0.15+finalexam*0.15;
		return total;
	}
}
