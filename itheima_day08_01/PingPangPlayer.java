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
		System.out.println("ƹ�����˶�Աѧ����");
		
	}

	@Override
	public void eat() {
		System.out.println("ƹ�����˶�Ա���߲�");
		
	}

	@Override
	public void speak() {
		System.out.println("ƹ�����˶�ԱѧϰӢ��");
		
	}
	

}
