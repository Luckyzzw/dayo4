package com.lianxi_12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("F:\\6.24 ¿ÎÌÃ±Ê¼Ç.txt");
		FileOutputStream fos=new FileOutputStream("a.txt");
//		byte[]bys=new byte[1024];
//		int len;
//		while((len=fis.read(bys))!=-1) {
//			fos.write(bys,0,len);
//		}
		int by;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

}
