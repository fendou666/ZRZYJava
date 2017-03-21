package Knowledge;

public class K5Thread2 implements Runnable {
	private K5ObjLock m;
	
	public K5Thread2(K5ObjLock m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m2();
	}
	
	
}