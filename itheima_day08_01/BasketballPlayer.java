package com.itheima_day08_01;

public class BasketballPlayer extends Player {

	public BasketballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasketballPlayer(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		System.out.println("篮球运动员学习运球");
		
	}

	@Override
	public void eat() {
		System.out.println("篮球运动员吃牦牛肉");
		
	}

}
