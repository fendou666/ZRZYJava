package S14Study1;

public class A2Th1 implements Runnable {
	private A2BasicManage bm;
	private int len;
	private Object obj ;          
	
	
	
	public A2Th1(A2BasicManage bm, int len){
		this.bm = bm;
		this.len = len;
		this.obj = new Object();
	}
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep((int)Math.random()*2000);
//				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			synchronized(bm.getAlApp()){
				while(bm.getAlApp().size()>=bm.getAppLength()){
					bm.getAlApp().notifyAll();
					try {
						bm.getAlApp().wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				bm.addA(new Apple1("Æ»¹û:" +len, 11.22));
				len++;
				
				
				
				
				
			}
		
		}
			
	}
}
