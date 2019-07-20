package com.itheima_day07;

public class Teacher extends Person {

	@Override
	public void work() {
		System.out.println("老师的工作就是好好讲课!");
	}

	@Override
	public void eat() {
		System.out.println("喜欢吃素!");
	}

}
