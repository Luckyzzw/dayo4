package com.itheima_day04;

/*
 * ������д�������
 */
public class test01 {

	public static void main(String[] args) {
		System.out.print("[");
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) { //������������������е����ֵ
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}
}
