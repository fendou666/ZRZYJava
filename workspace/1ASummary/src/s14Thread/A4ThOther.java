package s14Thread;

public class A4ThOther implements Runnable {

	@Override
	public void run() {
		while(true){
			System.err.println("我是另一个线程，和其他线程不共享数据");
		}
	}

}
