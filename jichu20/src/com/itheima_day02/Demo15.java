package com.itheima_day02;

import java.util.Scanner;

/*
 * switch(���ʽ) {
  			case ֵ1:
 				�����1;
  				break;
  			case ֵ2:
  				�����2;
  				break;
  			case ֵ3:
  				�����3;
  				break;
  			...
  			default:
  				�����n+1;
  				break;
  		}
 * 
 * 
 */

public class Demo15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���·�(1-12):");
		int month=sc.nextInt();
		int i;
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
		default:
			System.out.println("��������");
			break;
		}
		
	}

}
