package com.lianxi_12;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("a.txt",true);
//		fos.write(65);
//		fos.write(66);
//		fos.close();
		for (int i = 0; i < 10; i++) {
			fos.write("hello".getBytes());
			fos.write("\r\n".getBytes());
			fos.close();
		}
	}
}
