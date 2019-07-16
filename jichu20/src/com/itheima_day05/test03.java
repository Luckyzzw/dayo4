package com.itheima_day05;

import java.util.Scanner;

/*
 *  定义一个方法 能接受一个整数(这个整数大于3)打印0到这个整数(包含)之间的所有的偶数
 *	如 接受的数字是6则调用完方法打印出来的偶数是 0 2 4 6
 *	如 接受的数字是 5则调用完方法打印出来的偶数是 0 2 4
 */
public class test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个大于3的数据");
		int i = sc.nextInt();
		num(i);
	}

	public static void num(int a) {
		for (int i=1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			if (a < 3) {
				System.out.println("录入有误");
				return;

			}

		}

	}

}
