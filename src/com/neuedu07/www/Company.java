package com.neuedu07.www;

public class Company extends ColaEmployee {
	ColaEmployee a=new SalariedEmployee("擎天柱",5,6000);
	ColaEmployee b=new HourluEmployee("大黄蜂",12,60000,161);
	ColaEmployee c=new SalesEmployee("热破",9,65,0.95);
	ColaEmployee []q={a,b,c};
	public double getSalary(int month){
		for(int i=0;i<q.length;i++){
			System.out.println(month+"月"+q[i].name+"员工的工资数额为"+q[i].getSalary(month));
		}
		return 1;
	}
}