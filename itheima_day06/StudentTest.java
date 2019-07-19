package com.itheima_day06;

public class StudentTest{ 
	public static void main(String[] args){
		//创建对象:类名 对象名=new 类名(....);
		Student s=new Student(); 
		//给成员变量赋值
		
		s.setName("胡歌");
		s.setAge(30);
		//获取成员方法:对象名,成员方法名(....)
		s.study();
		s.eat();
		s.show();
	}

}
