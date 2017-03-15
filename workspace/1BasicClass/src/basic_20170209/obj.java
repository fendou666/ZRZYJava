package basic_20170209;

public class obj {
	public static void main (String[] args) {
		System.out.println("调用构造方法前");
		int a = 10;
		test obj = new test();
		System.out.println("调用构造方法后"
				+ "");
		System.out.println(obj.getA());
		System.out.println(obj.getA());
		obj.setA(1223123);
		System.out.println(obj.getA());
		System.out.println(obj.a);
	}
	
}
