package com.itheima_day03;

import java.util.Scanner;

/*
 *	1.���մӴ�С��˳�������λ���еĸ�λ+��λ=ʮλ+ǧλ(3553,2332,1166,8228,3773)
 *	  �����ּ�����
 *	2.ÿ�����5����������������֮���ÿո�ָ�
 *	3.�磺9999 9988 9977 9966 9955 	
 * 
 * 
 */
public class test03 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 9999; i >= 1000; i--) {
			int ge, shi, bai, qian;
			ge = i % 10;
			shi = i / 10 % 10;
			bai = i / 10 / 10 % 10;
			qian = i / 10 / 10 / 10 % 10;
			if (ge + bai == shi + qian) {
				count++;
				System.out.print(i + " ");
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}

				

