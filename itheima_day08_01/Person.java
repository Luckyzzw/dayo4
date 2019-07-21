package com.itheima_day08_01;

public abstract class Person {
	private String name;
	private String age;
	public Person() {
		super();
		
	}
	public Person(String name, String age) {
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
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	public abstract void eat();

}
