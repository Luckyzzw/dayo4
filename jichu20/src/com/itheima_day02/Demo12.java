package com.itheima_day02;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��ʾ:����������ΪҪ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������)");
		System.out.println("�������һ������: ");
		int a=sc.nextInt(); 
		System.out.println("������ڶ�������: ");
		int b=sc.nextInt();
		System.out.println("���������������: ");
		int c=sc.nextInt();
		int jieguo;
		if(c==0) {
			System.out.println(jieguo=a+b);
		}else if(c==1){
			System.out.println(jieguo=a-b);
		}else if(c==2){
			System.out.println(jieguo=a*b);
		}else if(c==3){
			System.out.println(jieguo=a/b);
		}else {
			System.out.println("��������");
		}
		
	}

}
