package Knowledge;

public class K6ObjAllLock {

	
	public void m1(){
//		这里直接锁this对象
		synchronized(this){
			System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ "  进入同步块");
			for (int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ " 在运行，同步块与同步方法形成竞争aaa");
				
			}	
		}
		
	}
	public synchronized void m2(){
		System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ "  进入同步方法");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ " 在运行，同步方法与同步块形成竞争bbbbb");
			
		}	
	}
	public synchronized static void m3(){
		System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ "  进入静态方法");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ " 在运行，静态方法有自己独自的锁，不受同步块锁和同步方法锁影响");
			
		}	
	}
	
}
