package com.lianxi_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("E:\\1.jpg");
		FileOutputStream fos=new FileOutputStream("1.jpg");
		int by;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

}
