package s14Thread;

import java.util.ArrayList;

public class A2BasicManage {
	private ArrayList<Apple1> alApp;
	private  final int appLength;
	
	

	public ArrayList<Apple1> getAlApp() {
		return alApp;
	}

	public int getAppLength() {
		return appLength;
	}


	public A2BasicManage(){
		alApp = new ArrayList<Apple1>();
		this.appLength = 20;
	}
	
	public void addA(Apple1 e){
		alApp.add(e);
		System.out.println(Thread.currentThread().getName() + e);
	}
	
	public void removeA(){
		alApp.remove(0);
		System.out.println(Thread.currentThread().getName() + "删除了一个苹果");
	}
	
}

class Apple1{
	
	String name;
	double size;
	
	public Apple1(String name, double size){
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", size=" + size + "]";
	}
	
}

