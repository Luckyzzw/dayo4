package com.itheima_day12;

import java.util.HashSet;
import java.util.Iterator;

/*
 * һ������˵�����Զ���һ��ѧ���࣬������Ա����name��age��
 * ʹ��HashSet���ϴ洢�Զ�����󲢱������������ϵ�ʱ��
 * �ڿ���̨���ѧ������ĳ�Ա����ֵ��Ҫ��ʹ�����ַ�ʽ���б���(����������ǿfor)��
 * �������������ݽ������Ժ���������д洢��ѧ������
 * �������������ͬ����Ϊ��ͬһ���ˣ��Ͳ��洢�ڼ����У���������ء�
 */

public class Test {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		Student s1=new Student("����", 18);
		Student s2=new Student("����", 20);
		Student s3=new Student("����", 19);
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
