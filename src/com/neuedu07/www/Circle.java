package com.neuedu07.www;

public class Circle extends Shape{
	double a=3.14f;
	double radiu;
	public Circle(){
		
	}
	public Circle(double radiu,String color){
		super();
		this.radiu=radiu;
		this.color=color;
	}
	public double getArea(){
		return a*radiu*radiu;
	}
	public double getPer(){
		return 2*a*radiu;
	}
	public void showAll(){
		System.out.println(getArea());
		System.out.println(getPer());
	}
	public static void main(String argsp[]){
		Circle b=new Circle(5.2,"red");
		b.showAll();
	}
}
