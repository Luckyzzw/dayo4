																																		package com.itheima_day07;

/*
 * 
 * ���� :
 * 	��һ��ѧ���� : 
 * 		��Ա���� : ���� , ���� , �Ա�
 * 		��Ա���� : ���� , �Է� 
 * 	��һ����ʦ�� :
 * 		��Ա���� : ���� , ���� , �Ա�
 * 		��Ա���� : ���� , �Է� 
 * 
 *  ��ȡ��������:
 *  	��Ա���� : ���� , ���� , �Ա�
 * 		��Ա���� : ���� , �Է� 
 */
public class Person {
	// ��Ա����
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
		System.out.println("����!");
	}

	public void eat() {
		System.out.println("�Է�!");
	}

	public void show() {
		System.out.println(name + "\t" + age + "\t" + sex);
	}
}
