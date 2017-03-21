package Knowledge;

public class K3StaticMethodLock {
	public synchronized static void m1(){
		
		System.out.println("用1对象创建的" +Thread.currentThread().getName()+ "进入静态方法1");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("用1对象创建的" +Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}
		
	}
	public synchronized static  void m2(){
		System.out.println("用2对象创建的" +Thread.currentThread().getName()+ "进入静态方法2");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("用2对象创建的" +Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}	
	}
	public synchronized  static void m3(){
		System.out.println("用3对象创建的" +Thread.currentThread().getName()+ "进入静态方法3");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("用3对象创建的" +Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}
	}
	public synchronized static  void m4(){
		System.out.println("用4对象创建的" +Thread.currentThread().getName()+ "进入静态方法4");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("用4对象创建的" +Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}
	}
	public synchronized static  void m5(){
		System.out.println("用5对象创建的" +Thread.currentThread().getName()+ "进入静态方法5");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("用5对象创建的" +Thread.currentThread().getName()+ "在运行，同对象的其他线程都给我候着");
			
		}
	}
}
