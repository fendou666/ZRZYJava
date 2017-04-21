package s14Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 经过测试发现，直接notifyAll线程后，并不会独占线程，所以notifyAll独占线程是错误的
 * 通过System.err.println()和重定义测试出来的， 重定义将Log写入本地，但是err信息会被打出来
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
		
		A4BasicObj obj = new A4BasicObj(0, "浮云");
		A4Th1 th1 = new  A4Th1(obj);
		A4Th2 th2 = new  A4Th2(obj);
		A4Th3 th3 = new  A4Th3(obj);
		
		new Thread(th1, "增加线程").start();
		new Thread(th2, "减少线程").start();
		new Thread(th3, "唤醒线程").start();
		
//		第一个线程和第二线程先会休息1秒才执行程序， 而第3个唤醒线程没有休息，直接执行notifyAll
//		???关于如果直接是notify而不是notifyAll会如何呢， 是不是只抢占一个线程呢?
		
		//测试是否独占进程， 经过测试并非独占进程，而是独占与此对象相关的所有线程，相当于会独占这个锁
//		new Thread(new A4ThOther(), "其他线程").start();
		
		
	}
}
