package com.itheima_day02;

import java.util.Scanner;
/*
 * 
	 * i+"�ĸ�λ��"+(i%10)+ 
	",ʮλ��"+(i/10%10)+
	",��λ��"+(i/10/10%10)
	ǧλ��+(i/10/10/10%10)
	,
 */

public class Demo10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������λ��Ա����(1000-9999): ");
		int i=sc.nextInt();
		int a,b,c,d;
		    a=i%10;
		    b=i/10%10;
		    c=i/10/10%10;
		    d=i/10/10/10%10;
//		System.out.println(i+"�ĸ�λ��"+(i%10)+ 
//							",ʮλ��"+(i/10%10)+
//							",��λ��"+(i/10/10%10)+
//							",ǧλ��"+(i/10/10/10%10));
		i=a+b+c+d;
		int sum;
		sum=i;
		
		
		if(sum==23) {
			System.out.println("��Ա����3569֮��:"+sum);
			System.out.println("��Ա����3569�����˿ͻ�");
			
		}else {
			System.out.println("��Ա����1234֮��:"+sum);
			System.out.println("��Ա����1234�������˿ͻ�");
		}
		
	}

}
