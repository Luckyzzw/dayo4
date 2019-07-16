package com.itheima_day05;
/*
 * 用方法打印水仙花数
 */
public class test01 {

	public static void main(String[] args) {
		Flower();

	}
	public static void Flower() {
		for(int i=100;i<1000;i++) {
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i) {
				System.out.println(i);
			}
		}
	}

}
