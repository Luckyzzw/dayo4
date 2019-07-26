package com.itheima_day12;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 一、需求说明：自定义一个学生类，给出成员变量name和age，
 * 使用HashSet集合存储自定义对象并遍历，遍历集合的时候，
 * 在控制台输出学生对象的成员变量值。要求使用两种方式进行遍历(迭代器、增强for)。
 * 二、当上述内容解决完毕以后，如果集合中存储的学生对象，
 * 年龄和姓名都相同，认为是同一个人，就不存储在集合中，该如何做呢。
 */

public class Test {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		Student s1=new Student("张三", 18);
		Student s2=new Student("李四", 20);
		Student s3=new Student("王五", 19);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		for (Student s : hs) {
			System.out.println(s);
		}
		System.out.println("-----------");
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}		
		
	}

}
