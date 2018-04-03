package com.neuedu04.www;

//import java.util.Arrays;

public class Test03 {
	public static void main(String args[]){
//		int []a={1,6,2,3,9,4,5,7,8};
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
//	}
//}
		int []a={1,6,2,3,9,4,5,7,8};
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














