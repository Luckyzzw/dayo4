package com.itheima_day02;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("请输入您的成绩:");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		String source=(i>=60)?"及格":"不及格";
		System.out.println(source);
		
		
	}
}
