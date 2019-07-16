package com.itheima_day02;

import java.util.Scanner;
/*
 * 
	 * i+"的个位是"+(i%10)+ 
	",十位是"+(i/10%10)+
	",百位是"+(i/10/10%10)
	千位是+(i/10/10/10%10)
	,
 */

public class Demo10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入四位会员卡号(1000-9999): ");
		int i=sc.nextInt();
		int a,b,c,d;
		    a=i%10;
		    b=i/10%10;
		    c=i/10/10%10;
		    d=i/10/10/10%10;
//		System.out.println(i+"的个位是"+(i%10)+ 
//							",十位是"+(i/10%10)+
//							",百位是"+(i/10/10%10)+
//							",千位是"+(i/10/10/10%10));
		i=a+b+c+d;
		int sum;
		sum=i;
		
		
		if(sum==23) {
			System.out.println("会员卡号3569之和:"+sum);
			System.out.println("会员卡号3569是幸运客户");
			
		}else {
			System.out.println("会员卡号1234之和:"+sum);
			System.out.println("会员卡号1234不是幸运客户");
		}
		
	}

}
