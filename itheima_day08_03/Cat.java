package com.itheima_day08_03;

public class Cat extends Animal implements Jumpping {
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public void jump() {
		System.out.println("ß÷ß÷Ï²»¶Ìø¸ß");
		
	}

	@Override
	public void eat() {
		System.out.println("Ã¨³ÔÓã");
		
	}

}
