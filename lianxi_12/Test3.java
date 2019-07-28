package com.lianxi_12;

import java.io.File;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws Exception {
//		File f1=new File("f:\\b.txt");
//		System.out.println("createNewFie:"+f1.createNewFile());
//		File f2=new File("f:\\aa");
//		File f3=new File("f:\\aa");
//		File f4=new File(f3,"b.txt");
//		System.out.println("mkdir:"+f3.mkdir());
//		System.out.println("mkdir:"+f4.mkdir());
		File f5=new File("f:aa\\bb");
		System.out.println(f5.mkdirs());
		File f6=new File("f:cc\\d.txt");
		System.out.println("createNewFie:"+f6.createNewFile());
		//System.out.println(f6.mkdirs());
	}
}
