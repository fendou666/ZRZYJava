package Knowledge;

public class K6Thread4 implements Runnable {
	private K6ObjAllLock m;
	
	public K6Thread4(K6ObjAllLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m4();
	}
	
}