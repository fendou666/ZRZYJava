package com.chinasofti.manage;

import java.util.Scanner;

import com.chinasofti.po.Admin;
import com.chinasofti.po.Position;
import com.chinasofti.po.User;




public class AdminManage {
	private static Scanner input = new Scanner(System.in);
	//�Ż� 30��10�� 50��20�� 100��50��200��110��300��180, 500��350
	private static double [][] favorable = {
												{30,10},
												{50,20},
												{100,50},
												{200,110},
												{300,180},
												{500,350}
											};
	public static String [][] area = {
											{"������","30"},
											{"��Ϸ��","70"},
											{"����","100"}
									  };
	User [] fullMembers = new User[10000];
	User [] activeMembers = new User[1000];
	Position [] poss = new Position[100];
	Admin admin = new Admin("����С��", "12454442114", "8:00~20:00");
	
	int fullMaxIndex = 0;
	int activeMaxIndex = 0;
	
	public void userInit(){
		fullMembers[0] = new User("��ʽ��Ա", "13679297607", "55154574", 1000);
		fullMaxIndex++;
		System.out.println(fullMembers[0]);
		// λ����Ϣ��ʼ��
		for (int i=0;i<poss.length;i++) {
			if () {
				poss[i] = new Postion();
			}else if() {
				
			}else{
				
			}
			
		}
		
	}
	
	
	// 12Сʱ�󼤻��û�ʧЧ, Ȼ���û������¼���
	
	// ��½��֤
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
		// ����֤
		String identityCard; 
		// �ֻ�����
		String telephone; 
		// ��ֵ���
		double money;
		// ��Ա����
		String memberType;
		// ���ɻ�Ա������
		User newMember;
		
		// ��Ա���ԱID
		int memberId;
		System.out.println("���ǻ�Ա���ǣ� \n1������VIP��\n�Ҳ��ǻ�Ա");
		int isVip = input.nextInt();
		
		if (isVip == 1) {
			while(true) {
				System.out.println("���������Ļ�Ա��");
				memberId = input.nextInt();
				newMember = active(memberId);
				if(newMember != null){
					break;
				}else {
					System.out.println("��Ա�Ŵ���!");
				};
			}
			
		} else {
			System.out.println("����Ҫ����ʱ���ǰ��Ա�� \n1����ʱ��\n2,��Ա");
			memberType = input.nextInt() == 2? "��ʽ��Ա" : "��ʱ��Ա";
			System.out.println("����������֤���ҡ���������֤���롿");
			identityCard = input.next();
			System.out.println("����������ֻ����루���ڽ������룩");
			telephone = input.next();
			// ����ֵ����
			money = recharge(memberType);
			newMember = active(memberType, telephone, identityCard, money);
		}
		System.out.println(newMember.toString());
		return newMember;
	}
	
	// ��ֵ
	public double recharge(String memberType) {
		if (memberType == "��ʱ��Ա") {
			return generalRecharge();
		} else {
			return vipRecharge();                                                                                                
		}
	}	
	// ��ʱ�û���ֵ
	public double generalRecharge() {
		
		System.out.println("��������ĳ�ֵ���");
		return input.nextDouble();
	}
	// ��Ա�Żݳ�ֵ
	public double vipRecharge() {
		System.out.println("���ڻ�Ա��ֵ �Ż� 30��10�� 50��20�� 100��50��"
				+ "200��110��300��180, 500��350");
		System.out.println("������Ҫ��ֵ�Ľ��");
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

	// ����
	public User active(String type, String telephone, String identityCard, double money) {
		User newMember = new User(type, telephone, identityCard, money);
		activeMembers[activeMaxIndex++] = newMember;
		if (type == "��ʽ��Ա") {
			fullMembers[fullMaxIndex++] = newMember;
		} 
		return newMember;
	}
	// ��ʽ��Ա����
	public User active(int id) {
		User member1 = seachById(id);
		if (member1 != null) {
			System.out.println("���������Լ���ʾ״̬");
			// NEEDDO�����������
			member1.setPwd("123456");
			member1.setState("����");
			activeMembers[activeMaxIndex++] = member1;
		}
		return member1;
	}
	
	// ��������
	public User seachInActiveArray(int id) {
		User searchMember = null;
		for (int i=0; i<activeMaxIndex; i++) {
			if(id == activeMembers[i].getMemberID()){
				System.out.println("ͨ��ID�ڼ������һ�Ա�ɹ�");
				searchMember = activeMembers[i];
			} else {
				System.out.println("ͨ��ID�ڼ������һ�Աʧ��");
			}
		}
		return searchMember;
	}
	
	// ��Ա��ͨ����ԱID���һ�Ա
	public User seachById(int id) {
		User searchMember = null;
		for (int i=0; i<fullMaxIndex; i++) {
			if(id == fullMembers[i].getMemberID()){
				System.out.println("ͨ��ID���һ�Ա�ɹ�");
				searchMember = fullMembers[i];
			} else {
				System.out.println("ͨ��ID���һ�Աʧ��");
			}
		}
		return searchMember;
	}
	// λ�ÿ����
	public Position searchByComputerId(int computerId) {
		
		if (computerId <1 || computerId>100) {
			System.out.println("�������������");
			return null;
		}
		
		for (int i=0; i<poss.length; i++) {
			if (computerId == poss[i].getId()){
				return poss[i];
			}
		}
		return null;
	}
	
	// ͳ�Ʒ��� ��Ҫ��ϸȥд
	public double billing(double consumption, String area, int minute) {
		return consumption + 0.05 * minute;
	}
	// ��ֵ
	public void mainRecharge() {
		System.out.println("��������Ի���");
		int computerId = input.nextInt();
		Position pos = searchByComputerId(computerId);
		User u = pos.getUse();
		u.setBalance(recharge(u.getType())); 
		System.out.println(pos.getUse());
	}
	// ����
	public void checkOut() {
		System.out.println("��������Ի���");
		int computerId = input.nextInt();
		Position pos = searchByComputerId(computerId);
		User u = pos.getUse();
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
	// ����
	public void exchangeComputer(UserManage userM) {
		System.out.println("��������Ի���");
		int computerId = input.nextInt();
		Position pos = searchByComputerId(computerId);
		userM.exchangeComputer(pos.getUse());
	}
	// ������ �����ߵȵ�
	public void getMemberInfo() {
		System.out.println("��������Ի���");
		int computerId = input.nextInt();
		Position pos = searchByComputerId(computerId);
		System.out.println(pos.getUse());
	}
	
	
	
	// λ����Ϣ��ʾ
	public void showPosition() {
		for (int i=0;i<poss.length ;i++) {
			if (i==0){
				System.out.println("������:�۸�3Ԫ/ʱ");
			}
			if (i==Integer.parseInt(area[0][1])){
				System.out.println("��Ϸ��");
			}
			if (i==Integer.parseInt(area[1][1])){
				System.out.println("����");
			}
			System.out.print("\t"+(i+1)+"�Ż�[" + (poss[i].isUsed()?"�ϻ�":"����") + "]");
			if(i/10 ==0){
				System.out.println();
			}
		}
	}
	
	
}