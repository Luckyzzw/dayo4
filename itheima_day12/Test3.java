package com.itheima_day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * һ������˵����ArrayList����Ƕ��HashMap���ϲ�������
	����һ��ArrayList���ϣ�����������Ԫ�أ�ÿһ��Ԫ�ض���HashMap���͵ġ�
	ÿһ��HashMap���ϵļ���ֵ����String���͵ģ�
		����String		�ɷ������
		ֵ��String		���ӵ�����
	�������µ��ַ������ݣ����ô���ʵ������
	��һ��HashMap���ϵ�Ԫ�أ�
		���		����
		���		С��
	�ڶ���HashMap���ϵ�Ԫ�أ�
		����		����
		���		С��Ů
	������HashMap���ϵ�Ԫ�أ�
		�����	��ӯӯ
		��ƽ֮	����ɺ
 */
public class Test3 {
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> list=new ArrayList<>();
		HashMap<String,String> hs1=new HashMap<String, String>();
		hs1.put("���", "����");
		hs1.put("���", "С��");
		HashMap<String,String> hs2=new HashMap<String, String>();
		hs2.put("����", "����");
		hs2.put("���", "С��Ů");
		HashMap<String,String> hs3=new HashMap<String, String>();
		hs3.put("�����", "��ӯӯ");
		hs3.put("��ƽ֮", "����ɺ");
		list.add(hs1);
		list.add(hs2);
		list.add(hs3);
		for (HashMap<String, String> hm : list) {
			Set<String> set = hm.keySet();
			for (String key : set) {
				String value = hm.get(key);
				System.out.println(key+"---"+value);
			}
			System.out.println();
			
			
		}
		
		
		
		
	}

}
