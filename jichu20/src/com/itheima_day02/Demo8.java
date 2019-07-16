package com.itheima_day02;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		System.out.println("请输入小明左手中的纸牌:");
		Scanner sc=new Scanner(System.in);
		int left=sc.nextInt();
		System.out.println("请输入小明右手中的纸牌:");
		int right=sc.nextInt();
		System.out.println("---------");
		System.out.println("互换前小明小明手中的纸牌:");
		System.out.println("左手中的纸牌:"+left);
		System.out.println("右手中的纸牌:"+right);
		
		int temp;
		temp=left;
		left=right;
		right=temp;
		System.out.println("互换之后小明中的牌:");
		System.out.println("左手中的牌:"+left);
		System.out.println("右手中的牌:"+right);
		
		
		
	}
}
