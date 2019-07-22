package com.lianxi_07;

import java.util.Scanner;

public class PassWordDemo {
	public static void main(String[] args) {
		String username = "wen";
		String password = "0525";
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("登录用户名");
			String name = sc.nextLine();
			System.out.println("输入密码");
			String pd = sc.nextLine();
			if (name.equals(username) && pd.equals(password)) {
				System.out.println("登陆成功");
				break;
			} else {
				if (3 - i == 0) {
					System.out.println("登录失败,请等待30秒,再次登录");
				} else {

					System.out.println("登录失败,您还有" + (3 - i) + "次机会");
				}

			}
		}
	}
}
