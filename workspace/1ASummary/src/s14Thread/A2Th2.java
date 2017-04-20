package s14Thread;

public class A2Th2 implements Runnable {
	private A2BasicManage bm;
	public A2Th2(A2BasicManage bm){
		this.bm = bm;
	}
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "在删除中");
			synchronized(bm.getAlApp()){
				/**
				 * 不可写为<=0小于等于1，这样删除线程会进来执行notifyall，
				 * 而我的目标是在没有wait的时候不能让线程执行notifyall
				 */
				while(bm.getAlApp().size()<0){
//					如果notifyAll()没有wait的线程则会出现，一直只执行当前线程，仿佛其他线程都被停止了
					bm.getAlApp().notifyAll();
					System.out.println("添加线程全部启动");
				}
				System.out.println(Thread.currentThread().getName() + "在删除快中");
				bm.removeA();
			}
		}
	}
}
