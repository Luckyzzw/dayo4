package com.lianxi_12;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
//		File f1=new File("a.txt");
//		System.out.println(f1.delete());
//		File f2=new File("aa\\bb");
//		System.out.println(f2.delete());
		File f=new File("cc\\dd.txt");
		//�ж��Ƿ���Ŀ¼
		System.out.println(f.isDirectory());
		//�ж��Ƿ����ļ�
		System.out.println(f.isFile());
		//�ж��Ƿ����
		System.out.println(f.exists());
		//��ȡ����·��
		System.out.println(f.getAbsolutePath());
		//��ȡ���·��
		System.out.println(f.getPath());
		//��ȡ����
		System.out.println(f.getName());
	}
}
