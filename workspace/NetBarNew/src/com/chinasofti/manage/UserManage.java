package com.chinasofti.manage;

import java.util.Scanner;

import com.chinasofti.po.Position;
import com.chinasofti.po.User;


public class UserManage {
	
	private Scanner input = new Scanner(System.in);
	Position [] positions;
	String [][] area;
	
	// 获取用户信息
	public void userInfo(User u){
		System.out.println(u.getInfo());
	}
	// 换机 如果分区需要结账
	public void exchangeComputer(User u){
		Position pos = selectPostion();
		if(!pos.getArea().equals( u.getPos().getArea() )) {
			System.out.println("结账操作");
			// TODO
		}
			
		u.setPos(pos);
	}
	// 结账
	public void checkOut(User u) {
		System.out.println("结账方法");
		// 结账
		u.setBalance(u.getBalance()-u.getConsumption());
		// 上机时间清零
		u.setElapsedHour(0);
		// 密码置空
		u.setPwd("");
		// 消费金额置零
		u.setConsumption(0); 
		// 网吧位置置空
		u.setPos(null);
		// 状态设为离线
		u.setState("离线");
		// 挂机密码置空
		u.setOnHookPwd("");
	}
	// 挂机
	public void onHook(User u) {
		String onHookPwdF, onHookPwdS;
		while(true){
			System.out.println("请输入挂机密码");
			onHookPwdF = input.next();
			System.out.println("请再次输入挂机密码");
			onHookPwdS = input.next();
			if(onHookPwdF.equals(onHookPwdS)){
				break;
			}else {
				System.out.println("两次输入挂机密码不同，请重新输入");
			}
		}
		u.setOnHookPwd(onHookPwdF);
		
	}
	// 解锁（解除挂机）
	public void deblocking(User u) {
		String onHookPwd;
		while(true){
			System.out.println("请输入您挂机时设置的密码");
			onHookPwd = input.next();
			if (u.getOnHookPwd() == onHookPwd) {
				break;
			}else {
				System.out.println("输入密码错误");
			}
		}
	}
	public void userMethod(int computerId){
		System.out.println("输入1：查看信息，2：换机，3：结账，4：挂机，5，解锁挂机，6，退出");
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
			// 将位置用户置null
			positions[computerId].setUse(null);
			// 电脑不被使用了
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
			System.out.println("输入错误，重新输入");
		}
	}
	// 下次用StringBuff做
	public void showPosition() {
	
		for (int i=0;i<positions.length ;i++) {
			if (i==0){
				System.out.println("休闲区:价格3元/时");
			}
			if (i==Integer.parseInt(area[0][1])){
				System.out.println("游戏区");
			}
			if (i==Integer.parseInt(area[1][1])){
				System.out.println("包间");
			}
			System.out.print("\t"+(i+1)+"号机[" + (positions[i].isUsed()?"上机":"无人") + "]");
			if(i/10 ==0){
				System.out.println();
			}
		}
		System.out.println("选择自己的机号");
		int computerId = input.nextInt();
		userMethod(computerId);
	}
//	public void userM(User u) {
//		while(true) {
//			System.out.println("请选择你要执行的操作，1，查看信息，2，换机，3，结账，4，挂机，5，退出");
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
//				System.out.println("输入错误，重新输入");
//			}
//			
//		}
//		
//		
//	}
	
	
	public Position selectPostion() {
		int inputArea;
		// 未给值报错TODO
		int computerId = 0;
		String areaName="";
		while (true){
			System.out.println("请选择上网区域");
			System.out.println("1，休闲区[机号1到30]");
			System.out.println("2，游戏区[机号31到70]");
			System.out.println("3，包间[机号71到100]");
			inputArea = input.nextInt();
			if (inputArea<0 || inputArea>3) {
				System.out.println("输入错误，重新选择");
			}else {
				break;
			}
		}
		
		boolean inArea = false;
		while (!inArea) {
			System.out.println("请选择机号");
			computerId = input.nextInt();
			switch (inputArea) {
			case 1:
				if(computerId>0 && computerId <= Integer.parseInt(area[0][1])){
					areaName = "休闲区";
					inArea = true;
				}else {
					System.out.println("输入机号不在当前区域");
				}
				break;
			case 2:
				if(computerId>Integer.parseInt(area[0][1]) && computerId <= Integer.parseInt(area[1][1])){
					areaName = "游戏区";
					inArea = true;
				}else {
					System.out.println("输入机号不在当前区域");
				}
				break;
			case 3:
				if(computerId>Integer.parseInt(area[1][1]) && computerId <= Integer.parseInt(area[2][1])){
					areaName = "包间";
					inArea = true;
				}else {
					System.out.println("输入机号不在当前区域");
				}
				break;
			}
		}
		return new Position(areaName,  computerId);
	}
	
	
	public void login(AdminManage adminM) {
		// 会员卡号
		int id;
		// 会员密码
		String pwd;
		// 会员引用
		User user = null;
		// 用户选择的机子
		Position pos;
		// 将位置数组引用赋值过来
		positions = adminM.poss;
		area = adminM.area;
		System.out.println("现在去登陆");
		pos = selectPostion();
		System.out.println(pos);
		System.out.println("输入会员号");
		id = input.nextInt();
		System.out.println("输入密码");
		pwd = input.next();
		user = adminM.activeOrNot(id, pwd);
		
		if (user != null) {
			// 用户赋值位置信息
			user.setPos(pos);
			
			// 位置信息包含用户
			positions[pos.getId()-1].setUse(user); 
			System.out.println("登陆成功，开始上网");
			return;
		} else {
			System.out.println("登陆失败");
			while (true) {
				System.out.println("1,重新登陆, 2,去到吧台激活会员");
				int i = input.nextInt();
				switch (i) {
				case 1:
					break;
				case 2:
					adminM.activeMember();
					break;
				default:
					System.out.println("输入出错，重新输入");
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
