package com.itheima_day08_01;

public class Test {
	public static void main(String[] args) {
		BasketballPlayer bp=new BasketballPlayer();
		bp.setName("ղķ˹");
		bp.setAge("30");
		System.out.println(bp.getName()+"\t"+bp.getAge());
		bp.eat();
		bp.study();
		System.out.println("------------");
		BasketballPlayer bp1=new BasketballPlayer("�Ʊ�", "31");
		System.out.println(bp1.getName()+"\t"+bp1.getAge());
		bp1.eat();
		bp1.study();
		System.out.println("------------");
		PingPangPlayer ppp=new PingPangPlayer();
		ppp.setName("�ż̿�");
		ppp.setAge("28");
		System.out.println(ppp.getName()+"\t"+ppp.getAge());
		ppp.eat();
		ppp.study();
		ppp.speak();
		System.out.println("------------");
		BasketballCoach bc=new BasketballCoach();
		bc.setName("����ά��");
		bc.setAge("55");
		System.out.println(bc.getName()+"\t"+bc.getAge());
		bc.eat();
		bc.teach();
		System.out.println("------------");
		PingPangCoach ppc=new PingPangCoach("����", "35");
		System.out.println(ppc.getName()+"\t"+ppc.getAge());
		ppc.eat();
		ppc.teach();
		ppc.speak();
		
		
		
	}

}
