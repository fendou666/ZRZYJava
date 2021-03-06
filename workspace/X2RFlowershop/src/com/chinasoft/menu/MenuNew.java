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
			System.out.println("1：注册\n2：登录\n3：退出"
					+ "请输入");
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
		System.out.println("请以这种格式：用户名_密码_手机号\n方式输入用户名密码");
		String st = input.next();
		String [] stAry = st.split("_");
		return admin.userAdd(stAry[0], stAry[1],stAry[2]);
	}
	public void registManage(){
		User u = registUI();
		userM = new UserManage(u);
	}
	
	public User loginUI(){
		System.out.println("请以这种格式：用户名_密码\n方式输入用户名密码");
		String st = input.next();
		String [] stAry = st.split("_");
		User u = admin.userVerify(new User(stAry[0], stAry[1]));
		return u;
	}
	
	
	public void haveLoginUI(){
		User u = loginUI();
		if (u == null){
			System.out.println("输入错误");
			return;
		}
		userM = new UserManage(u);
		if(u.getType().equals("用户")){
			userOpation();
		}else{
			adminUI();
		}
			
		
	}
	public int userUI(){
		int inputValue = -1;
		do {
			System.out.println("1：查看花\n2：购买花\n3：查看订单\n4：未发货\n5：已发货\n6：签收\n7：用户返回界面\n8：退出登录n"
					+ "请输入");
			inputValue = input.nextInt();
		}while(errorUI(inputValue, new int [] {1,2,3,4,5,6}));
		return inputValue;
	}

	
	public Order creatOrder(){
		Order od = new Order("11", "西安", new ArrayList<Flower>());
		Flower getF = null;
		double price = 0;
		while(true){
			System.out.println("请以这种格式输入花编号_数量, 直接输入exit，退出选花");
			String st = input.next();
			if("exit".equals(st.trim())){
				od.setPrice(price);
				return od;
			}
//			对于花的检测是否含有TODO
			String [] stAry = st.split("_");
			getF = admin.getFlower(Integer.parseInt(stAry[0])  , Integer.parseInt(stAry[1]));
			if (getF == null){
				System.out.println("输入编号错误");
			}else {
				od.getFlowers().add(getF);
				price += getF.getPrice()*getF.getCount();
			}
		}
	}
	public String signForUI (){
//		TODO 未对订单号进行测试
		System.out.println("请输入要签收的订单号");
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
//			不能支持退出必须得管理员发货后才能退出 TODO 逻辑更改
			//userM = null;
			break;
		}
	}
	
	public int adminUI(){
		int inputValue = -1;
		do {
			System.out.println("1：查看花n2：增加花\n3：删除花\n4：更改花\n5：未发货订单\n6：发货\n7：返回主界面"
					+ "请输入");
			inputValue = input.nextInt();
		}while(errorUI(inputValue, new int [] {1,2,3,4,5,6}));
		return inputValue;
	}
	public Flower addFlowerUI(){
		Flower f = new Flower(6, "呵呵", 200, 78.8);
		System.out.println("要添加的花是:" + f);
		return f;
	}
	public Flower deleteFlowerUI(){
		Flower f = new Flower(3, "马蹄莲", 600, 88.8);
		System.out.println("要删除的花是:" + f);
		return f;
	}
//	除过name之外都可以修改
	public Flower changeFlowerUI(){
		Flower f = new Flower(1, "郁金香", 300, 33.3);
		System.out.println("更改后的花是:" + f);
		return f;
	}
	public String signForNumber(){
		System.out.println("请输入要发货的订单号");
//		TODO输入错误未进行处理
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
