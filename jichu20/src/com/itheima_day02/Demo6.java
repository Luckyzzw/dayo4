package com.itheima_day02;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入第一个数字");
		int a=sc.nextInt();
		System.out.println("输入第二个数字");
		int b=sc.nextInt();
		System.out.println("输入第三个数字");
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
		System.out.println("最大值为:"+max);
		
		
		
	}

}
