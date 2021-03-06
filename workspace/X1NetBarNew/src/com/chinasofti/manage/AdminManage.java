package com.chinasofti.manage;

import java.util.Scanner;

import com.chinasofti.po.Admin;
import com.chinasofti.po.Position;
import com.chinasofti.po.User;




public class AdminManage {
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
	public static String [][] area = {
											{"休闲区","30"},
											{"游戏区","70"},
											{"包间","100"}
									  };
	User [] fullMembers = new User[10000];
	User [] activeMembers = new User[1000];
	Position [] poss = new Position[100];
	Admin admin = new Admin("网管小明", "12454442114", "8:00~20:00");
	
	int fullMaxIndex = 0;
	int activeMaxIndex = 0;
	
	public void userInit(){
		fullMembers[0] = new User("正式会员", "13679297607", "55154574", 1000);
		fullMaxIndex++;
		System.out.println(fullMembers[0]);
		// 位置信息初始化
		for (int i=0;i<poss.length;i++) {
			if () {
				poss[i] = new Postion();
			}else if() {
				
			}else{
				
			}
			
		}
		
	}
	
	
	// 12小时后激活用户失效, 然后用户得重新激活
	
	// 登陆验证
	public User activeOrNot(int userId, String pwd) {
		for (int i=0; i<activeMaxIndex; i++) {
			if (activeMembers[i].getMemberID() == userId && 
					activeMembers[i].getPwd().equals(pwd)) {
				return activeMembers[i];
			}
		}
		return null;
	}
	
	
	public User activeMember() {
		// 身份证
		String identityCard; 
		// 手机号码
		String telephone; 
		// 充值金额
		double money;
		// 会员类型
		String memberType;
		// 生成会员的引用
		User newMember;
		
		// 会员库会员ID
		int memberId;
		System.out.println("您是会员还是？ \n1，我是VIP，\n我不是会员");
		int isVip = input.nextInt();
		
		if (isVip == 1) {
			while(true) {
				System.out.println("请告诉我你的会员号");
				memberId = input.nextInt();
				newMember = active(memberId);
				if(newMember != null){
					break;
				}else {
					System.out.println("会员号错误!");
				};
			}
			
		} else {
			System.out.println("您是要办临时还是办会员？ \n1，临时，\n2,会员");
			memberType = input.nextInt() == 2? "正式会员" : "临时会员";
			System.out.println("请把你的身份证给我【输入身份证号码】");
			identityCard = input.next();
			System.out.println("请输入你的手机号码（用于接收密码）");
			telephone = input.next();
			// 金额充值方法
			money = recharge(memberType);
			newMember = active(memberType, telephone, identityCard, money);
		}
		System.out.println(newMember.toString());
		return newMember;
	}
	
	// 充值
	public double recharge(String memberType) {
		if (memberType == "临时会员") {
			return generalRecharge();
		} else {
			return vipRecharge();                                                                                                
		}
	}	
	// 临时用户充值
	public double generalRecharge() {
		
		System.out.println("请输入你的充值金额");
		return input.nextDouble();
	}
	// 会员优惠充值
	public double vipRecharge() {
		System.out.println("现在会员充值 优惠 30送10， 50送20， 100送50，"
				+ "200送110，300送180, 500送350");
		System.out.println("请输入要充值的金额");
		double money =  input.nextDouble();
		
		if (money >=favorable[0][0] && money < favorable[1][0]) {
			money += favorable[0][1];
		} else if(money >=favorable[1][0] && money < favorable[2][0]) {
			money += favorable[1][1];
		}  else if(money >=favorable[2][0] && money < favorable[3][0]) {
			money += favorable[2][1];
		}  else if(money >=favorable[3][0] && money < favorable[4][0]) {
			money += favorable[3][1];
		}  else if(money >=favorable[4][0] && money < favorable[5][0]) {
			money += favorable[4][1];
		}  else {
			money += favorable[5][1];
		} 
		return money;
	}

	// 开卡
	public User active(String type, String telephone, String identityCard, double money) {
		User newMember = new User(type, telephone, identityCard, money);
		activeMembers[activeMaxIndex++] = newMember;
		if (type == "正式会员") {
			fullMembers[fullMaxIndex++] = newMember;
		} 
		return newMember;
	}
	// 正式会员激活
	public User active(int id) {
		User member1 = seachById(id);
		if (member1 != null) {
			System.out.println("设置密码以及显示状态");
			// NEEDDO调用随机密码
			member1.setPwd("123456");
			member1.setState("激活");
			activeMembers[activeMaxIndex++] = member1;
		}
		return member1;
	}
	
	// 激活库查找
	public User seachInActiveArray(int id) {
		User searchMember = null;
		for (int i=0; i<activeMaxIndex; i++) {
			if(id == activeMembers[i].getMemberID()){
				System.out.println("通过ID在激活库查找会员成功");
				searchMember = activeMembers[i];
			} else {
				System.out.println("通过ID在激活库查找会员失败");
			}
		}
		return searchMember;
	}
	
	// 会员库通过会员ID查找会员
	public User seachById(int id) {
		User searchMember = null;
		for (int i=0; i<fullMaxIndex; i++) {
			if(id == fullMembers[i].getMemberID()){
				System.out.println("通过ID查找会员成功");
				searchMember = fullMembers[i];
			} else {
				System.out.println("通过ID查找会员失败");
			}
		}
		return searchMember;
	}
	// 位置库查找
	public Position searchByComputerId(int computerId) {
		
		if (computerId <1 || computerId>100) {
			System.out.println("不存在这个机号");
			return null;
		}
		
		for (int i=0; i<poss.length; i++) {
			if (computerId == poss[i].getId()){
				return poss[i];
			}
		}
		return null;
	}
	
	// 统计费用 需要详细去写
	public double billing(double consumption, String area, int minute) {
		return consumption + 0.05 * minute;
	}
	// 充值
	public void mainRecharge() {
		System.out.println("请输入电脑机号");
		int computerId = input.nextInt();
		Position pos = searchByComputerId(computerId);
		User u = pos.getUse();
		u.setBalance(recharge(u.getType())); 
		System.out.println(pos.getUse());
	}
	// 结账
	public void checkOut() {
		System.out.println("请输入电脑机号");
		int computerId = input.nextInt();
		Position pos = searchByComputerId(computerId);
		User u = pos.getUse();
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
	// 换机
	public void exchangeComputer(UserManage userM) {
		System.out.println("请输入电脑机号");
		int computerId = input.nextInt();
		Position pos = searchByComputerId(computerId);
		userM.exchangeComputer(pos.getUse());
	}
	// 查密码 查在线等等
	public void getMemberInfo() {
		System.out.println("请输入电脑机号");
		int computerId = input.nextInt();
		Position pos = searchByComputerId(computerId);
		System.out.println(pos.getUse());
	}
	
	
	
	// 位置信息显示
	public void showPosition() {
		for (int i=0;i<poss.length ;i++) {
			if (i==0){
				System.out.println("休闲区:价格3元/时");
			}
			if (i==Integer.parseInt(area[0][1])){
				System.out.println("游戏区");
			}
			if (i==Integer.parseInt(area[1][1])){
				System.out.println("包间");
			}
			System.out.print("\t"+(i+1)+"号机[" + (poss[i].isUsed()?"上机":"无人") + "]");
			if(i/10 ==0){
				System.out.println();
			}
		}
	}
	
	
}
