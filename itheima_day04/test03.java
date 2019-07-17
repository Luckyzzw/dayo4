package com.itheima_day04;

import java.util.Scanner;

/*
 * 评委打分
 */
public class test03 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i < arr.length; i++) {
			System.out.println("第" + i + "个评委打分为:");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			
			sum += arr[i];
		}int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if(max>arr[i]) {
				max=arr[i];
			}
		}int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if(min<arr[i]) {
				min=arr[i];
			}
		}System.out.println("分数为："+(sum-max-min)/4.0);
		
	}
}
