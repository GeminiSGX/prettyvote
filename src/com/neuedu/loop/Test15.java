package com.neuedu.loop;

public class Test15 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		if(a<=0){
			System.out.println("�ǲ���ɵ");
		}else{
			for (int i = 1; i <= a; i++) {
				b = b*i;
			}
			System.out.println(b);
		}
		
	}
}
