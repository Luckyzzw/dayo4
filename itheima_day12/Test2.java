package com.itheima_day12;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		HashMap<Student, String>hm=new HashMap<Student, String>();
		Student s1=new Student("����", 18);
		Student s2=new Student("����", 20);
		Student s3=new Student("����", 19);
		hm.put(s1,"����");
		hm.put(s2,"�Ϻ�");
		hm.put(s3,"����");
		Set<Student> set = hm.keySet();
		for (Student s : set) {
			String str = hm.get(s);
			System.out.println(s+"----"+str);
		}
		System.out.println("----------");
		Set<Entry<Student, String>> set2 = hm.entrySet();
		for (Entry<Student, String> entry : set2) {
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
	}

}
