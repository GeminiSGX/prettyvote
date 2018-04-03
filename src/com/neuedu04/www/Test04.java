package com.neuedu04.www;

public class Test04 {
	public static void main(String args[]){
		int [][]a={{2,3,4},{4,6,8}};
		int [][]b={{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
		int [][]c;
		c=new int[2][4];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b[i].length;j++){
				c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
				System.out.print(c[i][j]+",");
			}
			System.out.println(" ");
		}
	}
}
