package com.itheima_day12;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 2、需求说明：自定义一个学生类，给出成员变量name和age，
 * 创建HashMap集合键是String，代表学号，值是自定义学生对象，代表每一个学生，
 * 给集合中添加一些元素，并使用两种方式遍历HashMap集合。
 */
public class Test1 {
	public static void main(String[] args) {
		HashMap<String,Student >hm=new HashMap<String, Student>();
		Student s1=new Student("张三", 18);
		Student s2=new Student("李四", 20);
		Student s3=new Student("王五", 19);
		hm.put("it001", s1);
		hm.put("it002", s2);
		hm.put("it003", s3);
		Set<String> set = hm.keySet();
		for (String s : set) {
			Student stu = hm.get(s);
			System.out.println(s+"--"+stu);
		}
		System.out.println("------------");
		Set<Entry<String, Student>> set2 = hm.entrySet();
		for (Entry<String, Student> entry : set2) {
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println(key+"----"+value.getName()+"\t"+value.getAge());
		}
	}
}	


