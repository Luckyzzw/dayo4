package com.itheima_day02;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("请输入长方形的长和宽:");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int k=sc.nextInt();
		int zhouchang=(c+k)*2;
		int s=c*k;
		System.out.println("您所求长方形周长为:"+zhouchang+";面积为:"+s);
	}
}
