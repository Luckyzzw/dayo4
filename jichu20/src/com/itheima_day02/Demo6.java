package com.itheima_day02;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����һ������");
		int a=sc.nextInt();
		System.out.println("����ڶ�������");
		int b=sc.nextInt();
		System.out.println("�������������");
		int c=sc.nextInt();
		int number;
		if(a<b) {
			number=b;
		}else {
			number=a;
		}
		int max;
		if(number<c) {
			max=c;
		}else {
			max=number;
		}
		System.out.println("���ֵΪ:"+max);
		
		
		
	}

}
