package S14Study1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


/**
 * ͨ�����н����֪�� synchronizedӦ�÷����߳��У�
 * 
 * @author Administrator
 * 
 *
 *
 */

public class A2Test {
	public static void main(String[] args) {
//		�����ض���
//		try {
//			System.setOut(new PrintStream(new File("f:\\test.txt")));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		A2BasicManage bm = new A2BasicManage();
		A2Th1 add = new A2Th1(bm,0);
		A2Th2 rmv = new A2Th2(bm);
		
		new Thread(add, "�߳�1").start();
		new Thread(add, "�߳�2").start();
		new Thread(add, "�߳�3").start();
		
		new Thread(rmv, "ɾ���߳�1").start();
//		new Thread(rmv, "ɾ���߳�2").start();
//		new Thread(rmv, "ɾ���߳�3").start();
		
		
	}
}
