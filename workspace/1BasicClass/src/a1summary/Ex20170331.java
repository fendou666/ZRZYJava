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

	//	����û���뵽��һ����������ͬ�Ĳ���
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
//	���Զ����Ĭ��ֵ
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
//		int�����м��㶼��ȡ��
		y+=z--/++x;
//		intΪ3��doubleΪ3.5
		System.out.println(y);
//		���ܺ�ʱ����++���������,����������ȼ�
		int m = 2;
		System.out.println((m++)/3);
		
		
		
//�ַ���
		System.out.println("5"+2);
		String [] s = new String[10];
		System.out.println(s[9]);
		System.out.println(s.length);
	}
	
	public void examString(){
//		���� ����Ϊ���13ttt ���12t<t>t
//		intern���س��������ַ���,b[0]ʵ������ͨ��b[0]="t"��ֵ�ģ�����b[0]==c
//		����<t>����Ϊ���������ǵĶ�������,���Ըı������ֵ����Ҳ��ı�
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
//		���if�����Լ����Լӵ�
		if (a==b[0]) {
			System.out.print("4");
		}
		a = hello(b,c);
		System.out.print(a);
		System.out.print(b[0]);
		System.out.print(c);
		
//		����Ϊ���Բ��֣�������hashcode�����ַ�����ͬ���ã�����Ϊhashcode���õľ���equals�ķ��������Զ��ַ������ã��ַ�������ͨ��intern
//		System.out.println(Integer.toHexString(a.hashCode()));
//		System.out.println(Integer.toHexString(b[0].hashCode()));
//		System.out.println(Integer.toHexString(c.hashCode()));
		String d = new String("t");
		if (a==d) {
			System.out.println("��������Ц����");
		}
		if (c==d) {
			System.out.println("��������Ц����");
		}
		
	}
	
	private String hello(String[] b, String c) {
		b[0]="<" + b[0] + ">";
		c.toUpperCase();
		return c;
	}
	//	�ַ�����������
	public void testString(){
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = a.intern();
		if (d==a){
			System.out.println("intern��ԭֵ��ͬ");
		}
		if (d==b){
			System.out.println("intern���new��ʽ��ֵ��ͬ");
		}
		if (d==c){
			System.out.println("intern��new��ʽ��ֵ��ͬ");
		}
		if (a.equals(c)&&d.equals(c)){
			System.out.println("equals�Ƚϵ���������ͬ");
		}
		
		examString();
	}
	public void testArray(){
//		int������0
		long [] gg = new long[10];
		System.out.println(gg[0]);
		short [] hh = new short[10];
		System.out.println(hh[0]);
		int [] aa = new int[10];
		System.out.println(aa[0]);
		
		float [] ee = new float[10];
		System.out.println(ee[0]);
//		���벻ͨ��
//		System.out.println(ee[0]F);
		double [] dd = new double[10];
		System.out.println(dd[0]);
		
		boolean [] cc = new boolean[10];
		System.out.println(cc[0]);
		
		String [] bb = new String[10];
		System.out.println(bb[0]);

//		Ĭ��Ϊ�ո�
		char [] ff = new char[10];
		System.out.println(ff[0]);
		System.out.println((int)(ff[0]));
		System.out.println(Character.getNumericValue(ff[0]));
		System.out.println(Character.getNumericValue(' '));
		
	}
	
	
	
//	���ϲ���
	public void testList(){
//		TODO������
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
		
//		��Ȳ���
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
//		���Զ����Ĭ��ֵ, �����Զ����Ĭ��ֵ�������е�Ĭ��ֵһ��
//		ex.test();
//		Object o = new Object();
//		Object p;
//		System.out.println(o);
//		System.out.println(p);
		
	}
}


//	����1����������new����������ֵ�Ƿ��Ĭ��ֵ��Ĭ��ֵ��ʲô
//	����2����������ָ��������󣬸������÷������ԣ������ඨ�壩��
//	���ʵ��Ǹ������ԣ� �����ʸ��Ƿ�����ʱ��������෽��������������õ��������ȷ�����������ԣ����������븸����ͬ��ʱ����ʵ�����������ԣ�
//	����3������List�����������ԣ�Ĭ���ǿ��������κ����ͣ���������ת��������
//	����4���������Ͷ���double���͵Ĵ������Լ�����++,--ǰ���Լ�����������������ȼ�
//	����5������==,equals����������String ͨ��intern�ж��ַ����Ƿ��ڳ�����(���Ƿ���ͨ��ֱ�Ӹ�ֵ�ַ��ķ�ʽ��ʼ���ַ���)