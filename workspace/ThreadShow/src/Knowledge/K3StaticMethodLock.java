package Knowledge;

public class K3StaticMethodLock {
	public synchronized static void m1(){
		
		System.out.println("��1���󴴽���" +Thread.currentThread().getName()+ "���뾲̬����1");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��1���󴴽���" +Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}
		
	}
	public synchronized static  void m2(){
		System.out.println("��2���󴴽���" +Thread.currentThread().getName()+ "���뾲̬����2");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��2���󴴽���" +Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}	
	}
	public synchronized  static void m3(){
		System.out.println("��3���󴴽���" +Thread.currentThread().getName()+ "���뾲̬����3");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��3���󴴽���" +Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}
	}
	public synchronized static  void m4(){
		System.out.println("��4���󴴽���" +Thread.currentThread().getName()+ "���뾲̬����4");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��4���󴴽���" +Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}
	}
	public synchronized static  void m5(){
		System.out.println("��5���󴴽���" +Thread.currentThread().getName()+ "���뾲̬����5");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��5���󴴽���" +Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}
	}
}
