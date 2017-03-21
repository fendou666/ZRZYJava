package Knowledge;

public class K2Thread4 implements Runnable {
	private K2MethodLock m;
	
	public K2Thread4(K2MethodLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m4();
	}
	
}