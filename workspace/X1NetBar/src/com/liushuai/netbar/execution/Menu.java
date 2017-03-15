package com.liushuai.netbar.execution;

import java.util.Scanner;

import com.liushuai.netbar.manager.*;

public class Menu {

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
	private static String [][] area = {
											{"������","30"},
											{"��Ϸ��","30"},
											{"����","100"}
									  };
	// ������ӵ�еĻ�Ա
//	public void  setfullMembers(Member [] fullMembers){
//		
//	}
	
	
	
	public void star(){
		Member [] fullMembers = new Member[10000];
		Member [] activeMembers = new Member[1000];
		Positions poss = new Positions(area);
		Admin admin = new Admin(fullMembers, 0, activeMembers, 0, poss.getPositions());
		
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
			System.out.println("��ѡ����������");
			System.out.println("1��������");
			System.out.println("2����Ϸ��");
			System.out.println("3������");
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
					AreaName = "������";
					inArea = true;
				}
				break;
			case 2:
				if(computerId>Integer.parseInt(area[0][1]) && computerId <= Integer.parseInt(area[1][1])){
					AreaName = "��Ϸ��";
					inArea = true;
				}
				break;
			case 3:
				if(computerId>Integer.parseInt(area[1][1]) && computerId <= Integer.parseInt(area[2][1])){
					AreaName = "����";
					inArea = true;
				}
				break;
				default:
					System.out.println("������Ų��ڵ�ǰ����");
			}
		}
		return new Position(AreaName,  computerId);
	}
	
	public void login(Member[] activeMembers) {
		int userId;
		String pwd;
		Member user;
		Position 
		System.out.println("����ȥ��½");
		
		System.out.println("�����Ա��");
		userId = input.nextInt();
		System.out.println("��������");
		pwd = input.next();
		user = activeOrNot(activeMembers, userId, pwd);
		if (user != null) {
			
			System.out.println("��½�ɹ�����ʼ����");
			return;
		} else {
			System.out.println("��½ʧ��");
			while (true) {
				System.out.println("1,���µ�½, 2,ȥ����̨�����Ա");
				switch (input.next()) {
				case 1:
					break;
				case 2:
					break;
				default:
					System.out.println("���������������");
				}
			}
		}
		
		
	}
	
	
	public void userOperate() {
		while (true) {
			System.out.println("1��δ��¼��2�����Ѿ���¼");
			switch (input.nextInt()) {
			case 1:
				
				break;
			case 2:
				break;
			default:
				System.out.println("�������");
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
		System.out.println("���ǻ�Ա���ǣ� \n1������VIP��\n�Ҳ��ǻ�Ա");
		int isVip = input.nextInt();
		
		if (isVip == 1) {
			System.out.println("���������Ļ�Ա��");
			memberId = input.nextInt();
			admin.active(memberId);
		} else {
			System.out.println("����Ҫ����ʱ���ǰ��Ա�� \n1����ʱ��\n2,��Ա");
			memberType = input.nextInt() == 2? "��ʽ��Ա" : "��ʱ��Ա";
			System.out.println("���������֤���ҡ��������֤���롿");
			identityCard = input.next();
			System.out.println("����������ֻ����루���ڽ������룩");
			telephone = input.next();
			money = recharge(memberType, admin);
			admin.active(memberType, telephone, identityCard, money)
		}
		System.out.println(newMember.toString());
	}
	public double recharge(String memberType, Admin admin) {
		if (memberType == "��ʱ��Ա") {
			System.out.println("��������ĳ�ֵ���");
			return input.nextDouble();
		} else {
			System.out.println("���ڻ�Ա��ֵ �Ż� 30��10�� 50��20�� 100��50��"
					+ "200��110��300��180, 500��350");
			double realmoney =  input.nextDouble();
			return admin.memberRechargeFavorable(realmoney, favorable);                                                                                                    
		}
	}
}
