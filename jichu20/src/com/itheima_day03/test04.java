package com.itheima_day03;

import java.util.Scanner;

/*
 * 循环录入某学生的5门课程的成绩并计算平均分。
 * 如果某分数录入为负，
 * 则停止录入并提示录入错误。
 */

public class test04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;//录入学生的成绩的总和
		boolean flag=true;
		for(int i=1;i<=5;i++) {
			System.out.println("请录入学生第"+i+"门课的成绩");
			int score=sc.nextInt();
			
			sum += score;
			if(score<0||score>100) {
				flag=false;
				System.out.println("录入成绩有误");
				break;
			}
			
		}if(flag==true) {
			System.out.println("录入成绩的平均分为:"+sum/5.0);}
		
	}

}
