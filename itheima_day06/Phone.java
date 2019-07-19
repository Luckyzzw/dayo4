package com.itheima_day06;

public class Phone {
	String color;
	int price;
	String brand;//品牌
	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}
	public void sendMessage(String name) {
		System.out.println("给"+name+"发短信");
	}
	
}
