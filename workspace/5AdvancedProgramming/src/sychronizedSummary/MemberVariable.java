package sychronizedSummary;

public class MemberVariable implements Runnable {
	private int i = 10;
	public int j = 10;
	public static int k = 10;
	
	// һ�����󴴽��Ķ���̣߳��ֲ�����Ҳ��COPYһ�ݣ����ֲ��������໥Ӱ��
	public void testValue(){
		int m = 10;
		for (int i=0;i<m; i++) {
			System.out.println(Thread.currentThread().getName() +"i =" +i);
			System.out.println(Thread.currentThread().getName() +"  m =" +m--);
		}
		
	}
	
	//ͬһ�����󴴽��Ķ���̣߳���Ա�������໥Ӱ�죬��Ա����ֻ��һ��
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
	// ����������߳�
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
