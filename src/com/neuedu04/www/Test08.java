package com.neuedu04.www;

public class Test08 {
	public static void main(String[] args) {
		int [] a= {12,156,15,131,5,165,165,1,5165,16,1};
			for (int i = 0; i < a.length; i++) {
				for (int j = 1; j < a.length; j++) {
					if(a[i]==a[j]&&i!=j) {
						a[i]=0;
					}
				}
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
		}
	}
}
