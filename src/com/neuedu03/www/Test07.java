package com.neuedu03.www;

public class Test07 {
	public static void main(String args[]){
		int a=30;
		if(a/5==0&&a/6==0){
			System.out.println("能被5和6整除");
		}else if(a/5==0){
			System.out.println("能被5整除");
		}else if(a/6==0){
			System.out.println("能被6整除");
		}else if(a/5!=0&&a/6!=0){
			System.out.println("不能被5或6整除");
		}
	}
}
