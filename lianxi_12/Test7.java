package com.lianxi_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("a.txt");
//		int by;
//		while((by=fis.read())!=-1) {
//			System.out.print((char)by);
//		}
		byte[]bys=new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		fis.close();
	}
	
}
