package Knowledge;

public class K6ObjAllLock {

	
	public void m1(){
//		����ֱ����this����
		synchronized(this){
			System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ "  ����ͬ����");
			for (int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ " �����У�ͬ������ͬ�������γɾ���aaa");
				
			}	
		}
		
	}
	public synchronized void m2(){
		System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ "  ����ͬ������");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ " �����У�ͬ��������ͬ�����γɾ���bbbbb");
			
		}	
	}
	public synchronized static void m3(){
		System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ "  ���뾲̬����");
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ " �����У���̬�������Լ����Ե���������ͬ��������ͬ��������Ӱ��");
			
		}	
	}
	
}
