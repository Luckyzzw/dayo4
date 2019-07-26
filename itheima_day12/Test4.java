package com.itheima_day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 二、需求说明：HashMap集合嵌套ArrayList集合并遍历。
	定义一个HashMap集合，它包含三个元素，每一个元素的键是String类型，值是ArrayList类型。
	键：String			人物来自哪部电视剧
	值：ArrayList		人物的名称
	每一个ArrayList集合的数据是String类型的。
	给出如下的字符串数据，请用代码实现需求。
	第一个ArrayList集合的元素：(三国演义)
		诸葛亮
		赵云
	第二个ArrayList集合的元素：(西游记)
		唐僧
		孙悟空
	第三个ArrayList集合的元素：(水浒传)
		武松
		鲁智深
 */
public class Test4 {
	public static void main(String[] args) {
		HashMap<String,ArrayList<String>>hm=new HashMap<String, ArrayList<String>>();
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("诸葛亮");
		list1.add("赵云");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("唐僧");
		list2.add("孙悟空");
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("武松");
		list3.add("鲁智深");
		hm.put("三国演义",list1);
		hm.put("西游记",list2);
		hm.put("水浒传",list3);
		Set<Entry<String, ArrayList<String>>> set = hm.entrySet();
		for (Entry<String, ArrayList<String>> entry : set) {
			String key = entry.getKey();
			ArrayList<String> value = entry.getValue();
			System.out.println(key+"---"+value);
		}
	}

}
