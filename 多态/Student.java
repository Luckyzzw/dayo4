package com.itheima_day07;

public class Student extends Person {
	public Student() {
		super();
	}

	public Student(String name, int age, String sex) {
		super(name, age, sex);
	}

	@Override
	public void work() {
		System.out.println("ѧ���Ĺ�������ѧϰ!");
	}

	@Override
	public void eat() {
		System.out.println("ϲ������!");
	}

}
