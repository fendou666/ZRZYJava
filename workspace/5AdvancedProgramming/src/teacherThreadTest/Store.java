package teacherThreadTest;

import java.util.ArrayList;

public class Store  {
	static ArrayList<apple> b=new ArrayList<apple>();
	//private int i=10;//库存
	//public static int count=0;//产品
	
	public void inProudct(apple a1){
		b.add(a1);
		System.out.println("生产了产品"+b.size());
	}
	//消费者购买商品
	public void outProudct(){
		apple re=b.remove(0);
		//b.remove(0);
		System.out.println("消费了"+b.size());
	}
	
}
class apple {
	String name;
	public apple(String name) {
		this.name = name;
	}	
}

