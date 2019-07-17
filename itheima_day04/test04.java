package com.itheima_day04;
/*
 * 不死神兔
 * 第一个月 1对
 * 第二个月 1对
 * 第三个月 2对
 * 第四个月 3对
 * 求第20个月的兔子对数
 */
public class test04 {
	public static void main(String[] args) {
		int [] arr=new int[20];
		arr[0] =1;
		System.out.println("第1个月兔子的对数为1对");
		arr[1]=1;
		System.out.println("第2个月兔子的对数为1对");
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			System.out.println("第"+i+"个月兔子的对数为:"+arr[i]+"对");
		}
		
	}

}
