package casestudy;

public class Test {
	public static void main(String[] args) {
		Sample sample = new Sample();
		
		Thread t1 = new Thread(new InCreaseThread(sample),"增加线程");
		Thread t2 = new Thread(new DeCreaseThread(sample),"减法线程");
//		Thread t3 = new Thread(new InCreaseThread(sample),"增加线程");
//		Thread t4 = new Thread(new DeCreaseThread(sample),"减法线程");
		
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
		
	}
}
