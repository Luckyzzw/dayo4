package com.itheima_day06;

public class StudentTest{ 
	public static void main(String[] args){
		//��������:���� ������=new ����(....);
		Student s=new Student(); 
		//����Ա������ֵ
		
		s.setName("����");
		s.setAge(30);
		//��ȡ��Ա����:������,��Ա������(....)
		s.study();
		s.eat();
		s.show();
	}

}
