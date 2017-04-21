package s14Thread;

public class A2Th1 implements Runnable {
	private A2BasicManage bm;
	private int len;
	private Object obj ;
	public A2Th1(A2BasicManage bm, int len){
		this.bm = bm;
		this.len = len;
		this.obj = new Object();
	}
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep((int)Math.random()*2000);
//				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			synchronized(bm.getAlApp()){
				while(bm.getAlApp().size()>=bm.getAppLength()){
					try {
						System.out.println(Thread.currentThread().getName()+"等待中");
						bm.getAlApp().notifyAll();
//						bm.getAlApp().notify(); 不能写成notify，因为可能唤醒的是生产者，然后生产者wait就会一直生产者wait
						bm.getAlApp().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				bm.addA(new Apple1("苹果:" +len, 11.22));
				len++;
			}
		
		}
			
	}
}
