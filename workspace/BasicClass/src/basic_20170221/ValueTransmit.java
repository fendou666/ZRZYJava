package basic_20170221;

public class ValueTransmit {
	public void basicTransmit(int a) {
		System.out.println("����ֵ�����βθ��ĺ��ֵ"+ (++a));
	}
	
	public void referenceTransmit(TestClass testClass) {
		testClass.setA(2222);
		System.out.println("����ֵ�����βθ��ĺ��ֵ"+ testClass.getA());
	}
	
	public void stringTransmit(String str1) {
		str1 = "qweqwe";
		System.out.println("String�βθ��ĺ��ֵ"+ str1);
	}
	
	public void newStringTransmit(String str2) {
		str2 = "asdfadf";
		System.out.println("NewString�βθ��ĺ��ֵ"+ str2);
	}
	
	public void wrapperTransmit(Integer ing1) {
		ing1 = Integer.valueOf(1000);
		System.out.println("��װ���βθ��ĺ��ֵ"+ ing1);
	}
	
	public static void main(String[] args) {
		ValueTransmit t = new ValueTransmit();
		int a = 10;
		TestClass testClass = new TestClass();
		String str1 = "aadfadf";
		String str2 = new String("adsadddxcv");
		Integer ing1 = 100;
		
		t.basicTransmit(a);
		System.out.println("���ķ�������֮���������ʵ�ε�ֵ" + a);
		
		t.referenceTransmit(testClass);
		System.out.println("���ķ�������֮����������ʵ�ε�ֵ" + testClass.getA());
		
		t.stringTransmit(str1);
		System.out.println("���ķ�������֮��String����ʵ�ε�ֵ" + str1);
		
//		t.newStringTransmit(new String("afsddddddddd"));
//		System.out.println("���ķ�������֮��NewString����ʵ�ε�ֵ" + );
		
		t.wrapperTransmit(ing1);
		System.out.println("���ķ�������֮���װ������ʵ�ε�ֵ" + ing1);
		
	}
	
}
