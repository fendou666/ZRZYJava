package Knowledge;

public class KTest {
	
	
	public static void main(String[] args) {
//		线程对成员变量和局部变量的影响
//		K1Value thObj1 = new K1Value();
//		Thread th1 = new Thread(thObj1, "线程1");
//		Thread th2 = new Thread(thObj1, "线程2");
//		th1.start();
//		th2.start();
//		同步普通方法锁与静态方法锁
//		K2MethodLock ObjM = new K2MethodLock();
//		Thread th1 = new Thread(new K2Thread1(ObjM),  "线程1");
//		Thread th2 = new Thread(new K2Thread2(ObjM),  "线程2");
//		Thread th3 = new Thread(new K2Thread3(ObjM),  "线程3");
//		Thread th4 = new Thread(new K2Thread4(ObjM),  "线程4");
//		Thread th5 = new Thread(new K2Thread5(ObjM),  "线程5");
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
//		th5.start();
//		静态方法锁
//		K3StaticMethodLock ObjS1 = new K3StaticMethodLock();
//		K3StaticMethodLock ObjS2 = new K3StaticMethodLock();
//		K3StaticMethodLock ObjS3 = new K3StaticMethodLock();
//		K3StaticMethodLock ObjS4 = new K3StaticMethodLock();
//		K3StaticMethodLock ObjS5 = new K3StaticMethodLock();
//		Thread th1 = new Thread(new K3Thread1(ObjS1),  "线程1");
//		Thread th2 = new Thread(new K3Thread2(ObjS2),  "线程2");
//		Thread th3 = new Thread(new K3Thread3(ObjS3),  "线程3");
//		Thread th4 = new Thread(new K3Thread4(ObjS4),  "线程4");
//		Thread th5 = new Thread(new K3Thread5(ObjS5),  "线程5");
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
//		th5.start();
//		静态所与同步锁结合
		K4CommonAndStatic Obj = new K4CommonAndStatic();
		Thread th1 = new Thread(new K4CommonThread(Obj),  "普通方法线程");
		Thread th2 = new Thread(new K4StaticThread(Obj),  "静态方法线程");
		th1.start();
		th2.start();
//		静态方法锁与普通方法锁
		
//		因为每个run调用的对象的方法不同，所以要启动多个线程
//		对象锁

//		等待与唤醒		
	}
}
