package com.itheima_day08_03;
/*
 * 1.基础班老师：成员变量：name、age，构造方法：无参、有参，
 * 成员方法：getXxx()、setXxx()、teach(){}。
	2.就业班老师：成员变量：name、age，构造方法：无参、有参，
	成员方法：getXxx()、setXxx()、teach(){}。
	抽象类老师：成员变量：name、age，构造方法：无参、有参，
	成员方法：getXxx()、setXxx()、teach()

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
