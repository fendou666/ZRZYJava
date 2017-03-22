package Knowledge;

public class K7WaitNotify {
	//变量必须为对象(即对象的引用)
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
				System.out.println("我要控制你" +Thread.currentThread().getName()+ " 在第2次停止运行");
				if(i==2){
					try {
						obj.wait();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						///e.printStackTrace();
						//System.out.println("线程被wait");
					}
				}
				System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ " 在运行"+ i + "次，成员变量相同的其他线程并且调用同步块锁的对象相同的都给我候着");
				
			}	
		}
		
	}
	public void m2(){
		synchronized(obj){
			System.out.println(Thread.currentThread().getName()+ "循环2次就唤醒另外一个线程");
			for (int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("拥有相同成员变量的  " +Thread.currentThread().getName()+ " 在运行"+ i + "次，成员变量相同的其他线程并且调用同步块锁的对象相同的都给我候着");
				if(i==2){
					obj.notify();
				}
			}	
			
		}
		
	}
	
	
}


