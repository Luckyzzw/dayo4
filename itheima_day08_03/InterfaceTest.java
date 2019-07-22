package com.itheima_day08_03;

public class InterfaceTest {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.setName("ίχίχ");
		c.setAge(3);
		System.out.println(c.getName()+"\t"+c.getAge());
		c.jump();
		c.eat();
	}
	
	

}
