package com.itheima_day02;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		System.out.println("������С�������е�ֽ��:");
		Scanner sc=new Scanner(System.in);
		int left=sc.nextInt();
		System.out.println("������С�������е�ֽ��:");
		int right=sc.nextInt();
		System.out.println("---------");
		System.out.println("����ǰС��С�����е�ֽ��:");
		System.out.println("�����е�ֽ��:"+left);
		System.out.println("�����е�ֽ��:"+right);
		
		int temp;
		temp=left;
		left=right;
		right=temp;
		System.out.println("����֮��С���е���:");
		System.out.println("�����е���:"+left);
		System.out.println("�����е���:"+right);
		
		
		
	}
}
