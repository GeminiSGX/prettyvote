package com.neuedu03.www;

import java.util.Scanner;

public class Test08 {
	public static void main(String args[]){
		System.out.println("请输入");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0&&year%100==0&&year%400==0){
			System.out.println("闰年");
		}else{
			System.out.println("不是的啦");
		}
	}
}
