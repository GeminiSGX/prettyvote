package com.neuedu07.www;

public class English extends Student{
		double lecture;
		public English(){
			
		}
		public English(int studentid,String name,String sex,int age,double midterm,double finalexam,double lecture){
			super(studentid,name,sex,age,midterm,finalexam);
			this.lecture=lecture;
		}
		public double total(){
			double total;
			total=lecture*0.5+finalexam*0.25+midterm*0.25;
			return total;
	}
}
