package com.itheima_day12;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 2������˵�����Զ���һ��ѧ���࣬������Ա����name��age��
 * ����HashMap���ϼ���String������ѧ�ţ�ֵ���Զ���ѧ�����󣬴���ÿһ��ѧ����
 * �����������һЩԪ�أ���ʹ�����ַ�ʽ����HashMap���ϡ�
 */
public class Test1 {
	public static void main(String[] args) {
		HashMap<String,Student >hm=new HashMap<String, Student>();
		Student s1=new Student("����", 18);
		Student s2=new Student("����", 20);
		Student s3=new Student("����", 19);
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


