package com.itheima_day03;
/*分析以下需求，并用代码实现：while
	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
*/
public class test01 {
	public static void main(String[] args) {
		int h=88480000;
		int count=0;
		int i=1;
		while(i<h){
			i *= 2;//i=i*2
			count++; 
			
		}System.out.println("总共折了 "+ count+" 次，最后纸张的高度 "+i);
	}
			

}
