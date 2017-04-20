package s14Thread;


/**
 * 通过运行结果得知， synchronized应该放在线程中？
 * 
 * @author Administrator
 *
 */

public class A1Test {
	public static void main(String[] args) {
		A1BasicManage bm = new A1BasicManage();
		A1Th1 obj = new A1Th1(bm,0);
		A1Notify nobj = new A1Notify(bm.alint);
		new Thread(obj, "线程1").start();
		new Thread(obj, "线程2").start();
		new Thread(obj, "线程3").start();
		new Thread(nobj, "唤醒线程").start();
	}
}
