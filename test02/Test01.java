package com.test02;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * 1.����һ���˵���Menu��Ҫ�����������ԣ�������String���ͣ����۸�int���ͣ�����ϵ��String�ͣ���Ҫ���пղΡ������Լ�getter/setter

      2. ��main������������²�����

            ����ʾ�û�����¼������4����Ʒ��Ϣ(��ʽΪ������,�۸�,��ϵ)

           ���Ŷ���,33,����

           ������,78,�ղ�

           ��֭����,58,��ϵ

           ˮ����,68,����

     �ڶ���ArrayList���ϣ�������¼���ÿ����Ʒ��Ϣ��װ��Menu������ӵ������С�
     �������Ͻ���ϵΪ���˵Ķ���ɸѡ���������ַ�����������¸�ʽд�뵽Menu.txt�ļ��С�


 */
public class Test01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Menu> list = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			Menu m = new Menu();
			System.out.println("�������Ʒ��Ϣ(��ʽΪ������,�۸�,��ϵ):");
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
			
			if(menu.getCaixi().equals("����")) {
			line = menu.getName() + "--" + menu.getPrice() + "--" + menu.getCaixi();
			bw.write(line);
			bw.newLine();
			bw.flush();}
			
		}

		bw.close();

	}

}
