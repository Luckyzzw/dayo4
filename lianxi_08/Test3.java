package com.lianxi_08;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		String s="10 33 59 34 54";
		String[] str=s.split(" ");//�и�
		int []arr=new int[str.length];
		for (int i = 0; i < str.length; i++) {
			//Int��������ĳ������ַ�������str��ͬ
			arr[i]=Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);//����
		StringBuilder sb=new StringBuilder();
		//�������������е�Ԫ�ؽ���ƴ�ӵõ�һ���ַ���
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]+" ");
			}
		}System.out.println(sb);
	}

}
