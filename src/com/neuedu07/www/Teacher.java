package com.neuedu07.www;

public class Teacher extends Student{
	Student a=new English(1,"冰河","男",16,79,85,99);
	Student b=new Calculator(2,"紫龙","男",14,89,74,63,88);
	Student c=new Literature(3,"雅典娜","女",12,97,95,88,90);
	Student d=new Calculator(4,"春丽","女",13,96,84,83,80);
	Student e=new Literature(5,"撒加","男",17,82,75,98,60);
	Student []z={a,b,c,d,e};
	public double total(){
		for(int i=0;i<z.length;i++)
			System.out.println("学号："+z[i].studentid+" "+"姓名："+z[i].name+" "+"性别："+z[i].sex+" "+"+年龄："+z[i].age+" "+"综合成绩：");
		return 1;
	}
}
