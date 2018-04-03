package com.neuedu07.www;

public class Rectangle extends Shape{
	double width;
	double height;
	public Rectangle(){
		
	}
	public Rectangle(double width,double height,String color){
		super();
		this.width=width;
		this.height=height;
		this.color=color;
	}
	public double getArea(){
		return width*height;
	}
	public double getPer(){
		return (width+height)*2;
	}
	public void showAll(){
		System.out.println(getArea());
		System.out.println(getPer());
	}
	public static void main(String args[]){
		Rectangle a=new Rectangle(5.2,6.6,"black");
		a.showAll();
	}
}
