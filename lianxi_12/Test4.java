package com.lianxi_12;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
//		File f1=new File("a.txt");
//		System.out.println(f1.delete());
//		File f2=new File("aa\\bb");
//		System.out.println(f2.delete());
		File f=new File("cc\\dd.txt");
		//判断是否是目录
		System.out.println(f.isDirectory());
		//判断是否是文件
		System.out.println(f.isFile());
		//判断是否存在
		System.out.println(f.exists());
		//获取绝对路径
		System.out.println(f.getAbsolutePath());
		//获取相对路径
		System.out.println(f.getPath());
		//获取名称
		System.out.println(f.getName());
	}
}
