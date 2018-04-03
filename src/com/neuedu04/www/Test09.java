package com.neuedu04.www;

public class Test09 {
	public static void main(String args[]){
		int []a={-10,2,3,246,-100,0,5};
		int max=a[0];
		int min=a[0];
		int sum=0;
		int avg=0;
		int index=0;
		int index1=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
				index=i;
			}if(min>a[i]){
				min=a[i];
				index1=i;
			}
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println(max);
		System.out.println(index);
		System.out.println(min);
		System.out.println(index1);
		System.out.println(avg);
	}
}
