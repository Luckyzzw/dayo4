package com.itheima_day07;

public class PersonTest {
	public static void main(String[] args) {
//		 �ղι��� + set����
//		Student s1 = new Student();
//		s1.setName("����");
//		s1.setAge(18);
//		s1.setSex("Ů");
//		s1.show();
//		s1.work();
//		s1.eat();
//
//		System.out.println("---------------");
//
//		// �вι���
//		Student s2 = new Student("����", 23, "��");
//		s2.show();
//		s2.eat();
//		s2.work();
//		System.out.println("--------------");
		
		Student s = new Student();
		s.setName("����");
		s.setAge(30);
		s.setSex("��");
		s.show();
		usePerson(s);
		System.out.println("-----------------");
		Student s1=new Student("������", 30, "��");
		s1.show();
		s1.setName("������");
		s1.show();
		usePerson(s1);
		System.out.println("----------");
		
		Teacher t = new Teacher();
		t.setName("������");
		t.setAge(55);
		t.setSex("��");
		t.show();
		usePerson(t);
		

	}
	public static void usePerson(Person  p){// Animal a = new Dog();
		p.eat();
		
		if(p instanceof Student){
			Student student = (Student) p;
			p.work();
		}else if(p instanceof Teacher){
			Teacher teacher = (Teacher) p;
			p.work();
		}
	}

	}
