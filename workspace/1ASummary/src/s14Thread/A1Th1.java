package s14Thread;

public class A1Th1 implements Runnable {
	private A1BasicManage bm;
	private int len;
	private Object obj ;
	public A1Th1(A1BasicManage bm, int len){
		this.bm = bm;
		this.len = len;
		this.obj = new Object();
	}
	/**
	 * ����֤���߳�һ����wait�� ��������wait��
	 * 
	 */
	
	@Override
	public void run() {
		for(;len<30;){
			/**
			 * �ܽ���뽫�仯�ı���������У�������������Ļ����п����ڱ������ڼ䣬
			 * �����̶߳�ȡ���Ǳ任ǰ��ֵ
			 * 
			 */
//			synchronized(obj){
//				bm.addI("�ַ���:"+len);
//			}
			synchronized(obj){
				bm.addI("�ַ���:"+len);
				len++;
			}
//			bm.addA(new Apple("ƻ��"+len, 22.2));
		}
	}
	
}
