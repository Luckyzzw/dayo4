package com.lianxi_07;
/*
 * StringBuilder和String的相互转换
 * 
 * StringBuilder --- String
 * 			public String toString():通过toString()就可以实现
 * 把StringBuilder转换为String
 * 
 * String ---StringBuilder 
 * 			public StringBuilder(String s):通过构造方法可以实现
 * 把String转换为StringBuilder
 */

public class StringBuiderTest {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("hello");
		
		String s=sb.toString();
		System.out.println(s);
		System.out.println("------------");
		
		
		String s1="hello";
		StringBuilder sb1=new StringBuilder(s1);
		System.out.println(sb1);
	}

}
