package com.chinasoft.menu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.chinasoft.manage.AdminManage;
import com.chinasoft.manage.UserManage;
import com.chinasoft.po.Flower;
import com.chinasoft.po.Order;
import com.chinasoft.po.User;

public class MenuNew {
	private AdminManage admin;
	private UserManage userM;
	private Scanner input = new Scanner(System.in);
	
	public MenuNew(){
		admin = new AdminManage();
	}
	public boolean errorUI(int inputValue, int [] arys){
		for (int i : arys) {
			if(inputValue == i){
				return true;
			}
		}
		return false;
	}
	
	public int firstUI(){
		int inputValue = -1;
		do {
			System.out.println("1��ע��\n2����¼\n3���˳�"
					+ "������");
			inputValue = input.nextInt();
		}while(errorUI(inputValue, new int [] {1,2,3}));
		return inputValue;
	}
	public void firstManage(){
		switch(firstUI()){
		case 1:
			registManage();
			break;
		case 2:
			
			break;
		case 3:
			System.exit(0);
			break;
		}
	}
	public User registUI(){
		System.out.println("�������ָ�ʽ���û���_����_�ֻ���\n��ʽ�����û�������");
		String st = input.next();
		String [] stAry = st.split("_");
		return admin.userAdd(stAry[0], stAry[1],stAry[2]);
	}
	public void registManage(){
		User u = registUI();
		userM = new UserManage(u);
	}
	
	public User loginUI(){
		System.out.println("�������ָ�ʽ���û���_����\n��ʽ�����û�������");
		String st = input.next();
		String [] stAry = st.split("_");
		User u = admin.userVerify(new User(stAry[0], stAry[1]));
		return u;
	}
	
	
	public void haveLoginUI(){
		User u = loginUI();
		if (u == null){
			System.out.println("�������");
			return;
		}
		userM = new UserManage(u);
		if(u.getType().equals("�û�")){
			userOpation();
		}else{
			adminUI();
		}
			
		
	}
	public int userUI(){
		int inputValue = -1;
		do {
			System.out.println("1���鿴��\n2������\n3���鿴����\n4��δ����\n5���ѷ���\n6��ǩ��\n7���û����ؽ���\n8���˳���¼n"
					+ "������");
			inputValue = input.nextInt();
		}while(errorUI(inputValue, new int [] {1,2,3,4,5,6}));
		return inputValue;
	}

	
	public Order creatOrder(){
		Order od = new Order("11", "����", new ArrayList<Flower>());
		Flower getF = null;
		double price = 0;
		while(true){
			System.out.println("�������ָ�ʽ���뻨���_����, ֱ������exit���˳�ѡ��");
			String st = input.next();
			if("exit".equals(st.trim())){
				od.setPrice(price);
				return od;
			}
//			���ڻ��ļ���Ƿ���TODO
			String [] stAry = st.split("_");
			getF = admin.getFlower(Integer.parseInt(stAry[0])  , Integer.parseInt(stAry[1]));
			if (getF == null){
				System.out.println("�����Ŵ���");
			}else {
				od.getFlowers().add(getF);
				price += getF.getPrice()*getF.getCount();
			}
		}
	}
	public String signForUI (){
//		TODO δ�Զ����Ž��в���
		System.out.println("������Ҫǩ�յĶ�����");
		return input.next();
	}
	public void userOpation(){
		switch(userUI()){
		case 1:
			admin.showFlower();
			break;
		case 2:
			userM.addOrder(creatOrder(), admin);;
			break;
		case 3:
			userM.lookOrder();
			break;
		case 4:
			userM.getNoShipments();
			break;
		case 5:
			userM.getShipments();
			break;
		case 6:
			userM.OrderSignFor(signForUI ());
			break;
		case 7:
			return;
		case 8:
//			����֧���˳�����ù���Ա����������˳� TODO �߼�����
			//userM = null;
			break;
		}
	}
	
	public int adminUI(){
		int inputValue = -1;
		do {
			System.out.println("1���鿴��n2�����ӻ�\n3��ɾ����\n4�����Ļ�\n5��δ��������\n6������\n7������������"
					+ "������");
			inputValue = input.nextInt();
		}while(errorUI(inputValue, new int [] {1,2,3,4,5,6}));
		return inputValue;
	}
	public Flower addFlowerUI(){
		Flower f = new Flower(6, "�Ǻ�", 200, 78.8);
		System.out.println("Ҫ���ӵĻ���:" + f);
		return f;
	}
	public Flower deleteFlowerUI(){
		Flower f = new Flower(3, "������", 600, 88.8);
		System.out.println("Ҫɾ���Ļ���:" + f);
		return f;
	}
//	����name֮�ⶼ�����޸�
	public Flower changeFlowerUI(){
		Flower f = new Flower(1, "������", 300, 33.3);
		System.out.println("���ĺ�Ļ���:" + f);
		return f;
	}
	public String signForNumber(){
		System.out.println("������Ҫ�����Ķ�����");
//		TODO�������δ���д���
		return input.next();
	}
	
	public void adminOpation(){
		switch(userUI()){
		case 1:
			admin.showFlower();
			break;
		case 2:
			admin.addFlower(addFlowerUI());
			break;
		case 3:
			admin.delFlower(deleteFlowerUI());
			break;
		case 4:
			admin.changeFlower(changeFlowerUI());
			break;
		case 5:
			admin.getNoShipments();
			break;
		case 6:
			admin.changeOrderToShipments(signForNumber(), userM);
			break;
		case 7:
			return;
		
		}
	}
	public void start() {
		firstManage();
	}
}