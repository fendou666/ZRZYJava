package s14Thread;


/**
 * ͨ�����н����֪�� synchronizedӦ�÷����߳��У�
 * 
 * @author Administrator
 *
 */

public class A2Test {
	public static void main(String[] args) {
		A2BasicManage bm = new A2BasicManage();
		A2Th1 add = new A2Th1(bm,0);
		A2Th2 rmv = new A2Th2(bm);
		
		new Thread(add, "�߳�1").start();
		new Thread(add, "�߳�2").start();
		new Thread(add, "�߳�3").start();
		
		new Thread(rmv, "ɾ���߳�1").start();
	}
}
