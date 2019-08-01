package com.test01;
/*
 * .继承People（人）类，实现speak方法，在方法内打印“姓名为X的Y人在说着 Z”，
 * 其中X为男人的名字，Y为男人的国籍，Z为当前方法的参数
 */

public  class Man extends People implements Movement{

	public Man() {
		super();
		
	}

	public Man(String name, String country) {
		super(name, country);
		
	}
	
	@Override
	public void speak(String str) {

		System.out.println("姓名为"+getName()+"的"+getCountry()+"人在说着"+str);
		
	}
	@Override
	public void exercise() {
		System.out.println(getName()+"正在锻炼中！");
	}
	
	public void life(String str) {
		speak(str);
		exercise();
		
	}
	
}
