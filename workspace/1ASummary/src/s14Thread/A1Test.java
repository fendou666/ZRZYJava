package s14Thread;


/**
 * ͨ�����н����֪�� synchronizedӦ�÷����߳��У�
 * 
 * @author Administrator
 *
 */

public class A1Test {
	public static void main(String[] args) {
		A1BasicManage bm = new A1BasicManage();
		A1Th1 obj = new A1Th1(bm,0);
		A1Notify nobj = new A1Notify(bm.alint);
		new Thread(obj, "�߳�1").start();
		new Thread(obj, "�߳�2").start();
		new Thread(obj, "�߳�3").start();
		new Thread(nobj, "�����߳�").start();
	}
}
