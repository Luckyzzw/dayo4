package com.itheima_day08_03;
/*
 * 1.��������ʦ����Ա������name��age�����췽�����޲Ρ��вΣ�
 * ��Ա������getXxx()��setXxx()��teach(){}��
	2.��ҵ����ʦ����Ա������name��age�����췽�����޲Ρ��вΣ�
	��Ա������getXxx()��setXxx()��teach(){}��
	��������ʦ����Ա������name��age�����췽�����޲Ρ��вΣ�
	��Ա������getXxx()��setXxx()��teach()

 */

public class BasicTeacher {
	private String name;
	private int age;
	public BasicTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BasicTeacher(String name, int age) {
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
	public  void teach() {
		
	};
	

}
