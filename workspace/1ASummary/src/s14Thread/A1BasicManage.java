package s14Thread;

import java.util.ArrayList;

public class A1BasicManage {
	public ArrayList<String> alint;
	private ArrayList<Apple> alApp;
	private  final int intLength;
	private  final int appLength;
	
	

	public ArrayList<String> getAlint() {
		return alint;
	}

	public void setAlint(ArrayList<String> alint) {
		this.alint = alint;
	}

	public A1BasicManage(){
		alint = new ArrayList<String>();
		alApp = new ArrayList<Apple>();
		this.intLength = 10;
		this.appLength = 20;
	}
	
	public void addI(String aa){
		synchronized(alint){
//			��wait�����
			while(alint.size()>=intLength){
				try {
					System.out.println("�ַ�������Ϊ��" + alint.size());
					System.out.println(Thread.currentThread().getName()+"����ַ����ȴ���");
					alint.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			alint.add(aa);
			System.out.println(Thread.currentThread().getName() +"�����һ���ַ���:" +aa);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		}
	}
	
	public void removeI(){
		
	}
	
	public void addA(Apple e){
		synchronized(alApp){
			while(alApp.size()>=appLength){
				try {
					System.out.println(Thread.currentThread().getName() + "���ƻ���ȴ���");
					alApp.wait();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			alApp.add(e);
			System.out.println(Thread.currentThread().getName() +"�����һ��ƻ��: " + e);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	
	public void removeA(){
		
	}
	
}

class Apple{
	
	String name;
	double size;
	
	public Apple(String name, double size){
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", size=" + size + "]";
	}
	
}

