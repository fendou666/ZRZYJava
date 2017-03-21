package Knowledge;

public class K5ObjLock {

	// 变量必须为对象(即对象的引用)
	private Integer obj = 1;
	
	public void m1(){
		synchronized(obj){
			System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ "  进入同步块1");
			for (int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ " 在运行，成员变量相同的其他线程并且调用同步块锁的对象相同的都给我候着");
				
			}	
		}
		
	}
	public void m2(){
		synchronized(obj){
			System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ "  进入同步块2");
			for (int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ " 在运行，成员变量相同的其他线程并且调用同步块锁的对象相同的都给我候着");
				
			}	
		}
	}
}
