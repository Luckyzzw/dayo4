package com.lianxi_12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
				fos=new FileOutputStream("d.txt");
				fos.write("hello".getBytes());
			} catch (IOException e) {
				e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			} 
		}
	}

}
