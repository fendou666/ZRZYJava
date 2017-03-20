package sychronizedSummary;

public class TestMenberVariable {
	public static void main(String[] args) {
		MemberVariable ob1 = new MemberVariable();
//		Thread t1 = new Thread(ob1, "t1");
//		Thread t2 = new Thread(ob1, "t2");
//		t1.start();
//		t2.start();
		
		
		
		// 测试多个对象多个线程的相互影响
		MemberVariable ob2 = new MemberVariable();
		Thread t3 = new Thread(ob1, "t3");
		Thread t4 = new Thread(ob2, "t4");
		t3.start();
		t4.start();
		
		
	}
}
