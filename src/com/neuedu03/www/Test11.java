package com.neuedu03.www;

import java.util.Scanner;

public class Test11 {
	public static void main(String args[]){
		System.out.println("ÇëÊäÈë1Î»Êı");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int i=1;
		int j=1;
		while(true){
			if((x/(10*i))==0){
				break;
			}
			i*=10;
			j++;
		}
		System.out.println(j);
//		int [] array=new int [j];
//		for(int k=0,q=1;k<array.length;k++,q*=10){
//			array[k]=z/q%10;
//		}
//		for(int k=array.length-1;k>=0;k--){
//			System.out.print(array[k]);
//		}
	}
}
