package basic_20170210;


public class Alipay {
	String userName;
	String pwd;
	double balance;
	
	Alipay(){
		
	};
	
	Alipay(String userName, String pwd,double  balance){
		this.userName = userName;
		this.pwd = pwd;
		this.balance = balance;
	};
	
	/**
	 * 
	 * 存款
	 */
	void deposit(double amount){
		balance += amount;
	};
	void deposit(double amount,String position){
		balance += amount;
	};
	
	//取款
	boolean withdrow(double amount){
		if (balance < amount) {
			System.out.println("余额不足");
			return false;
		}else {
			balance -= amount;
			System.out.println("取出" + amount + "元");
			return true;
		}
		
	};
	
	//余额
	double getBalance () {
		return balance;
	};
	
	public static void main(String[] args) {
		System.out.println("测试是否调用main()方法");
	}
	
}
