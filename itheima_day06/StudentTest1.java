package com.itheima_day06;

public class StudentTest1 {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.setSid("it01");
		s1.setName("ºú¸è");
		s1.setAge(30);
		s1.show();
		System.out.println("-------------");
		
		
		Student1 s2=new Student1("it02","Ô¬ºë",30);
		s2.show();
	}

}
