package com.itheima_day04;
/*
 * ��������
 * ��һ���� 1��
 * �ڶ����� 1��
 * �������� 2��
 * ���ĸ��� 3��
 * ���20���µ����Ӷ���
 */
public class test04 {
	public static void main(String[] args) {
		int [] arr=new int[20];
		arr[0] =1;
		System.out.println("��1�������ӵĶ���Ϊ1��");
		arr[1]=1;
		System.out.println("��2�������ӵĶ���Ϊ1��");
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			System.out.println("��"+i+"�������ӵĶ���Ϊ:"+arr[i]+"��");
		}
		
	}

}
