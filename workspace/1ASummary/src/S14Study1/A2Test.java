package S14Study1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


/**
 * 通过运行结果得知， synchronized应该放在线程中？
 * 
 * @author Administrator
 * 
 *
 *
 */

public class A2Test {
	public static void main(String[] args) {
//		设置重定向
//		try {
//			System.setOut(new PrintStream(new File("f:\\test.txt")));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		A2BasicManage bm = new A2BasicManage();
		A2Th1 add = new A2Th1(bm,0);
		A2Th2 rmv = new A2Th2(bm);
		
		new Thread(add, "线程1").start();
		new Thread(add, "线程2").start();
		new Thread(add, "线程3").start();
		
		new Thread(rmv, "删除线程1").start();
//		new Thread(rmv, "删除线程2").start();
//		new Thread(rmv, "删除线程3").start();
		
		
	}
}
