package com.itheima_day02;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������java�ĳɼ�: ");
		int j=sc.nextInt();
		System.out.println("������SQL�ĳɼ�: ");
		int s=sc.nextInt();
		System.out.println("������Web�ĳɼ�: ");
		int w=sc.nextInt();
		System.out.println("-------");
		System.out.println("Java "+ "SQL " + "Web");
		System.out.println( j+"\t"+s+"\t"+w);
		System.out.println("-------");
		int z=j-s;
		System.out.println("Java��SQL�ĳɼ���Ϊ:"+z);
		int a=(j+s+w)/3;
		System.out.println("���ſε�ƽ����Ϊ:"+a);
	}
}
