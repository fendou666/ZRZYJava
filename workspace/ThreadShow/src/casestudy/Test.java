package casestudy;

public class Test {
	public static void main(String[] args) {
		Sample sample = new Sample();
		
		Thread t1 = new Thread(new InCreaseThread(sample),"�����߳�");
		Thread t2 = new Thread(new DeCreaseThread(sample),"�����߳�");
//		Thread t3 = new Thread(new InCreaseThread(sample),"�����߳�");
//		Thread t4 = new Thread(new DeCreaseThread(sample),"�����߳�");
		
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
		
	}
}
