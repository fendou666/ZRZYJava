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
//			先wait后操作
			while(alint.size()>=intLength){
				try {
					System.out.println("字符串长度为：" + alint.size());
					System.out.println(Thread.currentThread().getName()+"添加字符串等待中");
					alint.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			alint.add(aa);
			System.out.println(Thread.currentThread().getName() +"添加了一个字符串:" +aa);
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
					System.out.println(Thread.currentThread().getName() + "添加苹果等待中");
					alApp.wait();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			alApp.add(e);
			System.out.println(Thread.currentThread().getName() +"添加了一个苹果: " + e);
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

