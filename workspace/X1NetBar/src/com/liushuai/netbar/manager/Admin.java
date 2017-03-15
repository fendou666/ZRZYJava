package com.liushuai.netbar.manager;

public class Admin {
	private String name;
	private String telephone;
	// ���е��Ե�ǰ��ӵ�л�Ա��״̬
	private Member[] poss;
	// ��ǰϵͳ�������
	private Member[] activeMembers;
	// �������������index
	private int activeMaxIndex;
	// ��ʽ��Ա(��Ա��Ļ�Ա)
	private Member[] fullMembers;
	// ��ʽ��Ա�Ѿ����µ����index
	private int fullMaxIndex;
	// ӯ��
	private double realMoney;

		
	public Admin(Member[] fullMembers, int fullMaxIndex, 
				Member[] activeMembers, int activeMaxIndex,
				Member[] poss) {
		this.fullMembers = fullMembers;
		this.activeMembers = activeMembers;
		this.poss = poss;
		this.activeMaxIndex = activeMaxIndex;
		this.fullMaxIndex = fullMaxIndex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Member[] getPoss() {
		return poss;
	}
	public void setPoss(Member[] poss) {
		this.poss = poss;
	}
	public Member[] getActiveMembers() {
		return activeMembers;
	}
	public void setActiveMembers(Member[] activeMembers) {
		this.activeMembers = activeMembers;
	}
	public Member[] getFullMembers() {
		return fullMembers;
	}
	public void setFullMembers(Member[] fullMembers) {
		this.fullMembers = fullMembers;
	}
	
	
	public Member seachById(int id) {
		Member searchMember = null;
		for (int i=0; i<fullMaxIndex; i++) {
			if(id == fullMembers[i].getMemberID()){
				searchMember = fullMembers[i];
			} else {
				System.out.println("ͨ��ID���һ�Աʧ��");
			}
		}
		return searchMember;
	}
	
	
	// ����
	public Member active(String type, String telephone, String identityCard, double money) {
		Member newMember = new Member(telephone, identityCard, money);
		activeMembers[activeMaxIndex++] = newMember;
		if (type == "��ʽ��Ա") {
			fullMembers[fullMaxIndex++] = newMember;
		} 
		return newMember;
	}
	// ��ʽ��Ա����
	public Member active(int id) {
		Member member1 = seachById(id);
		// NEEDDO�����������
		member1.setPwd("asd");
		member1.setState("����");
		return member1;
	}
	// �Ż�
	public double memberRechargeFavorable(double money, double [][] favorable) {
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
	
	// ��ֵ
	public void recharge(int id, double money, double [][] favorable) {
		Member member1 = seachById(id);
		member1.setBalance(memberRechargeFavorable(money,favorable));
	}
	// ����
	public void checkOut(int id) {
		Member member1 = seachById(id);
		member1.checkOut();
		
	}
	// ����
	public void changePos(int id, Position pos) {
		Member member1 = seachById(id);
		member1.changePos(pos);
	}
	public String getPwd(int id) {
		Member member1 = seachById(id);
		return member1.getPwd();
	}
	
	
}
