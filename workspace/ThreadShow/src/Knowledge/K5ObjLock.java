package Knowledge;

public class K5ObjLock {

	// ��������Ϊ����(�����������)
	private Integer obj = 1;
	
	public void m1(){
		synchronized(obj){
			System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ "  ����ͬ����1");
			for (int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ " �����У���Ա������ͬ�������̲߳��ҵ���ͬ�������Ķ�����ͬ�Ķ����Һ���");
				
			}	
		}
		
	}
	public void m2(){
		synchronized(obj){
			System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ "  ����ͬ����2");
			for (int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ " �����У���Ա������ͬ�������̲߳��ҵ���ͬ�������Ķ�����ͬ�Ķ����Һ���");
				
			}	
		}
	}
}
