package com.lianxi_07;
/*
 * StringBuilder��String���໥ת��
 * 
 * StringBuilder --- String
 * 			public String toString():ͨ��toString()�Ϳ���ʵ��
 * ��StringBuilderת��ΪString
 * 
 * String ---StringBuilder 
 * 			public StringBuilder(String s):ͨ�����췽������ʵ��
 * ��Stringת��ΪStringBuilder
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
