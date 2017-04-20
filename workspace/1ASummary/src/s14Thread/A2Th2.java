package s14Thread;

public class A2Th2 implements Runnable {
	private A2BasicManage bm;
	public A2Th2(A2BasicManage bm){
		this.bm = bm;
	}
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "��ɾ����");
			synchronized(bm.getAlApp()){
				while(bm.getAlApp().size()<=0){
					
					bm.getAlApp().notifyAll();
					System.out.println("����߳�ȫ������");
				}
				System.out.println(Thread.currentThread().getName() + "��ɾ������");
				bm.removeA();
			}
		}
	}
}
