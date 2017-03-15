package o20170308Thread;

public class In1ThreadName implements Runnable {

	@Override
	public void run() {
		for(int i = 0;i<3;i++){
			System.out.println(Thread.currentThread().getName()+"ÕýÔÚÖ´ÐÐ");
		}
	}
	
	public static void main(String[] args) {
		In1ThreadName obj = new In1ThreadName();
		Thread th0 = new Thread(obj);
		Thread th1 = new Thread(obj);
		Thread th2 = new Thread(obj);
		th0.start();
		th1.start();
		th0.start();
		
	}
	
}
