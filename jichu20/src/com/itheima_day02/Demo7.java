package com.itheima_day02;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		System.out.println("请输入您的成绩(0-100):");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if( a>=90 && a<=100) {
			System.out.println("考试成绩为优秀:");
		}else if( a>=80 && a<90){
			System.out.println("考试成绩为好:");
		}else if( a>=70 && a<80){
			System.out.println("考试成绩为良:");
		}else if( a>=60 && a<70){
			System.out.println("考试成绩为及格:");
		}else if( a<60){
			System.out.println("考试成绩为不及格:");
		}else {
			System.out.println("输入有误120");
		}
	}
}
