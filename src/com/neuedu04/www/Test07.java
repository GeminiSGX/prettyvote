package com.neuedu04.www;

public class Test07 {
	public static void main(String args[]){
		int []a={456,123,1,5464,56,21,5646,241,54};
		for(int i=1;i<a.length-1;i++){
			for(int j=1;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
}