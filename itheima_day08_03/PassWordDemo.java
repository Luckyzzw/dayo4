package com.lianxi_07;

import java.util.Scanner;

public class PassWordDemo {
	public static void main(String[] args) {
		String username = "wen";
		String password = "0525";
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("��¼�û���");
			String name = sc.nextLine();
			System.out.println("��������");
			String pd = sc.nextLine();
			if (name.equals(username) && pd.equals(password)) {
				System.out.println("��½�ɹ�");
				break;
			} else {
				if (3 - i == 0) {
					System.out.println("��¼ʧ��,��ȴ�30��,�ٴε�¼");
				} else {

					System.out.println("��¼ʧ��,������" + (3 - i) + "�λ���");
				}

			}
		}
	}
}
