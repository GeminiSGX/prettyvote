package com.zhouce01.www;

public class Test01 {
	public static void main(String args[]){
		int x=1;
		int sum=0;
		do{
			sum=sum+x;
			x++;
		}
		while(x<=10);
		System.out.println(sum);
	}
}