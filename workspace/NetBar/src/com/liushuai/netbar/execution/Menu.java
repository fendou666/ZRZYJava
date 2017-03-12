package com.liushuai.netbar.execution;

import java.util.Scanner;

import com.liushuai.netbar.manager.*;

public class Menu {

	private static Scanner input = new Scanner(System.in);
	//优惠 30送10， 50送20， 100送50，200送110，300送180, 500送350
	private static double [][] favorable = {
												{30,10},
												{50,20},
												{100,50},
												{200,110},
												{300,180},
												{500,350}
											};
	private static String [][] area = {
											{"休闲区","30"},
											{"游戏区","30"},
											{"包间","100"}
									  };
	// 设置已拥有的会员
//	public void  setfullMembers(Member [] fullMembers){
//		
//	}
	
	
	
	public void star(){
		Member [] fullMembers = new Member[10000];
		Member [] activeMembers = new Member[1000];
		Positions poss = new Positions(area);
		Admin admin = new Admin(fullMembers, 0, activeMembers, 0, poss.getPositions());
		
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
	
	public Member activeOrNot(Member[] activeMembers,int userId, String pwd) {
		for (int i=0; i<activeMembers.length; i++) {
			if (activeMembers[i].getMemberID() == userId && 
					activeMembers[i].getPos().equals(userId)) {
				return activeMembers[i];
			}
		}
		return null;
	}
	
	public String showPosition() {
		for ()  {
			
		}
	}
	
	public Position selectPostion() {
		int inputArea, computerId;
		String AreaName;
		while (true){
			System.out.println("请选择上网区域");
			System.out.println("1，休闲区");
			System.out.println("2，游戏区");
			System.out.println("3，包间");
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
					AreaName = "休闲区";
					inArea = true;
				}
				break;
			case 2:
				if(computerId>Integer.parseInt(area[0][1]) && computerId <= Integer.parseInt(area[1][1])){
					AreaName = "游戏区";
					inArea = true;
				}
				break;
			case 3:
				if(computerId>Integer.parseInt(area[1][1]) && computerId <= Integer.parseInt(area[2][1])){
					AreaName = "包间";
					inArea = true;
				}
				break;
				default:
					System.out.println("输入机号不在当前区域");
			}
		}
		return new Position(AreaName,  computerId);
	}
	
	public void login(Member[] activeMembers) {
		int userId;
		String pwd;
		Member user;
		Position 
		System.out.println("现在去登陆");
		
		System.out.println("输入会员号");
		userId = input.nextInt();
		System.out.println("输入密码");
		pwd = input.next();
		user = activeOrNot(activeMembers, userId, pwd);
		if (user != null) {
			
			System.out.println("登陆成功，开始上网");
			return;
		} else {
			System.out.println("登陆失败");
			while (true) {
				System.out.println("1,重新登陆, 2,去到吧台激活会员");
				switch (input.next()) {
				case 1:
					break;
				case 2:
					break;
				default:
					System.out.println("输入出错，重新输入");
				}
			}
		}
		
		
	}
	
	
	public void userOperate() {
		while (true) {
			System.out.println("1，未登录，2，我已经登录");
			switch (input.nextInt()) {
			case 1:
				
				break;
			case 2:
				break;
			default:
				System.out.println("输入错误");
			}
		}
		
	}
	public void adminOperate() {
		
	}
	
	public void activeMember(Admin admin, 
							Member [] fullMembers, 
							Member [] activeMembers) {
		
		String memberType;
		String telephone; 
		String identityCard; 
		double money;
		Member newMember;
		int memberId;
		System.out.println("您是会员还是？ \n1，我是VIP，\n我不是会员");
		int isVip = input.nextInt();
		
		if (isVip == 1) {
			System.out.println("请告诉我你的会员号");
			memberId = input.nextInt();
			admin.active(memberId);
		} else {
			System.out.println("您是要办临时还是办会员？ \n1，临时，\n2,会员");
			memberType = input.nextInt() == 2? "正式会员" : "临时会员";
			System.out.println("请把你的身份证给我【输入身份证号码】");
			identityCard = input.next();
			System.out.println("请输入你的手机号码（用于接收密码）");
			telephone = input.next();
			money = recharge(memberType, admin);
			admin.active(memberType, telephone, identityCard, money)
		}
		System.out.println(newMember.toString());
	}
	public double recharge(String memberType, Admin admin) {
		if (memberType == "临时会员") {
			System.out.println("请输入你的充值金额");
			return input.nextDouble();
		} else {
			System.out.println("现在会员充值 优惠 30送10， 50送20， 100送50，"
					+ "200送110，300送180, 500送350");
			double realmoney =  input.nextDouble();
			return admin.memberRechargeFavorable(realmoney, favorable);                                                                                                    
		}
	}
}
