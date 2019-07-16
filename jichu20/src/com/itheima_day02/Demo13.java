package com.itheima_day02;

import java.util.Scanner;
//"x=" + x + ",y=" + y

public class Demo13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入一个整数: ");
		int x=sc.nextInt();
		int y=0;
		
		
		if(x<0) {
			y=-1;
		}else if(x==0) {
			y=0;
		}else if(x>0) {
			y=1;
		}else {
			System.out.println("输入有误");
		}
		System.out.println("x=" + x + ",y=" + y);
	}

}
