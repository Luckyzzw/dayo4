package com.itheima_day08_01;

public class PingPangCoach extends Coach{

	public PingPangCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PingPangCoach(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teach() {
		System.out.println("ƹ��������̷���");
		
	}

	@Override
	public void eat() {
		System.out.println("ƹ���������ˮ��");
		
	}
	public void speak() {
		System.out.println("ƹ�������˵Ӣ��");
	}

}
