package com.itheima_day03;

import java.util.Scanner;

/*
 * ѭ��¼��ĳѧ����5�ſγ̵ĳɼ�������ƽ���֡�
 * ���ĳ����¼��Ϊ����
 * ��ֹͣ¼�벢��ʾ¼�����
 */

public class test04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;//¼��ѧ���ĳɼ����ܺ�
		boolean flag=true;
		for(int i=1;i<=5;i++) {
			System.out.println("��¼��ѧ����"+i+"�ſεĳɼ�");
			int score=sc.nextInt();
			
			sum += score;
			if(score<0||score>100) {
				flag=false;
				System.out.println("¼��ɼ�����");
				break;
			}
			
		}if(flag==true) {
			System.out.println("¼��ɼ���ƽ����Ϊ:"+sum/5.0);}
		
	}

}
