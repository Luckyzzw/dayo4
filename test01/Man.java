package com.test01;
/*
 * .�̳�People���ˣ��࣬ʵ��speak�������ڷ����ڴ�ӡ������ΪX��Y����˵�� Z����
 * ����XΪ���˵����֣�YΪ���˵Ĺ�����ZΪ��ǰ�����Ĳ���
 */

public  class Man extends People implements Movement{

	public Man() {
		super();
		
	}

	public Man(String name, String country) {
		super(name, country);
		
	}
	
	@Override
	public void speak(String str) {

		System.out.println("����Ϊ"+getName()+"��"+getCountry()+"����˵��"+str);
		
	}
	@Override
	public void exercise() {
		System.out.println(getName()+"���ڶ����У�");
	}
	
	public void life(String str) {
		speak(str);
		exercise();
		
	}
	
}
