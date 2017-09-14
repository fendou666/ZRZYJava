package Knowledge;

public class KTest {
	
	
	public static void main(String[] args) {
//		线程对成员变量和局部变量的影响
//		Thread th1 = new Thread(new K1Value(), "线程1");
//		Thread th2 = new Thread(new K1Value(), "线程2");
//		th1.start();
//		th2.start();
//		证明方法锁就是锁的是当前对象
//		线程的赋值，构造方法，方法传参
//		不论哪种表现形式，只要拥有了相同的成员变量或者传递了相同的参数，他们之间就有了关系
//		这个是表现形式3,为了让他们有关系，我让各个线程拥有相同的成员变量
//		同步普通方法锁与静态方法锁,指的是成员变量对象的锁
//		这是一个纯测试对象，把它创建的对象作为不同线程类创建的不同线程的相同成员变量, K2Thread实现runnable接口
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
//		K3StaticMethodLock ObjS6 = new K3StaticMethodLock();
//		Thread th1 = new Thread(new K3Thread1(ObjS1),  "线程1");
//		Thread th2 = new Thread(new K3Thread2(ObjS2),  "线程2");
//		Thread th3 = new Thread(new K3Thread3(ObjS3),  "线程3");
//		Thread th4 = new Thread(new K3Thread4(ObjS4),  "线程4");
//		Thread th5 = new Thread(new K3Thread5(ObjS5),  "线程5");
//		Thread th6 = new Thread(new K3Thread6(ObjS6),  "线程6"); //同步块取代静态锁
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
//		th5.start();
//		th6.start();
//		静态所与同步锁结合
//		K4CommonAndStatic obj = new K4CommonAndStatic();
//		Thread th1 = new Thread(new K4CommonThread(obj),  "普通方法线程");
//		Thread th2 = new Thread(new K4StaticThread(obj),  "静态方法线程");
//		th1.start();
//		th2.start();
//		因为每个run调用的对象的方法不同，所以要启动多个线程
//		对象锁
//		K5ObjLock obj = new K5ObjLock();
//		Thread th1 = new Thread(new K5Thread1(obj),  "线程1");
//		Thread th2 = new Thread(new K5Thread2(obj),  "线程2");
//		th1.start();
//		th2.start();
		
		// 方法锁，静态锁，对象锁
//		证明只有方法锁锁的是this对象， 一个对象一把锁，另一把锁属于类
//		K6ObjAllLock obj =  new K6ObjAllLock();
//		Thread th1 = new Thread(new K6Thread1(obj),  "同步块线程");
//		Thread th2 = new Thread(new K6Thread2(obj),  "同步方法线程");
//		Thread th3 = new Thread(new K6Thread3(obj),  "静态方法线程");
//		Thread th4 = new Thread(new K6Thread4(obj),  "静态方法类同步块线程");
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
		
//		等待与唤醒		
		K7WaitNotify  obj =  new K7WaitNotify();
//		如果两个线程同时运行看不出效果，因为有可能等待线程还没有运行，唤醒线程已经启动  //这里有问题需要重新整理思路 ，真的一定要按顺序吗
//		先运行等待线程
		Thread th1 = new Thread(new K7Thread1(obj),  "wait线程");
		th1.start();
//		等等待线程运行完毕，在运行唤醒线程(即先将这两行注释掉，在运行)
		Thread th2 = new Thread(new K7Thread2(obj),  "notify线程");
		th2.start();
		
//		一个位置等待，其他位置唤醒
		
	}
}
