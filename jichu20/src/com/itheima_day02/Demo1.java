package com.itheima_day02;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		System.out.println("请输入一个int类型的数据");
		int i=sc.nextInt();
		String flag=(i%2==0)?"偶数":"奇数";
		System.out.println(flag);
	}

}
