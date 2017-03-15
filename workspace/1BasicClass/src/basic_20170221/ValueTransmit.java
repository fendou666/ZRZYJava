package basic_20170221;

public class ValueTransmit {
	public void basicTransmit(int a) {
		System.out.println("基础值传递形参更改后的值"+ (++a));
	}
	
	public void referenceTransmit(TestClass testClass) {
		testClass.setA(2222);
		System.out.println("引用值传递形参更改后的值"+ testClass.getA());
	}
	
	public void stringTransmit(String str1) {
		str1 = "qweqwe";
		System.out.println("String形参更改后的值"+ str1);
	}
	
	public void newStringTransmit(String str2) {
		str2 = "asdfadf";
		System.out.println("NewString形参更改后的值"+ str2);
	}
	
	public void wrapperTransmit(Integer ing1) {
		ing1 = Integer.valueOf(1000);
		System.out.println("包装类形参更改后的值"+ ing1);
	}
	
	public static void main(String[] args) {
		ValueTransmit t = new ValueTransmit();
		int a = 10;
		TestClass testClass = new TestClass();
		String str1 = "aadfadf";
		String str2 = new String("adsadddxcv");
		Integer ing1 = 100;
		
		t.basicTransmit(a);
		System.out.println("更改方法调用之后基础类型实参的值" + a);
		
		t.referenceTransmit(testClass);
		System.out.println("更改方法调用之后引用类型实参的值" + testClass.getA());
		
		t.stringTransmit(str1);
		System.out.println("更改方法调用之后String类型实参的值" + str1);
		
//		t.newStringTransmit(new String("afsddddddddd"));
//		System.out.println("更改方法调用之后NewString类型实参的值" + );
		
		t.wrapperTransmit(ing1);
		System.out.println("更改方法调用之后包装器类型实参的值" + ing1);
		
	}
	
}
