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
			System.out.println("����1�û���2����Ա");
			
			switch(input.nextInt()){
			
			case 1:
				userOperate();
				break;
			case 2:
				adminOperate();
				break;
			default:
				System.out.println("�����������������");
			}
		}
		
	}
	
	public void userOperate() {
		while (true) {
			System.out.println("1��δ��¼��2�����Ѿ���¼��3���˳�");
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
				System.out.println("�������");
			}
		}
		
	}
	
	public void adminOperate() {
		while (true) {
			System.out.println("1�����2����ֵ��3�����ˣ�4��������5����Ϣ���ң�6��λ����Ϣ��ʾ����7���˳�");
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
				System.out.println("�������");
			}
		}
	}
	
}
