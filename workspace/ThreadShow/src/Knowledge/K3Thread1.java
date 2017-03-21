package Knowledge;

public class K3Thread1 implements Runnable {
	private K3StaticMethodLock m;
	
	public K3Thread1(K3StaticMethodLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m1();
	}
}
