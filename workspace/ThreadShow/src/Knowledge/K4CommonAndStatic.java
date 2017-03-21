package Knowledge;

public class K4CommonAndStatic {
	public synchronized void m1(){
		
		System.out.println("用同一个对象创建的" + Thread.currentThread().getName()+ "进入普通方法");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep((long)Math.random()*3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("用同一个对象创建的" + Thread.currentThread().getName()+ "在运行");
			
		}
		
	}
	
	public synchronized static void m2(){
		
		System.out.println("用同一个对象创建的" + Thread.currentThread().getName()+ "进入静态方法");
		for (int i=0;i<5;i++) {
			try {
//				Thread.sleep((long)Math.random()*3000);
				Thread.sleep((long)Math.random()*3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("用同一个对象创建的" + Thread.currentThread().getName()+ "在运行");
		}
		
	}
}
