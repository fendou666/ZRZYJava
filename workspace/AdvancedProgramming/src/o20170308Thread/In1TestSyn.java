package o20170308Thread;

public class In1TestSyn implements Runnable {
	In1NoA a = new In1NoA();
	In1NoB b = new In1NoB();
	private boolean flag = false;
	
	@Override
	public void run() {
		if(flag){
			synchronized (a) {
				a.say();
				System.out.println("师傅A正在等待师傅B的醋");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else{
			synchronized (b) {
				b.say();
				System.out.println("师傅B正在等待师傅A的酱油");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		In1TestSyn t1 = new In1TestSyn();
		In1TestSyn t2 = new In1TestSyn();
		t1.flag = true;
		t2.flag = false;
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
	}
	
}
