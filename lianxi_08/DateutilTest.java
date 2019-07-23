package com.lianxi_08;

import java.text.ParseException;
import java.util.Date;

public class DateutilTest {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		String s=DateUtil.dateToString(d,"yyyy年MM月dd日 HH:mm:ss");
		System.out.println(s);
		String s2=DateUtil.dateToString(d, "yyyy年MM月dd日");
		String str = "1998-05-25 18:23:34";
		Date dd = DateUtil.StringToDate(str, "yyyy-MM-dd HH:mm:ss");
		System.out.println(dd);
		
	}

}
