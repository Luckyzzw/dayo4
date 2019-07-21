package com.itheima_day08_01;

public class PingPangPlayer  extends Player implements SpeakEnglish{
	
	public PingPangPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PingPangPlayer(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		System.out.println("乒乓球运动员学发球");
		
	}

	@Override
	public void eat() {
		System.out.println("乒乓球运动员吃蔬菜");
		
	}

	@Override
	public void speak() {
		System.out.println("乒乓球运动员学习英语");
		
	}
	

}
