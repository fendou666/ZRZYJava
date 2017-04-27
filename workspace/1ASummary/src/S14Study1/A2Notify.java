package S14Study1;

import java.util.ArrayList;

public class A2Notify  implements Runnable{
	private ArrayList<String> alintN;
	
	
	public A2Notify(ArrayList<String> alintN) {
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
			System.out.println("�����߳�iΪ" + i);
			/**
			 * ����Ҳ�����synchronized(���Ѷ���)
			 * ����ڴ����л��������Ķ����أ�����
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