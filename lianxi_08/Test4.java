package com.lianxi_08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
	public static void main(String[] args) throws ParseException {
//		Date d=new Date();
//		System.out.println(d.getTime());
//		d.setTime(1000*60*60);
//		System.out.println(d.getTime());
		//Date--String
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyyƒÍMM‘¬dd»’ HH:mm:ss");
//		String s = sdf.format(d);
//		System.out.println(s);
		//String--Date
		String str="2019-07-23 17:19:45";
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1=sdf1.parse(str);
		System.out.println(d1.toLocaleString());
	}

}
