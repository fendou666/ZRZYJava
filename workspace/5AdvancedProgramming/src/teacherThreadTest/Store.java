package teacherThreadTest;

import java.util.ArrayList;

public class Store  {
	static ArrayList<apple> b=new ArrayList<apple>();
	//private int i=10;//���
	//public static int count=0;//��Ʒ
	
	public void inProudct(apple a1){
		b.add(a1);
		System.out.println("�����˲�Ʒ"+b.size());
	}
	//�����߹�����Ʒ
	public void outProudct(){
		apple re=b.remove(0);
		//b.remove(0);
		System.out.println("������"+b.size());
	}
	
}
class apple {
	String name;
	public apple(String name) {
		this.name = name;
	}	
}

