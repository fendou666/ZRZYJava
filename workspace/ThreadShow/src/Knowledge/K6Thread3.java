package Knowledge;

public class K6Thread3 implements Runnable {
	private K6ObjAllLock m;
	
	public K6Thread3(K6ObjAllLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m3();
	}
	
}