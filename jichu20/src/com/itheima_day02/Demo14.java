package com.itheima_day02;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������: ");
		int a=sc.nextInt(); 
		System.out.println("������ڶ�������: ");
		int b=sc.nextInt();
		System.out.println("���������������: ");
		int c=sc.nextInt();
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if(a>c) {
			int temp = a;
			a = c;
			c = temp;
		}
		if(b>c) {
			int temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println("a="+a+",b="+b+",c="+c);
		}
	}


