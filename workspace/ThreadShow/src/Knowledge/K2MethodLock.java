package Knowledge;

public class K2MethodLock {
	
	public synchronized void m1(){
		
		System.out.println(Thread.currentThread().getName()+ "进入方法1");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}
		
	}
	public synchronized void m2(){
		System.out.println(Thread.currentThread().getName()+ "进入方法2");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}	
	}
	public synchronized void m3(){
		System.out.println(Thread.currentThread().getName()+ "进入方法3");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}
	}
	public synchronized void m4(){
		System.out.println(Thread.currentThread().getName()+ "进入方法4");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}
	}
	public synchronized void m5(){
		System.out.println(Thread.currentThread().getName()+ "进入方法5");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}
	}
	
}
