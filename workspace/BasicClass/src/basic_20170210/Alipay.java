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
	 * ���
	 */
	void deposit(double amount){
		balance += amount;
	};
	void deposit(double amount,String position){
		balance += amount;
	};
	
	//ȡ��
	boolean withdrow(double amount){
		if (balance < amount) {
			System.out.println("����");
			return false;
		}else {
			balance -= amount;
			System.out.println("ȡ��" + amount + "Ԫ");
			return true;
		}
		
	};
	
	//���
	double getBalance () {
		return balance;
	};
	
	public static void main(String[] args) {
		System.out.println("�����Ƿ����main()����");
	}
	
}
