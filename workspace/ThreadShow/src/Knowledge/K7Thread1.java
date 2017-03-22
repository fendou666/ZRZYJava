package Knowledge;

public class K7Thread1 implements Runnable {
	private K7WaitNotify m;
	
	public K7Thread1(K7WaitNotify m){
		this.m = m;
	}
	@Override
	public void run() {
		m.m1();
	}
	
}