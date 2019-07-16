package com.itheima_day02;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入java的成绩: ");
		int j=sc.nextInt();
		System.out.println("请输入SQL的成绩: ");
		int s=sc.nextInt();
		System.out.println("请输入Web的成绩: ");
		int w=sc.nextInt();
		System.out.println("-------");
		System.out.println("Java "+ "SQL " + "Web");
		System.out.println( j+"\t"+s+"\t"+w);
		System.out.println("-------");
		int z=j-s;
		System.out.println("Java和SQL的成绩差为:"+z);
		int a=(j+s+w)/3;
		System.out.println("三门课的平均分为:"+a);
	}
}
