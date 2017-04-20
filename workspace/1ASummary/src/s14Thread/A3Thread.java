package s14Thread;

public class A3Thread implements Runnable {
	private int i = 97;
	
	@Override
	public void run() {
		for(;i<123;i++){
			System.out.println(Thread.currentThread().getName()+ "  " + (char)i);
		}
	}
}
