package com.neuedu07.www;

public class Company extends ColaEmployee {
	ColaEmployee a=new SalariedEmployee("������",5,6000);
	ColaEmployee b=new HourluEmployee("��Ʒ�",12,60000,161);
	ColaEmployee c=new SalesEmployee("����",9,65,0.95);
	ColaEmployee []q={a,b,c};
	public double getSalary(int month){
		for(int i=0;i<q.length;i++){
			System.out.println(month+"��"+q[i].name+"Ա���Ĺ�������Ϊ"+q[i].getSalary(month));
		}
		return 1;
	}
}