package Knowledge;

public class K4CommonAndStatic {
	public synchronized void m1(){
		
		System.out.println("��ͬһ�����󴴽���" + Thread.currentThread().getName()+ "������ͨ����");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep((long)Math.random()*3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��ͬһ�����󴴽���" + Thread.currentThread().getName()+ "������");
			
		}
		
	}
	
	public synchronized static void m2(){
		
		System.out.println("��ͬһ�����󴴽���" + Thread.currentThread().getName()+ "���뾲̬����");
		for (int i=0;i<5;i++) {
			try {
//				Thread.sleep((long)Math.random()*3000);
				Thread.sleep((long)Math.random()*3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��ͬһ�����󴴽���" + Thread.currentThread().getName()+ "������");
		}
		
	}
}
