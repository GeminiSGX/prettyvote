package com.neuedu04.www;

public class Test06 {
	public static void main(String args[]){
		int []a={18,25,7,36,13,2,89,63};
		int max=a[0];
		int index=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
			max=a[i];
			index=i;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
