package Knowledge;

public class K1Value implements Runnable{
	private int v1 = 10;
	
	public void changeMember(){
		for (int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName() 
					+ " ��Ա��������:" +v1-- 
					+ " �ֲ���������:" +i);
		}
	}
	
	@Override
	public void run() {
		changeMember();
	}
	
	
	
}
