package com.itheima_day03;
/*�����������󣬲��ô���ʵ�֣�while
	1.���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�
	2.���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
*/
public class test01 {
	public static void main(String[] args) {
		int h=88480000;
		int count=0;
		int i=1;
		while(i<h){
			i *= 2;//i=i*2
			count++; 
			
		}System.out.println("�ܹ����� "+ count+" �Σ����ֽ�ŵĸ߶� "+i);
	}
			

}
