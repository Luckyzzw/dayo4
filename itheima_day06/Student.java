package com.itheima_day06;

public class Student {
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String  getName() {
		 return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		 return age;
	}
	
	public void study() {
		System.out.println("好好学习,天天向上");
	}
	public void eat() {
		System.out.println("好好吃饭,努力学习");
	}
	public void show() {
		System.out.println("姓名:"+this.name+",年龄:"+this.age);
	}
}

