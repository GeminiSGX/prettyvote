package com.neuedu03.www;

import java.util.Scanner;

public class Test09 {
	public static void main(String args[]){
		System.out.println("请输入一个数字");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=90&&a<100){
			System.out.println('A');
		}else if(a>=80&&a<90){
			System.out.println('B');
		}else if(a>=70&&a<80){
			System.out.println('C');
		}else if(a>=60&&a<70){
			System.out.println('D');
		}else if(a>=0&&a<60){
			System.out.println('E');
		}else{
			System.out.println("无效");
		}
	}
}
