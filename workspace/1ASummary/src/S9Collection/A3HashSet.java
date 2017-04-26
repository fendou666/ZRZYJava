package S9Collection;

import java.util.HashSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;


public class A3HashSet {
	private HashSet<BasicClass1> bc1 		= new HashSet<BasicClass1>();
	private HashSet<BasicClassEquals> bce = new HashSet<BasicClassEquals>();
	private HashSet<BasicClassHash> bch	= new HashSet<BasicClassHash>();
	private HashSet<BasicClassEqualsHash> bceh = new HashSet<BasicClassEqualsHash>();
	private HashSet<BasicClassCMP> bccmp	= new HashSet<BasicClassCMP>();
	
	public void showData(HashSet t){
		Iterator iterator = t.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	/**
	 * ���������������
	 * ��δʵ��
	 */
//	public <T> void addData(HashSet<T> t){
//		t.add(new T(1, "���꼶����", 66.4));
//		t.add(new T(3, "���꼶����", 22.4));
//		t.add(new T(5, "���꼶����", 51.4));
//		t.add(new T(2, "���꼶����", 88.4));
//		t.add(new T(4, "���꼶����", 33.4));
//	}
	
	public void dataInit(){
		bc1.add(new BasicClass1(1, "���꼶����", 66.4));
		bc1.add(new BasicClass1(3, "���꼶����", 22.4));
		bc1.add(new BasicClass1(5, "���꼶����", 51.4));
		bc1.add(new BasicClass1(2, "���꼶����", 88.4));
		bc1.add(new BasicClass1(4, "���꼶����", 33.4));
		
		bce.add(new BasicClassEquals(1, "���꼶����", 66.4));
		bce.add(new BasicClassEquals(3, "���꼶����", 22.4));
		bce.add(new BasicClassEquals(5, "���꼶����", 51.4));
		bce.add(new BasicClassEquals(2, "���꼶����", 88.4));
		bce.add(new BasicClassEquals(4, "���꼶����", 33.4));
		
		bch.add(new BasicClassHash(1, "���꼶����", 66.4));
		bch.add(new BasicClassHash(3, "���꼶����", 22.4));
		bch.add(new BasicClassHash(5, "���꼶����", 51.4));
		bch.add(new BasicClassHash(2, "���꼶����", 88.4));
		bch.add(new BasicClassHash(4, "���꼶����", 33.4));
		
		bceh.add(new BasicClassEqualsHash(1, "���꼶����", 66.4));
		bceh.add(new BasicClassEqualsHash(3, "���꼶����", 22.4));
		bceh.add(new BasicClassEqualsHash(5, "���꼶����", 51.4));
		bceh.add(new BasicClassEqualsHash(2, "���꼶����", 88.4));
		bceh.add(new BasicClassEqualsHash(4, "���꼶����", 33.4));
		
		bccmp.add(new BasicClassCMP(1, "���꼶����", 66.4));
		bccmp.add(new BasicClassCMP(3, "���꼶����", 22.4));
		bccmp.add(new BasicClassCMP(5, "���꼶����", 51.4));
		bccmp.add(new BasicClassCMP(2, "���꼶����", 88.4));
		bccmp.add(new BasicClassCMP(4, "���꼶����", 33.4));
	}
	
	/**
	 * ��������1. ��������
	 * �ܽ᣺ Ĭ�����Ĭ�����
	 */
	public void testDefaultOrder(){
		showData(bc1);
	}
	/**
	 * ��������������ӿ�ֵ
	 * �ܽ᣺������ӿ�ֵ
	 */
	public void testAddNull(){
		bc1.add(null);
		System.out.println("���Nullֵ�����");
		showData(bc1);
	}
	
	public void testSort(){
//		bc1.c  û�е�����compare������������Ҫ��дcompare����������
		bccmp.add(null);
		System.out.println("com�����null���ݺ�,HashSetֻҪʵ����comparable�ӿھͿ�������??");
		showData(bccmp);
		/**
		 * �������ΪHashSet������
		 */
//		bccmp.sort(new Comparator<BasicClassCMP>(){
//			@Override
//			public int compare(BasicClassCMP o1, BasicClassCMP o2) {
//				return o1.compareTo(o2);
//			}
//		});
	}
	
	/**
	 * ����ֵ�ɷ��ظ���ͨ��ʵ��equals��hashCode����
	 */
	public void testValueRepetition(){
		bceh.add(new BasicClassEqualsHash(1, "���꼶����", 66.4));
		System.out.println("equals��HashCode����ظ�ֵ��");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.add(new BasicClassEquals(1, "���꼶����", 66.4));
		System.out.println("equals����ظ�ֵ��");
		showData(bce);
		
		bch.add(new BasicClassHash(1, "���꼶����", 66.4));
		System.out.println("HashCode����ظ�ֵ��");
		showData(bch);
	}
	
	
	public static void main(String[] args) {
		A3HashSet stuData = new A3HashSet();
		stuData.dataInit();
//		Ĭ���������
		stuData.testDefaultOrder();
//		��ӿ�ֵ����
		stuData.testAddNull();
//		����������, ����compare��д����Ҫ��ָ������ӣ�����˵����ʱ�����
		stuData.testSort();
//		�ظ�ֵ����, ���Ƿ����HashCode��equals, ����Ϻ󲻻��ظ�����Ҫ��д������Ӻ���Ȼ�ظ�������Ҫ��д��
		stuData.testValueRepetition();
//		���Ե�����equals����HashCode������
		stuData.testValueNotRep();
	}
	
}
