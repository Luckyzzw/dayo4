package com.lianxi_08;

import java.util.Date;
/*
 * ��Date�õ�һ������ֵ:
 * 			getTime()
 * ��һ������ֵ�õ�һ��Date����
 * 			���췽��
 * 			setTime(long time)
 */

public class Test {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d );
		
		long  date=1000*60*60;
		Date dd=new Date(date);
		System.out.println(dd);
		
		
		Date d1=new Date();
		//public long getTime()��ȡ���Ǻ���ֵ.��1970/1/1 00:00:00��ʼ��
		
		System.out.println(d.getTime());
		
		//public void setTime(long time) ����ʱ��,�����Ǻ���ֵ
		d.setTime(1000*60*60);
		System.out.println(d.getTime());
	}
}
