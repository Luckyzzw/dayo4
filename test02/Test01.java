package com.test02;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * 1.定义一个菜单类Menu，要求有如下属性：菜名（String类型）、价格（int类型）、菜系（String型）；要求有空参、满参以及getter/setter

      2. 在main方法中完成以下操作：

            ①提示用户键盘录入以下4个菜品信息(格式为：菜名,价格,菜系)

           麻婆豆腐,33,川菜

           臭鳜鱼,78,徽菜

           蜜汁叉烧,58,粤系

           水煮鱼,68,川菜

     ②定义ArrayList集合，将键盘录入的每个菜品信息封装成Menu对象并添加到集合中。
     遍历集合将菜系为川菜的对象筛选出来，用字符输出流按以下格式写入到Menu.txt文件中。


 */
public class Test01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Menu> list = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			Menu m = new Menu();
			System.out.println("请输入菜品信息(格式为：菜名,价格,菜系):");
			String s = sc.nextLine();
			String[] ss = s.split(",");
			m.setName(ss[0]);
			m.setPrice(Integer.parseInt(ss[1]));
			m.setCaixi(ss[2]);
			list.add(m);
		}
//		System.out.println(list);
		BufferedWriter bw = new BufferedWriter(new FileWriter("Menu.txt"));
		String line = null;
		for (Menu menu : list) {
			
			if(menu.getCaixi().equals("川菜")) {
			line = menu.getName() + "--" + menu.getPrice() + "--" + menu.getCaixi();
			bw.write(line);
			bw.newLine();
			bw.flush();}
			
		}

		bw.close();

	}

}
