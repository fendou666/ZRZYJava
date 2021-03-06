package a1summary;

import java.util.ArrayList;
import java.util.List;

public class Ex20170331 {
	private int a;
	private short b;
	private long c;
	private float d;
	private double e;
	private boolean f;
	private char g;
	private String h;
	private Object o;

	//	当初没有想到用一个方法传不同的参数
	public boolean foo(char c){
		System.out.print(c);
		return true;
	}
	public void testFor(){
		int i = 0;
		for (foo('A');foo('B')&&(i<2);foo('C')){
			System.out.print('D');
			i++;
		}
	}
//	测试对象的默认值
	public void test(){
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
		System.out.println(this.e);
		System.out.println(this.f);
		System.out.println(this.g);
		System.out.println(this.h);
		System.out.println(this.o);
	}
	public void basicTest(){
		int a;
		short b;
		long c;
		float d;
		double e;
		boolean f;
		char g;
		String h;
		Object o = new Object();
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(g);
//		System.out.println(h);
//		System.out.println(o);
	}
	
	public void testBasicType(){
//		basicTest();
//double
		System.out.println(2.0-1.9);
		System.out.println(2.1-2.1);
		System.out.println(2.1-2.0);
		System.out.println(2.0/2);
		System.out.println(2.0/2.0);
		System.out.println((short)10/10.2*2);
		int x=1,y=2,z=3;
//int
//		int的所有计算都回取整
		y+=z--/++x;
//		int为3，double为3.5
		System.out.println(y);
//		不管何时运算++都是最后算,查运算符优先级
		int m = 2;
		System.out.println((m++)/3);
		
		
		
//字符串
		System.out.println("5"+2);
		String [] s = new String[10];
		System.out.println(s[9]);
		System.out.println(s.length);
	}
	
	public void examString(){
//		考题 我认为输出13ttt 结果12t<t>t
//		intern返回常量区的字符串,b[0]实际上是通过b[0]="t"赋值的，所以b[0]==c
//		关于<t>是因为传进数组是的对象引用,所以改变里面的值对象也会改变
		String a = new String("t");
		String [] b = new String[] {"t"};
		String c = a.intern();
		
		if(a.equals(b[0])){
			System.out.print("1");
		}
		if (b[0] ==c){
			System.out.print("2");
		}
		if (a==c) {
			System.out.print("3");
		}
//		这个if是我自己测试加的
		if (a==b[0]) {
			System.out.print("4");
		}
		a = hello(b,c);
		System.out.print(a);
		System.out.print(b[0]);
		System.out.print(c);
		
//		以下为测试部分，经测试hashcode对于字符串相同无用，我认为hashcode调用的就是equals的方法，所以对字符串无用，字符串测试通过intern
//		System.out.println(Integer.toHexString(a.hashCode()));
//		System.out.println(Integer.toHexString(b[0].hashCode()));
//		System.out.println(Integer.toHexString(c.hashCode()));
		String d = new String("t");
		if (a==d) {
			System.out.println("你是来搞笑的吗");
		}
		if (c==d) {
			System.out.println("继续来搞笑的吗");
		}
		
	}
	
	private String hello(String[] b, String c) {
		b[0]="<" + b[0] + ">";
		c.toUpperCase();
		return c;
	}
	//	字符串方法测试
	public void testString(){
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = a.intern();
		if (d==a){
			System.out.println("intern与原值相同");
		}
		if (d==b){
			System.out.println("intern与非new方式的值相同");
		}
		if (d==c){
			System.out.println("intern与new方式的值相同");
		}
		if (a.equals(c)&&d.equals(c)){
			System.out.println("equals比较的是内容相同");
		}
		
		examString();
	}
	public void testArray(){
//		int类型是0
		long [] gg = new long[10];
		System.out.println(gg[0]);
		short [] hh = new short[10];
		System.out.println(hh[0]);
		int [] aa = new int[10];
		System.out.println(aa[0]);
		
		float [] ee = new float[10];
		System.out.println(ee[0]);
//		编译不通过
//		System.out.println(ee[0]F);
		double [] dd = new double[10];
		System.out.println(dd[0]);
		
		boolean [] cc = new boolean[10];
		System.out.println(cc[0]);
		
		String [] bb = new String[10];
		System.out.println(bb[0]);

//		默认为空格
		char [] ff = new char[10];
		System.out.println(ff[0]);
		System.out.println((int)(ff[0]));
		System.out.println(Character.getNumericValue(ff[0]));
		System.out.println(Character.getNumericValue(' '));
		
	}
	
	
	
//	集合测试
	public void testList(){
//		TODO看不懂
		List aa = new ArrayList();
		aa.add("aa");
		aa.add(22);
		aa.add(22.3);
		for (int i=0;i<aa.size();i++){
			System.out.println(aa.get(i));
		}
		@SuppressWarnings("unchecked")
		List<Integer> intList = aa;
		for (int i=0;i<intList.size();i++){
			System.out.println(intList.get(i));
		}
		
//		深度测试
		List<String> strList = new ArrayList<String>();
		strList.add("111");
		strList.add("222");
		strList.add("333");
		List<Integer> inList = strList;
		
		
	}
	
	
	public void testCondition(){
		boolean a = true;
		boolean b = true;
		int c = 2;
		if (a|b){
			
		}
		if (a||b){
					
		}
//		if ((a^b)|c){
//			
//		}
//		if ((a&c)){
//			
//		}
	}
	
	
	public static void main(String[] args) {
		Ex20170331 ex = new Ex20170331();
//		ex.testBasicType();
//		ex.testFor();
//		ex.testString();
//		ex.testArray();
//		ex.testList();
		int a=5;
		int b=3;
		System.out.println(a^b);
//		测试对象的默认值, 经测试对象的默认值与数组中的默认值一样
		ex.test();
//		Object o = new Object();
//		Object p;
//		System.out.println(o);
//		System.out.println(p);
		
	}
}


//	考点1：各类数组new后，数组里面值是否给默认值，默认值是什么
//	考点2：父类引用指向子类对象，父类引用访问属性（子类亦定义），
//	访问的是父类属性， 而访问覆盖方法的时候调用子类方法，并且里面调用的属性优先访问子类的属性（即当子类与父类相同的时候访问的是子类的属性）
//	考点3：关于List不给泛型属性，默认是可以添加任何类型，至于类型转换还不懂
//	考点4：基础类型对于double类型的处理，以及对于++,--前后以及与其他运算符的优先级
//	考点5：关于==,equals方法，对于String 通过intern判断字符串是否在常量区(即是否是通过直接赋值字符的方式初始化字符串)
