package sychronizedSummary;

public class MemberVariable implements Runnable {
	private int i = 10;
	public int j = 10;
	public static int k = 10;
	
	// 一个对象创建的多个线程，局部变量也会COPY一份，即局部变量不相互影响
	public void testValue(){
		int m = 10;
		for (int i=0;i<m; i++) {
			System.out.println(Thread.currentThread().getName() +"i =" +i);
			System.out.println(Thread.currentThread().getName() +"  m =" +m--);
		}
		
	}
	
	//同一个对象创建的多个线程，成员变量会相互影响，成员变量只有一份
	public void testMember(){
		for (int i=0;i<this.i; i++) {
			System.out.print(Thread.currentThread().getName() +"i =" +i);
			System.out.print(Thread.currentThread().getName() +"  this.i =" +this.i--);
			System.out.println();
		}
		for (int i=0;i<j; i++) {
			System.out.print(Thread.currentThread().getName() +"i =" +i);
			System.out.print(Thread.currentThread().getName() +"  j =" +j--);
			System.out.println();
		}
		for (int i=0;i<k; i++) {
			System.out.print(Thread.currentThread().getName() +"i =" +i);
			System.out.print(Thread.currentThread().getName() +"  k =" +k--);
			System.out.println();
		}
		
	}
	// 多个对象多个线程
	public void moreObjMember(){
		for (int i=0;i<j; i++) {
			System.out.print(Thread.currentThread().getName() +"i =" +i);
			System.out.print(Thread.currentThread().getName() +"  j =" +j--);
			System.out.println();
		}
		for (int i=0;i<k; i++) {
			System.out.print(Thread.currentThread().getName() +"i =" +i);
			System.out.print(Thread.currentThread().getName() +"  k =" +k--);
			System.out.println();
		}
		
	}
	
	@Override
	public void run() {
		
		//testValue();
//		testMember();
		moreObjMember();
		
	}

	
}
