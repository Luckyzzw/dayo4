package com.itheima_day08_01;

public abstract class Coach extends Person {

	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coach(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public abstract void teach();
}
