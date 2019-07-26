package com.itheima_day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ��������˵����HashMap����Ƕ��ArrayList���ϲ�������
	����һ��HashMap���ϣ�����������Ԫ�أ�ÿһ��Ԫ�صļ���String���ͣ�ֵ��ArrayList���͡�
	����String			���������Ĳ����Ӿ�
	ֵ��ArrayList		���������
	ÿһ��ArrayList���ϵ�������String���͵ġ�
	�������µ��ַ������ݣ����ô���ʵ������
	��һ��ArrayList���ϵ�Ԫ�أ�(��������)
		�����
		����
	�ڶ���ArrayList���ϵ�Ԫ�أ�(���μ�)
		��ɮ
		�����
	������ArrayList���ϵ�Ԫ�أ�(ˮ䰴�)
		����
		³����
 */
public class Test4 {
	public static void main(String[] args) {
		HashMap<String,ArrayList<String>>hm=new HashMap<String, ArrayList<String>>();
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("�����");
		list1.add("����");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("��ɮ");
		list2.add("�����");
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("����");
		list3.add("³����");
		hm.put("��������",list1);
		hm.put("���μ�",list2);
		hm.put("ˮ䰴�",list3);
		Set<Entry<String, ArrayList<String>>> set = hm.entrySet();
		for (Entry<String, ArrayList<String>> entry : set) {
			String key = entry.getKey();
			ArrayList<String> value = entry.getValue();
			System.out.println(key+"---"+value);
		}
	}

}
