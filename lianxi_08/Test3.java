package com.lianxi_08;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		String s="10 33 59 34 54";
		String[] str=s.split(" ");//切割
		int []arr=new int[str.length];
		for (int i = 0; i < str.length; i++) {
			//Int类型数组的长度与字符串数组str相同
			arr[i]=Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);//升序
		StringBuilder sb=new StringBuilder();
		//把排序后的数组中的元素进行拼接得到一个字符串
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]+" ");
			}
		}System.out.println(sb);
	}

}
