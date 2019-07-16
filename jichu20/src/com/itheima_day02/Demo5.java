package com.itheima_day02;

import java.util.Scanner;

public class Demo5 {
		public static void main(String[] args) {
			System.out.println("请输入两个数字:");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int x=a+b;
			int y=a*b;
			int flag=(a>b)?(a+b):(a*b);
			
			System.out.println(flag);
			
		}
}
