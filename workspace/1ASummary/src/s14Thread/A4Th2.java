package s14Thread;

public class A4Th2 implements Runnable {
	private A4BasicObj obj;
	

	public A4Th2(A4BasicObj obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		while(true){
			System.err.println(Thread.currentThread().getName()+"进入睡眠");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized(obj){
				while(obj.getI()<0){
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.err.println("进入减线程");
				obj.setI(obj.getI()-1);
			}
		}
	}
}
