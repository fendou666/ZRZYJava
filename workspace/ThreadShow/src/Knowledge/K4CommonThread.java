package Knowledge;

public class K4CommonThread implements Runnable {
	private K4CommonAndStatic m;
	
	public K4CommonThread(K4CommonAndStatic m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m1();
	}
	
}