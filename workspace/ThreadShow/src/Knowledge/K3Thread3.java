package Knowledge;

public class K3Thread3 implements Runnable {
	private K3StaticMethodLock m;
	
	public K3Thread3(K3StaticMethodLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m3();
	}
}
