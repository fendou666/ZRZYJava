package com.chinasofti.po;

public class User {
		// ��Ա����
		private int memberID;
		// ����
		private String pwd;
		// ���֤
		private String identityCard;
		// �ֻ�
		private String telephone;
		// ���
		private double balance;
		// ����ʱ��(Сʱ)
		private double elapsedHour;
		// ���ѽ��
		private double consumption;
		// ѡ����λ
		private Position pos;
		// ��ǰ״̬
		private String state = "����";
		// �һ�����
		private String onHookPwd;
		// ��Ա����
		private String Type;
		
		public User () {
			System.out.println("������User���޲ι��췽��,��Ӧ�ó��������������");
		}
		// ��Ա����
		public User(String type, String telephone, String identityCard, double money) {
			this.telephone = telephone;
			this.identityCard = identityCard;
			this.memberID = 32123;
			this.pwd = "adfsasdf";
			this.balance = money;
			this.state = "����";
			this.Type = Type;
		}
		
	
		
		public int getMemberID() {
			return memberID;
		}
		public void setMemberID(int memberID) {
			this.memberID = memberID;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getIdentityCard() {
			return identityCard;
		}
		public void setIdentityCard(String identityCard) {
			this.identityCard = identityCard;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getElapsedHour() {
			return elapsedHour;
		}
		public void setElapsedHour(double elapsedHour) {
			this.elapsedHour = elapsedHour;
		}
		public double getConsumption() {
			return consumption;
		}
		public void setConsumption(double consumption) {
			this.consumption = consumption;
		}
		public Position getPos() {
			return pos;
		}
		public void setPos(Position pos) {
			this.pos = pos;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getOnHookPwd() {
			return onHookPwd;
		}
		public void setOnHookPwd(String onHookPwd) {
			this.onHookPwd = onHookPwd;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		// ��Ա��ȡ����Ϣ
		public String getInfo() {
			return "��Ա��" + memberID + ", ���" + balance
					+ ", ����ʱ��" + elapsedHour + ", ���ѽ��"
					+ consumption;
		}
		
		// ����Ա��ȡ����Ϣ
		public String toString() {
			return "��Ա��:" + memberID + ", \n����:" + pwd
					+ ", \n���֤����:" + identityCard + ", \n�ֻ���" + telephone
					+ ", \n���:" + balance + ", \n����ʱ��:" + elapsedHour
					+ ", \n���ѽ��:" + consumption + ", \n״̬:"+ state
					+ ", \nλ��:" + this.pos;
		}
}
