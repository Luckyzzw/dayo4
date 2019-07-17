package com.itheima_day04;

/*
 * 独立编写数组遍历
 */
public class test01 {

	public static void main(String[] args) {
		System.out.print("[");
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) { //条件成立，输出数组中的最大值
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}
}
