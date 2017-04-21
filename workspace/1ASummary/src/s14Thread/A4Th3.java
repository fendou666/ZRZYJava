package s14Thread;

public class A4Th3  implements Runnable{
	private A4BasicObj obj;

	public A4Th3(A4BasicObj obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		while(true){
			System.out.println("唤醒线程执行中....");
			synchronized(obj){
				System.out.println("进入唤醒线程");
				obj.notifyAll();
//				obj.notify();
				System.out.println("已经全部被唤醒");
			}
		}
	}
}
