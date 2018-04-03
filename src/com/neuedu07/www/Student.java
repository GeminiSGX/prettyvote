package com.neuedu07.www;

public class Student {
	int studentid;
	String name;
	String sex;
	int age;
	double midterm;
	double finalexam;
	public Student(){
		
	}
	public Student(int studentid,String name,String sex,int age,double midterm,double finalexam){
		super();
		this.studentid=studentid;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.midterm=midterm;
		this.finalexam=finalexam;
	}
	public double total(){
		double total;
		total=midterm+finalexam;
		return total;
	}
}
