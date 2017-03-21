package Knowledge;

public class K2Thread1 implements Runnable {
	private K2MethodLock m;
	
	public K2Thread1(K2MethodLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m1();
	}
	
	
}
