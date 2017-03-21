package Knowledge;

public class K1Value implements Runnable{
	private int v1 = 10;
	
	public void changeMember(){
		for (int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName() 
					+ " 成员变量更改:" +v1-- 
					+ " 局部变量更改:" +i);
		}
	}
	
	@Override
	public void run() {
		changeMember();
	}
	
	
	
}
