package com.itheima_day04;
/*
 * ���������ȡ���ֵ
 */
public class test02 {
	public static void main(String[] args) {
		int [] arr= {1,3,4,6,8,9};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}System.out.println("���ֵΪ��"+max);
	}
}
