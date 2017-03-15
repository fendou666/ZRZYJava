package com.liushuai.netbar.manager;

public class Member {
	// 会员卡号
	private int memberID;
	// 密码
	private String pwd;
	// 身份证
	private String identityCard;
	// 手机
	private String telephone;
	// 余额
	private double balance;
	// 已用时间(小时)
	private double elapsedHour;
	// 消费金额
	private double consumption;
	// 选定机位
	private Position pos;
	// 当前状态
	private String state;
	// 挂机密码
	private String onHookPwd;
	
	// 会员激活
	public Member(String telephone, String identityCard, double money) {
		this.telephone = telephone;
		this.identityCard = identityCard;
		this.memberID = 32123;
		this.pwd = "adfsasdf";
		this.balance = money;
		this.state = "激活";
	}
	// 位置类调用
	public Member(String area, int id, String state) {
		pos = new Position(area, id);
		this.state = state;
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
	public String getonHookPwd() {
		return onHookPwd;
	}
	public void setleavePwd(String onHookPwd) {
		this.onHookPwd = onHookPwd;
	}
	
	// 换机
	public void changePos(Position pos){
		setPos(pos);
	}
	// 挂机
	public void onHook(String onHookPwd) {
		setleavePwd(onHookPwd);
	}
	// 解锁（解除挂机）
	public boolean deblocking(String onHookPwd) {
		if (this.onHookPwd == onHookPwd) {
			return true;
		} else {
			return false;
		}
	}
	
	// 结账
	public void checkOut() {
		balance -= elapsedHour;
		elapsedHour = 0;
		pwd = "";
		consumption = 0;
		pos = null;
		state = "离线";
		onHookPwd = "";
	}
	
	// 会员获取的信息
	public String getInfo() {
		return "会员号" + memberID + ", 余额" + balance
				+ ", 已用时间" + elapsedHour + ", 消费金额"
				+ consumption;
	}
	
	// 管理员获取的信息
	public String toString() {
		return "会员号:" + memberID + ", \n密码:" + pwd
				+ ", \n身份证号码:" + identityCard + ", \n手机号" + telephone
				+ ", \n余额:" + balance + ", \n已用时间:" + elapsedHour
				+ ", \n消费金额:" + consumption + ", \n状态:"+ state
				+ ", \n位置:" + this.pos;
	}
	
	
}
