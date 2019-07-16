package com.itheima_day02;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("提示:第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)");
		System.out.println("请输入第一个整数: ");
		int a=sc.nextInt(); 
		System.out.println("请输入第二个整数: ");
		int b=sc.nextInt();
		System.out.println("请输入第三个整数: ");
		int c=sc.nextInt();
		int jieguo;
		if(c==0) {
			System.out.println(jieguo=a+b);
		}else if(c==1){
			System.out.println(jieguo=a-b);
		}else if(c==2){
			System.out.println(jieguo=a*b);
		}else if(c==3){
			System.out.println(jieguo=a/b);
		}else {
			System.out.println("输入有误");
		}
		
	}

}
