package com.neuedu07.www;

public class Vehicle {
	String brand;
	String color;
	double speed=0;
	public Vehicle(){
		
	}
	public Vehicle(String brand, String color, double speed) {
		super();
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	void run(){
		System.out.println(color+"颜色的"+brand+"牌子的车"+"以"+speed+"的速度行驶");
	}
	public static void main(String args[]){
		Vehicle b=new Vehicle("benz","black",0);
		b.run();
	}
}
