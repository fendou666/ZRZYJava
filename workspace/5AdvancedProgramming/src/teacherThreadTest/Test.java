package teacherThreadTest;

public class Test {
	public static void main(String[] args) {
	     Store s=new Store();
		 Producer p =new  Producer(s);
		 customer c=new customer(s);
//		new Thread().start();
		
		Thread t1= new Thread(p);
		Thread t2= new Thread(c);
		//Thread t3= new Thread();
		//Thread t4= new Thread();
		t1.start();
		t2.start();
	}

	
}
