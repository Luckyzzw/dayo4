package com.itheima_day02;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("请输入您的工龄: ");
		  int gongling=sc.nextInt();
		  System.out.println("基本工资:");
		  int gongzi=sc.nextInt();
		  
		  
		  int i=gongling;
		  int g=0;
		  int w;
		  w=g+gongzi;
		  
		  if(i>=10&&i<15) {
		   g=5000;w=g+gongzi;
		   System.out.println("涨后工资:"+w);
		  }else if(i>=5&&i<10) {
		   g=2500;w=g+gongzi;
		   System.out.println("涨后工资:"+w);
		  }else if(i>=3&&i<5) {
		   g=1000;w=g+gongzi;
		   System.out.println("涨后工资:"+w);
		  }else if(i>=1&&i<3) {
		   g=500;w=g+gongzi;
		   System.out.println("涨后工资:"+w);
		  }else if(i>=0&&i<1) {
		   g=200;w=g+gongzi;
		   System.out.println("涨后工资:"+w);
		  }else {
		   System.out.println("输入有误: ");
		  }
		  System.out.println("您目前工作了"+gongling+",基本工资为"+gongzi+","
		  		+ "应涨工资"+g+",涨后工资" +w);
}
}
