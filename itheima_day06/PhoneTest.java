package com.itheima_day06;

public class PhoneTest {
	public static void main(String[] args) {
		Phone p=new Phone();
		System.out.println("��ɫΪ:"+p.color);
		System.out.println("�۸�Ϊ:"+p.price);
		System.out.println("Ʒ��Ϊ:"+p.brand);
		System.out.println("------------------");
		p.color="����ɫ";
		p.price=4999;
		p.brand="��Ϊ";
		System.out.println("��ɫΪ:"+p.color+",�۸�Ϊ:"+p.price+",Ʒ��Ϊ:"+p .brand);
		
		System.out.println("��ɫΪ:"+p.color);
		System.out.println("�۸�Ϊ:"+p.price);
		System.out.println("����Ϊ:"+p.brand);
		System.out.println("-----------------");
		Phone p1=p;
		p1.color="����ɫ";
		p1.price=4999;
		p1.brand="С��";
		
		System.out.println("��ɫΪ:"+p.color+",�۸�Ϊ:"+p.price+",Ʒ��Ϊ:"+p.brand);
		System.out.println("��ɫΪ:"+p1.color+",�۸�Ϊ:"+p1.price+",Ʒ��Ϊ:"+p1.brand);
		
		p.call("��־��");
		p.sendMessage("��־��");
	}
}
