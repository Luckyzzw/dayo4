package com.itheima_day02;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		System.out.println("���������ĳɼ�(0-100):");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if( a>=90 && a<=100) {
			System.out.println("���Գɼ�Ϊ����:");
		}else if( a>=80 && a<90){
			System.out.println("���Գɼ�Ϊ��:");
		}else if( a>=70 && a<80){
			System.out.println("���Գɼ�Ϊ��:");
		}else if( a>=60 && a<70){
			System.out.println("���Գɼ�Ϊ����:");
		}else if( a<60){
			System.out.println("���Գɼ�Ϊ������:");
		}else {
			System.out.println("��������120");
		}
	}
}
