package com.itheima_day08_01;

public class Test {
	public static void main(String[] args) {
		BasketballPlayer bp=new BasketballPlayer();
		bp.setName("詹姆斯");
		bp.setAge("30");
		System.out.println(bp.getName()+"\t"+bp.getAge());
		bp.eat();
		bp.study();
		System.out.println("------------");
		BasketballPlayer bp1=new BasketballPlayer("科比", "31");
		System.out.println(bp1.getName()+"\t"+bp1.getAge());
		bp1.eat();
		bp1.study();
		System.out.println("------------");
		PingPangPlayer ppp=new PingPangPlayer();
		ppp.setName("张继科");
		ppp.setAge("28");
		System.out.println(ppp.getName()+"\t"+ppp.getAge());
		ppp.eat();
		ppp.study();
		ppp.speak();
		System.out.println("------------");
		BasketballCoach bc=new BasketballCoach();
		bc.setName("波波维奇");
		bc.setAge("55");
		System.out.println(bc.getName()+"\t"+bc.getAge());
		bc.eat();
		bc.teach();
		System.out.println("------------");
		PingPangCoach ppc=new PingPangCoach("王浩", "35");
		System.out.println(ppc.getName()+"\t"+ppc.getAge());
		ppc.eat();
		ppc.teach();
		ppc.speak();
		
		
		
	}

}
