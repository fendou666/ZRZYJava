package o20170307Thread;


public class In2RunnableOneObj implements Runnable {
	private static final int toutle = 500;
	private int tickerToutle = 500;
	private String name;
	
	public In2RunnableOneObj(String name){
		this.name = name;
	}
	@Override
	public void run() {
		
		while(tickerToutle>0) {
			System.out.println(Thread.currentThread().getName() +  name + "卖出第" +(toutle - (--tickerToutle)) + "张票");
		}
	}
	
	public static void main(String[] args) {
		// 只创建一个对象，数据必然共享
		In2RunnableOneObj obj1 = new In2RunnableOneObj("一个对象");
		
		// 不同的对象会创建不同的数据，所以数据不共享
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj1);
		Thread th3 = new Thread(obj1);
		Thread th4 = new Thread(obj1);
		Thread th5 = new Thread(obj1);
		Thread th6 = new Thread(obj1);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		
	}

}