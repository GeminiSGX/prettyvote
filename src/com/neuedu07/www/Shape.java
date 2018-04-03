package com.neuedu07.www;

public abstract class Shape {
	double area;
	double per;
	String color;
	public Shape(){
		
	}
	public Shape(double area,double per,String color){
		super();
		this.area=area;
		this.per=per;
		this.color=color;
	}
	
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public double getArea(){
//		return area;
//	}
//	public void setArea(double area) {
//		this.area = area;
//	}
//	public double getPer(){
//		return per;
//	}
//	public void setPer(double per) {
//		this.per = per;
//	}
	abstract double getArea();
	abstract double getPer();
	String color(){
		System.out.println();
		return color;
	}
	abstract void showAll();
}
