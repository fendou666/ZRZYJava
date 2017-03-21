package Knowledge;

public class K3Thread2 implements Runnable {
	private K3StaticMethodLock m;
	
	public K3Thread2(K3StaticMethodLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m2();
	}
}
