
package o20170307Thread;

public class In1ThreadStatic extends Thread {
	private static final int toutle = 20;
	private static int tickerToutle = 20;
	private String name;
	
	public In1ThreadStatic(String name){
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
		In1ThreadStatic obj1 = new In1ThreadStatic("�߳�1");
		In1ThreadStatic obj2 = new In1ThreadStatic("�߳�2");
		In1ThreadStatic obj3 = new In1ThreadStatic("�߳�3");
		In1ThreadStatic obj4 = new In1ThreadStatic("�߳�4");
		In1ThreadStatic obj5 = new In1ThreadStatic("�߳�5");
		In1ThreadStatic obj6 = new In1ThreadStatic("�߳�6");
		
		// ��ͬ�Ķ���ᴴ����ͬ�����ݣ��������ݲ�����
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();
		
		
	}
	
}
