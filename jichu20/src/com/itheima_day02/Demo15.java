package com.itheima_day02;

import java.util.Scanner;

/*
 * switch(表达式) {
  			case 值1:
 				语句体1;
  				break;
  			case 值2:
  				语句体2;
  				break;
  			case 值3:
  				语句体3;
  				break;
  			...
  			default:
  				语句体n+1;
  				break;
  		}
 * 
 * 
 */

public class Demo15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个月份(1-12):");
		int month=sc.nextInt();
		int i;
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		default:
			System.out.println("输入有误");
			break;
		}
		
	}

}
