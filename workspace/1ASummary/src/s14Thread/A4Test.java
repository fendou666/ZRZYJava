package s14Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * �������Է��֣�ֱ��notifyAll�̺߳󣬲������ռ�̣߳�����notifyAll��ռ�߳��Ǵ����
 * ͨ��System.err.println()���ض�����Գ����ģ� �ض��彫Logд�뱾�أ�����err��Ϣ�ᱻ�����
 * 
 * @author Administrator
 *
 */

public class A4Test {
	public static void main(String[] args) {
		try {
			System.setOut(new PrintStream(new File("f://2.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		A4BasicObj obj = new A4BasicObj(0, "����");
		A4Th1 th1 = new  A4Th1(obj);
		A4Th2 th2 = new  A4Th2(obj);
		A4Th3 th3 = new  A4Th3(obj);
		
		new Thread(th1, "�����߳�").start();
		new Thread(th2, "�����߳�").start();
		new Thread(th3, "�����߳�").start();
		
//		��һ���̺߳͵ڶ��߳��Ȼ���Ϣ1���ִ�г��� ����3�������߳�û����Ϣ��ֱ��ִ��notifyAll
//		???�������ֱ����notify������notifyAll������أ� �ǲ���ֻ��ռһ���߳���?
		
		//�����Ƿ��ռ���̣� �������Բ��Ƕ�ռ���̣����Ƕ�ռ��˶�����ص������̣߳��൱�ڻ��ռ�����
//		new Thread(new A4ThOther(), "�����߳�").start();
		
		
	}
}
