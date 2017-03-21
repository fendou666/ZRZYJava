package Knowledge;

public class K3Thread4 implements Runnable {
	private K3StaticMethodLock m;
	
	public K3Thread4(K3StaticMethodLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m4();
	}
}
