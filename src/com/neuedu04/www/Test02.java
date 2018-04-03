package com.neuedu04.www;

public class Test02 {
	public static void main(String args[]){
		char []a={'n','e','u','s','o','f','t','e','d','u','c','a','t','i','o','n'};
		char []b;
		b=new char[a.length];
		System.arraycopy(a,0,b,0,16);
		for(int i=1;i<a.length;i++){
			System.out.println(b[i]);	
		}
	}
}
