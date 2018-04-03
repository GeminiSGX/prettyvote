package com.neuedu07.www;

public class Car extends Vehicle{
	int loader;
	public Car(){
		
	}
	public Car(String brand, String color, double speed){
		super(brand, color, speed);
		super.brand=brand;
		super.color=color;
		super.speed=speed;
	}
	void run(){
		System.out.println("品牌为"+brand+"颜色为"+color+"载人人数为"+loader+"人的轿车");
	}
	public static void main(String args[]){
		Car a=new Car("Honda","red",2);
		a.run();
	}
}
