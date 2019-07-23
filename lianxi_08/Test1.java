package com.lianxi_08;

import java.util.Arrays;
/*
 * Arrays:此类用作操作
 */

public class Test1 {
	public static void main(String[] args) {
	int []arr= {1,5,6,8,4};//数组打印
	System.out.println("排序前:"+Arrays.toString(arr));
	Array.sort(arr);//升序
	System.out.println("排序后:"+Arrays.toString(arr));
}
}
