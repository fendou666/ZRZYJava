package Knowledge;

public class K2MethodLock {
	
	public synchronized void m1(){
		
		System.out.println(Thread.currentThread().getName()+ "���뷽��1");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}
		
	}
	public synchronized void m2(){
		System.out.println(Thread.currentThread().getName()+ "���뷽��2");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}	
	}
	public synchronized void m3(){
		System.out.println(Thread.currentThread().getName()+ "���뷽��3");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}
	}
	public synchronized void m4(){
		System.out.println(Thread.currentThread().getName()+ "���뷽��4");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}
	}
	public synchronized void m5(){
		System.out.println(Thread.currentThread().getName()+ "���뷽��5");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "�����У�ͬ����������̶߳����Һ���");
			
		}
	}
	
}
