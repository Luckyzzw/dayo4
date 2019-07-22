package com.itheima_day08_03;
/*
 * 1.�������߽ӿ�Jumpping���ýӿ�����һ���������߷���jump()��
	2.���������Animal������������������name������age��
	����һ������Է�eat()������
	3.����è��Cat������̳�Animal����ʵ�����߽ӿڣ�
	��д��������eat()������ӿ��е�����jump()������
	4.���������InterfaceTest���ڲ������У�����è����
	�������Ա������ֵ��������è�ĳԷ������߷�����
 */
public abstract class Animal {
	private String name;
	private int age;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void eat();
	

}
