package com.lianxi_08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateUtil {
	private DateUtil() {}
	/*
	 * 把指定日期转换为指定格式的字符串
	 * 两个明确:
	 * 		返回值类型:String
	 * 		参数列表:Date date,String format
	 */
	public static String dateToString(Date date,String format) {
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		String s=sdf.format(date);
		return s;
		}
		/*
		 * 把指定格式的字符串解析为日期
		 * 两个明确
		 * 		返回值类型:Date
		 * 		参数列表:String s,String  format
		 */
	public static Date StringToDate(String s ,String format)throws ParseException{
			SimpleDateFormat sdf=new SimpleDateFormat(format);
			Date d=sdf.parse(s);
			return d;
		}
	}


