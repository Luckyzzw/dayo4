package com.itheima_day02;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		System.out.println("������һ��int���͵�����");
		int i=sc.nextInt();
		String flag=(i%2==0)?"ż��":"����";
		System.out.println(flag);
	}

}
