package Knowledge;

public class K4StaticThread implements Runnable {
	private K4CommonAndStatic m;
	
	public K4StaticThread(K4CommonAndStatic m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m2();
	}
	
}