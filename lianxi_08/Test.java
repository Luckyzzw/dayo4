package com.lianxi_08;

import java.util.Date;
/*
 * 从Date得到一个毫秒值:
 * 			getTime()
 * 从一个毫秒值得到一个Date对象
 * 			构造方法
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
		//public long getTime()获取的是毫秒值.从1970/1/1 00:00:00开始的
		
		System.out.println(d.getTime());
		
		//public void setTime(long time) 设置时间,给的是毫秒值
		d.setTime(1000*60*60);
		System.out.println(d.getTime());
	}
}
