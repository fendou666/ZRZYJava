package Knowledge;


public class K2Thread2 implements Runnable {
	private K2MethodLock m;
	
	public K2Thread2(K2MethodLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m2();
	}
	
	
}