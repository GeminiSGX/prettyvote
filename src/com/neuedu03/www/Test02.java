package com.neuedu03.www;

public class Test02 {
	public static void main(String args[]){
		int a=58;
		switch(a/10){
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良");
			break;
		case 7:
			System.out.println("差");
			break;
		case 6:
			System.out.println("及格");
			break;
			default :
				System.out.println("不及格");
		}
	}
}
