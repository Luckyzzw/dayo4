package com.itheima_day05;

import java.util.Scanner;

/*
 * ��ӡ1-n����
 */
public class test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int n = sc.nextInt();
		printNum(n);

	}

	public static void printNum(int n) {
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}
		if (n == 1) {
			
				System.out.println(1);
			
		}
		if (n < 1) {
			for (int i = 1; i >= n; i--) {
				System.out.println(i);
			}
		}

	}
}
