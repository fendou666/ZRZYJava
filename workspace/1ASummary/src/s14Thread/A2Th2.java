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
				Thread.sleep((int)Math.random()*2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "��ɾ����");
			synchronized(bm.getAlApp()){
				/**
				 * ����дΪ<=0С�ڵ���1������ɾ���̻߳����ִ��notifyall��
				 * ���ҵ�Ŀ������û��wait��ʱ�������߳�ִ��notifyall
				 */
//				while(bm.getAlApp().size()<0){
////					���notifyAll()û��wait���߳������֣�һֱִֻ�е�ǰ�̣߳��·������̶߳���ֹͣ��
////					bm.getAlApp().notifyAll();
//					System.out.println("����߳�ȫ������");
//				}
				while(bm.getAlApp().size()<=0){
					bm.getAlApp().notifyAll();
//					�˴���������wait��Ȼ����߳�һֱռ�ã�
					try {
						bm.getAlApp().wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				bm.removeA();
				
			}
		}
	}
}
