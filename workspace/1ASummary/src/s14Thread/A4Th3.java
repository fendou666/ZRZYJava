package s14Thread;

public class A4Th3  implements Runnable{
	private A4BasicObj obj;

	public A4Th3(A4BasicObj obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		while(true){
			System.out.println("�����߳�ִ����....");
			synchronized(obj){
				System.out.println("���뻽���߳�");
				obj.notifyAll();
//				obj.notify();
				System.out.println("�Ѿ�ȫ��������");
			}
		}
	}
}
