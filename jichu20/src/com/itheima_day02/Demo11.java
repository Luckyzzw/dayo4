package com.itheima_day02;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("���������Ĺ���: ");
		  int gongling=sc.nextInt();
		  System.out.println("��������:");
		  int gongzi=sc.nextInt();
		  
		  
		  int i=gongling;
		  int g=0;
		  int w;
		  w=g+gongzi;
		  
		  if(i>=10&&i<15) {
		   g=5000;w=g+gongzi;
		   System.out.println("�Ǻ���:"+w);
		  }else if(i>=5&&i<10) {
		   g=2500;w=g+gongzi;
		   System.out.println("�Ǻ���:"+w);
		  }else if(i>=3&&i<5) {
		   g=1000;w=g+gongzi;
		   System.out.println("�Ǻ���:"+w);
		  }else if(i>=1&&i<3) {
		   g=500;w=g+gongzi;
		   System.out.println("�Ǻ���:"+w);
		  }else if(i>=0&&i<1) {
		   g=200;w=g+gongzi;
		   System.out.println("�Ǻ���:"+w);
		  }else {
		   System.out.println("��������: ");
		  }
		  System.out.println("��Ŀǰ������"+gongling+",��������Ϊ"+gongzi+","
		  		+ "Ӧ�ǹ���"+g+",�Ǻ���" +w);
}
}
