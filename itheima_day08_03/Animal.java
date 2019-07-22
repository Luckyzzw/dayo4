package com.itheima_day08_03;
/*
 * 1.定义跳高接口Jumpping，该接口中有一个抽象跳高方法jump()。
	2.定义抽象类Animal，该类中有属性姓名name、年龄age，
	还有一个抽象吃饭eat()方法。
	3.定义猫类Cat，该类继承Animal，并实现跳高接口，
	重写抽象类中eat()方法与接口中的跳高jump()方法。
	4.定义测试类InterfaceTest，在测试类中，创建猫对象，
	给对象成员变量赋值，最后调用猫的吃饭和跳高方法。
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
