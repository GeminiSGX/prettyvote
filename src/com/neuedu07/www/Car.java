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
		System.out.println("Ʒ��Ϊ"+brand+"��ɫΪ"+color+"��������Ϊ"+loader+"�˵Ľγ�");
	}
	public static void main(String args[]){
		Car a=new Car("Honda","red",2);
		a.run();
	}
}
