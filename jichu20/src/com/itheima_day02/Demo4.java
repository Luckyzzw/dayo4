package com.itheima_day02;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("�����볤���εĳ��Ϳ�:");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int k=sc.nextInt();
		int zhouchang=(c+k)*2;
		int s=c*k;
		System.out.println("�����󳤷����ܳ�Ϊ:"+zhouchang+";���Ϊ:"+s);
	}
}
