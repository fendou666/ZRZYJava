package o20170307Thread;

public class In1Thread extends Thread {
	private static final int toutle = 20;
	private int tickerToutle = 20;
	private String name;
	
	public In1Thread(String name){
		this.name = name;
	}
	
	public void run(){
		// ��Ϊ�̵߳�ԭ��ʹ��i��Ϊ�˿��̹߳������ݵ�����
//		for(int i=0;i<tickerToutle;i++) {
//			System.out.println(name + "������" +i + "��Ʊ");
//		}
		while(tickerToutle>0) {
			System.out.println(name + "������" +(toutle - (--tickerToutle)) + "��Ʊ");
		}
	}
	public static void main(String[] args) {
		In1Thread obj1 = new In1Thread("�߳�1");
		In1Thread obj2 = new In1Thread("�߳�2");
		In1Thread obj3 = new In1Thread("�߳�3");
		In1Thread obj4 = new In1Thread("�߳�4");
		In1Thread obj5 = new In1Thread("�߳�5");
		In1Thread obj6 = new In1Thread("�߳�6");
		
		// ��ͬ�Ķ���ᴴ����ͬ�����ݣ��������ݲ�����
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();
		
//		In1Thread obj7 = new In1Thread("�߳�7");
//		Thread th1 = new 
		
	}
	
}