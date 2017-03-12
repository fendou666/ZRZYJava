package o20170308ThreadComu;

public class Customer implements Runnable{
	private Info info=null;

	public Customer(Info info) {
		this.info = info;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.info.get();
		}
		
	}
	

}
