package com.itheima_day07;

public class PersonTest {
	public static void main(String[] args) {
//		 空参构造 + set方法
//		Student s1 = new Student();
//		s1.setName("柳岩");
//		s1.setAge(18);
//		s1.setSex("女");
//		s1.show();
//		s1.work();
//		s1.eat();
//
//		System.out.println("---------------");
//
//		// 有参构造
//		Student s2 = new Student("张三", 23, "男");
//		s2.show();
//		s2.eat();
//		s2.work();
//		System.out.println("--------------");
		
		Student s = new Student();
		s.setName("胡歌");
		s.setAge(30);
		s.setSex("男");
		s.show();
		usePerson(s);
		System.out.println("-----------------");
		Student s1=new Student("彭于晏", 30, "男");
		s1.show();
		s1.setName("是是是");
		s1.show();
		usePerson(s1);
		System.out.println("----------");
		
		Teacher t = new Teacher();
		t.setName("李云龙");
		t.setAge(55);
		t.setSex("男");
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
