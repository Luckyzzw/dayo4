																																		package com.itheima_day07;

/*
 * 
 * 需求 :
 * 	有一个学生类 : 
 * 		成员变量 : 名字 , 年龄 , 性别
 * 		成员方法 : 工作 , 吃饭 
 * 	有一个老师类 :
 * 		成员变量 : 名字 , 年龄 , 性别
 * 		成员方法 : 工作 , 吃饭 
 * 
 *  抽取到人类中:
 *  	成员变量 : 名字 , 年龄 , 性别
 * 		成员方法 : 工作 , 吃饭 
 */
public class Person {
	// 成员变量
	private String name;
	private int age;
	private String sex;

	public Person() {
	}

	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void work() {
		System.out.println("工作!");
	}

	public void eat() {
		System.out.println("吃饭!");
	}

	public void show() {
		System.out.println(name + "\t" + age + "\t" + sex);
	}
}
