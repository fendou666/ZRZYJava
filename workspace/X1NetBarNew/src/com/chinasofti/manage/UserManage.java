package com.chinasofti.manage;

import java.util.Scanner;

import com.chinasofti.po.Position;
import com.chinasofti.po.User;


public class UserManage {
	
	private Scanner input = new Scanner(System.in);
	Position [] positions;
	String [][] area;
	
	// ��ȡ�û���Ϣ
	public void userInfo(User u){
		System.out.println(u.getInfo());
	}
	// ���� ���������Ҫ����
	public void exchangeComputer(User u){
		Position pos = selectPostion();
		if(!pos.getArea().equals( u.getPos().getArea() )) {
			System.out.println("���˲���");
			// TODO
		}
			
		u.setPos(pos);
	}
	// ����
	public void checkOut(User u) {
		System.out.println("���˷���");
		// ����
		u.setBalance(u.getBalance()-u.getConsumption());
		// �ϻ�ʱ������
		u.setElapsedHour(0);
		// �����ÿ�
		u.setPwd("");
		// ���ѽ������
		u.setConsumption(0); 
		// ����λ���ÿ�
		u.setPos(null);
		// ״̬��Ϊ����
		u.setState("����");
		// �һ������ÿ�
		u.setOnHookPwd("");
	}
	// �һ�
	public void onHook(User u) {
		String onHookPwdF, onHookPwdS;
		while(true){
			System.out.println("������һ�����");
			onHookPwdF = input.next();
			System.out.println("���ٴ�����һ�����");
			onHookPwdS = input.next();
			if(onHookPwdF.equals(onHookPwdS)){
				break;
			}else {
				System.out.println("��������һ����벻ͬ������������");
			}
		}
		u.setOnHookPwd(onHookPwdF);
		
	}
	// ����������һ���
	public void deblocking(User u) {
		String onHookPwd;
		while(true){
			System.out.println("���������һ�ʱ���õ�����");
			onHookPwd = input.next();
			if (u.getOnHookPwd() == onHookPwd) {
				break;
			}else {
				System.out.println("�����������");
			}
		}
	}
	public void userMethod(int computerId){
		System.out.println("����1���鿴��Ϣ��2��������3�����ˣ�4���һ���5�������һ���6���˳�");
		User u = positions[computerId].getUse();
		switch(input.nextInt()){
		case 1:
			userInfo(u);
			break;
		case 2:
			exchangeComputer(u);
			break;
		case 3:
			checkOut(u);
			// ��λ���û���null
			positions[computerId].setUse(null);
			// ���Բ���ʹ����
			positions[computerId].setUsed(false);
			break;
		case 4:
			onHook(u);
			break;
		case 5:
			deblocking(u);
			return;
		case 6:
			return;
			//break;
		default:
			System.out.println("���������������");
		}
	}
	// �´���StringBuff��
	public void showPosition() {
	
		for (int i=0;i<positions.length ;i++) {
			if (i==0){
				System.out.println("������:�۸�3Ԫ/ʱ");
			}
			if (i==Integer.parseInt(area[0][1])){
				System.out.println("��Ϸ��");
			}
			if (i==Integer.parseInt(area[1][1])){
				System.out.println("����");
			}
			System.out.print("\t"+(i+1)+"�Ż�[" + (positions[i].isUsed()?"�ϻ�":"����") + "]");
			if(i/10 ==0){
				System.out.println();
			}
		}
		System.out.println("ѡ���Լ��Ļ���");
		int computerId = input.nextInt();
		userMethod(computerId);
	}
//	public void userM(User u) {
//		while(true) {
//			System.out.println("��ѡ����Ҫִ�еĲ�����1���鿴��Ϣ��2��������3�����ˣ�4���һ���5���˳�");
//			switch(input.nextInt()){
//			case 1:
//				
//				break;
//			case 2:
//				break;
//			case 3:
//				break;
//			case 4:
//				break;
//			case 5:
//				return;
//			default:
//				System.out.println("���������������");
//			}
//			
//		}
//		
//		
//	}
	
	
	public Position selectPostion() {
		int inputArea;
		// δ��ֵ����TODO
		int computerId = 0;
		String areaName="";
		while (true){
			System.out.println("��ѡ����������");
			System.out.println("1��������[����1��30]");
			System.out.println("2����Ϸ��[����31��70]");
			System.out.println("3������[����71��100]");
			inputArea = input.nextInt();
			if (inputArea<0 || inputArea>3) {
				System.out.println("�����������ѡ��");
			}else {
				break;
			}
		}
		
		boolean inArea = false;
		while (!inArea) {
			System.out.println("��ѡ�����");
			computerId = input.nextInt();
			switch (inputArea) {
			case 1:
				if(computerId>0 && computerId <= Integer.parseInt(area[0][1])){
					areaName = "������";
					inArea = true;
				}else {
					System.out.println("������Ų��ڵ�ǰ����");
				}
				break;
			case 2:
				if(computerId>Integer.parseInt(area[0][1]) && computerId <= Integer.parseInt(area[1][1])){
					areaName = "��Ϸ��";
					inArea = true;
				}else {
					System.out.println("������Ų��ڵ�ǰ����");
				}
				break;
			case 3:
				if(computerId>Integer.parseInt(area[1][1]) && computerId <= Integer.parseInt(area[2][1])){
					areaName = "����";
					inArea = true;
				}else {
					System.out.println("������Ų��ڵ�ǰ����");
				}
				break;
			}
		}
		return new Position(areaName,  computerId);
	}
	
	
	public void login(AdminManage adminM) {
		// ��Ա����
		int id;
		// ��Ա����
		String pwd;
		// ��Ա����
		User user = null;
		// �û�ѡ��Ļ���
		Position pos;
		// ��λ���������ø�ֵ����
		positions = adminM.poss;
		area = adminM.area;
		System.out.println("����ȥ��½");
		pos = selectPostion();
		System.out.println(pos);
		System.out.println("�����Ա��");
		id = input.nextInt();
		System.out.println("��������");
		pwd = input.next();
		user = adminM.activeOrNot(id, pwd);
		
		if (user != null) {
			// �û���ֵλ����Ϣ
			user.setPos(pos);
			
			// λ����Ϣ�����û�
			positions[pos.getId()-1].setUse(user); 
			System.out.println("��½�ɹ�����ʼ����");
			return;
		} else {
			System.out.println("��½ʧ��");
			while (true) {
				System.out.println("1,���µ�½, 2,ȥ����̨�����Ա");
				int i = input.nextInt();
				switch (i) {
				case 1:
					break;
				case 2:
					adminM.activeMember();
					break;
				default:
					System.out.println("���������������");
				}
				if(i == 1) {
					break;
				}
			}
		}
	}
	public void haveLogin() {
		
	}
	
	
}
