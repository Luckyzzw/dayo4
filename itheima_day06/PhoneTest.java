package com.itheima_day06;

public class PhoneTest {
	public static void main(String[] args) {
		Phone p=new Phone();
		System.out.println("颜色为:"+p.color);
		System.out.println("价格为:"+p.price);
		System.out.println("品牌为:"+p.brand);
		System.out.println("------------------");
		p.color="深蓝色";
		p.price=4999;
		p.brand="华为";
		System.out.println("颜色为:"+p.color+",价格为:"+p.price+",品牌为:"+p .brand);
		
		System.out.println("颜色为:"+p.color);
		System.out.println("价格为:"+p.price);
		System.out.println("性能为:"+p.brand);
		System.out.println("-----------------");
		Phone p1=p;
		p1.color="深蓝色";
		p1.price=4999;
		p1.brand="小米";
		
		System.out.println("颜色为:"+p.color+",价格为:"+p.price+",品牌为:"+p.brand);
		System.out.println("颜色为:"+p1.color+",价格为:"+p1.price+",品牌为:"+p1.brand);
		
		p.call("韩志宇");
		p.sendMessage("韩志宇");
	}
}
