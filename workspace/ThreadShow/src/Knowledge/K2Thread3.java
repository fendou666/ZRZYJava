package Knowledge;

public class K2Thread3 implements Runnable {
	private K2MethodLock m;
	
	public K2Thread3(K2MethodLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m3();
	}
	
}