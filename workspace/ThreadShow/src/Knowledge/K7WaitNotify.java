package Knowledge;

public class K7WaitNotify {
	//��������Ϊ����(�����������)
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
				System.out.println("��Ҫ������" +Thread.currentThread().getName()+ " �ڵ�2��ֹͣ����");
				if(i==2){
					try {
						obj.wait();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						///e.printStackTrace();
						//System.out.println("�̱߳�wait");
					}
				}
				System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ " ������"+ i + "�Σ���Ա������ͬ�������̲߳��ҵ���ͬ�������Ķ�����ͬ�Ķ����Һ���");
				
			}	
		}
		
	}
	public void m2(){
		synchronized(obj){
			System.out.println(Thread.currentThread().getName()+ "ѭ��2�ξͻ�������һ���߳�");
			for (int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ӵ����ͬ��Ա������  " +Thread.currentThread().getName()+ " ������"+ i + "�Σ���Ա������ͬ�������̲߳��ҵ���ͬ�������Ķ�����ͬ�Ķ����Һ���");
				if(i==2){
					obj.notify();
				}
			}	
			
		}
		
	}
	
	
}

