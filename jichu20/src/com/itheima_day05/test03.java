package com.itheima_day05;

import java.util.Scanner;

/*
 *  ����һ������ �ܽ���һ������(�����������3)��ӡ0���������(����)֮������е�ż��
 *	�� ���ܵ�������6������귽����ӡ������ż���� 0 2 4 6
 *	�� ���ܵ������� 5������귽����ӡ������ż���� 0 2 4
 */
public class test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼��һ������3������");
		int i = sc.nextInt();
		num(i);
	}

	public static void num(int a) {
		for (int i=1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			if (a < 3) {
				System.out.println("¼������");
				return;

			}

		}

	}

}
