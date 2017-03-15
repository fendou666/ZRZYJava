package com.chinasofti.menu;

import java.util.Scanner;

import com.chinasofti.manage.AdminManage;
import com.chinasofti.manage.UserManage;


public class Menu {

	private Scanner input = new Scanner(System.in);
	public UserManage userM = new UserManage();
	public AdminManage adminM = new AdminManage();
	public void star() {
		adminM.userInit();
		while (true) {
			System.out.println("输入1用户，2管理员");
			
			switch(input.nextInt()){
			
			case 1:
				userOperate();
				break;
			case 2:
				adminOperate();
				break;
			default:
				System.out.println("输入错误，请重新输入");
			}
		}
		
	}
	
	public void userOperate() {
		while (true) {
			System.out.println("1，未登录，2，我已经登录，3，退出");
			switch (input.nextInt()) {
			case 1:
				userM.login(adminM);
				break;
			case 2:
				userM.showPosition();
				break;
			case 3:
				return;
			default:
				System.out.println("输入错误");
			}
		}
		
	}
	
	public void adminOperate() {
		while (true) {
			System.out.println("1，激活，2，充值，3，结账，4，换机，5，信息查找，6，位置信息显示看，7，退出");
			switch (input.nextInt()) {
			case 1:
				adminM.activeMember();
				break;
			case 2:
				adminM.mainRecharge();
				break;
			case 3:
				adminM.checkOut();
				break;
			case 4:
				adminM.exchangeComputer(userM);
				break;
			case 5:
				adminM.getMemberInfo();
				break;
			case 6:
				adminM.showPosition();
				break;
			case 7:
				return;
			default:
				System.out.println("输入错误");
			}
		}
	}
	
}
