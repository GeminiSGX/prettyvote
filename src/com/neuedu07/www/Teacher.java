package com.neuedu07.www;

public class Teacher extends Student{
	Student a=new English(1,"����","��",16,79,85,99);
	Student b=new Calculator(2,"����","��",14,89,74,63,88);
	Student c=new Literature(3,"�ŵ���","Ů",12,97,95,88,90);
	Student d=new Calculator(4,"����","Ů",13,96,84,83,80);
	Student e=new Literature(5,"����","��",17,82,75,98,60);
	Student []z={a,b,c,d,e};
	public double total(){
		for(int i=0;i<z.length;i++)
			System.out.println("ѧ�ţ�"+z[i].studentid+" "+"������"+z[i].name+" "+"�Ա�"+z[i].sex+" "+"+���䣺"+z[i].age+" "+"�ۺϳɼ���");
		return 1;
	}
}
