package s14Thread;

import java.util.ArrayList;

public class A1Notify  implements Runnable{
	private ArrayList<String> alintN;
	
	
	public A1Notify(ArrayList<String> alintN) {
		this.alintN = alintN;
	}
	
	@Override
	public void run() {
		for(int i=0;i<30;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("唤醒线程i为" + i);
			/**
			 * 唤醒也必须加synchronized(唤醒对象)
			 * 如果在此锁中唤醒其他的对象呢？？？
			 */
			if(i>20){
//				alintN.notify();
				synchronized(alintN){
//					alintN.notifyAll();
					alintN.notify();
				}
			}
		}
		
	}
	
}
