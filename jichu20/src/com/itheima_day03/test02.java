package com.itheima_day03;
/*
 * 	1.��ӡ1��100���������������а���9��Ҫ����
	2.ÿ�����5����������������֮���ÿո�ָ�
	3.�磺1 2 3 4 5
 */

public class test02 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			if (ge == 9 || shi == 9 || bai == 9) {
				continue;
			}
			count++;
			System.out.print(i + " ");
			if (count % 5 == 0)
				System.out.println();
		}
	}

}
