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
		System.out.println("�ú�ѧϰ,��������");
	}
	public void eat() {
		System.out.println("�úóԷ�,Ŭ��ѧϰ");
	}
	public void show() {
		System.out.println("����:"+this.name+",����:"+this.age);
	}
}

