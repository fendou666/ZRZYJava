package S9Collection;

import java.util.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;


/**
 * ����ʵ��comparable�ӿ�, ʵ������
 * ��ʵ��equalshashcode�����ظ�ֵҲ��Ӳ���ȥ
 * 
 * 
 * @author Administrator
 *
 */



public class A4TreeSet {
	private TreeSet<BasicClassCMP> bc1 		= new TreeSet<BasicClassCMP>();
	private TreeSet<BasicClassCMPEquals> bce = new TreeSet<BasicClassCMPEquals>();
	private TreeSet<BasicClassCMPHash> bch	= new TreeSet<BasicClassCMPHash>();
	private TreeSet<BasicClassCMPEqualsHash> bceh = new TreeSet<BasicClassCMPEqualsHash>();
	
	public void showData(TreeSet t){
		Iterator iterator = t.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	/**
	 * ���������������
	 * ��δʵ��
	 */
//	public <T> void addData(TreeSet<T> t){
//		t.add(new T(1, "���꼶����", 66.4));
//		t.add(new T(3, "���꼶����", 22.4));
//		t.add(new T(5, "���꼶����", 51.4));
//		t.add(new T(2, "���꼶����", 88.4));
//		t.add(new T(4, "���꼶����", 33.4));
//	}
	
	/**
	 * 
	 * Ҫ�����ʵ��comparable�ӿ�
	 * 
	 */
	public void dataInit(){
		bc1.add(new BasicClassCMP(1, "���꼶����", 66.4));
		bc1.add(new BasicClassCMP(3, "���꼶����", 22.4));
		bc1.add(new BasicClassCMP(5, "���꼶����", 51.4));
		bc1.add(new BasicClassCMP(2, "���꼶����", 88.4));
		bc1.add(new BasicClassCMP(4, "���꼶����", 33.4));
		
		bce.add(new BasicClassCMPEquals(1, "���꼶����", 66.4));
		bce.add(new BasicClassCMPEquals(3, "���꼶����", 22.4));
		bce.add(new BasicClassCMPEquals(5, "���꼶����", 51.4));
		bce.add(new BasicClassCMPEquals(2, "���꼶����", 88.4));
		bce.add(new BasicClassCMPEquals(4, "���꼶����", 33.4));
		
		bch.add(new BasicClassCMPHash(1, "���꼶����", 66.4));
		bch.add(new BasicClassCMPHash(3, "���꼶����", 22.4));
		bch.add(new BasicClassCMPHash(5, "���꼶����", 51.4));
		bch.add(new BasicClassCMPHash(2, "���꼶����", 88.4));
		bch.add(new BasicClassCMPHash(4, "���꼶����", 33.4));
		
		bceh.add(new BasicClassCMPEqualsHash(1, "���꼶����", 66.4));
		bceh.add(new BasicClassCMPEqualsHash(3, "���꼶����", 22.4));
		bceh.add(new BasicClassCMPEqualsHash(5, "���꼶����", 51.4));
		bceh.add(new BasicClassCMPEqualsHash(2, "���꼶����", 88.4));
		bceh.add(new BasicClassCMPEqualsHash(4, "���꼶����", 33.4));
		
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
		bc1.add(new BasicClassCMP(3, "���꼶����", 33.4));
		bc1.add(new BasicClassCMP(3, "���꼶����", 33.4));
		System.out.println("ʵ����com����������ݺ�,TreeSetֻҪʵ����comparable�ӿھͿ�������");
		showData(bc1);
	}
	
	/**
	 * ����ֵ�ɷ��ظ���ͨ��ʵ��equals��hashCode����
	 */
	public void testValueRepetition(){
		bceh.add(new BasicClassCMPEqualsHash(1, "���꼶����", 66.4));
		System.out.println("equals��HashCode����ظ�ֵ��");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.add(new BasicClassCMPEquals(1, "���꼶����", 66.4));
		System.out.println("equals����ظ�ֵ��");
		showData(bce);
		
		bch.add(new BasicClassCMPHash(1, "���꼶����", 66.4));
		System.out.println("HashCode����ظ�ֵ��");
		showData(bch);
	}
	
	
	public static void main(String[] args) {
		A4TreeSet stuData = new A4TreeSet();
		stuData.dataInit();
//		Ĭ���������
		stuData.testDefaultOrder();
//		��ӿ�ֵ����
//		stuData.testAddNull();
//		����������, ����compare��д����Ҫ��ָ������ӣ�����˵����ʱ�����
		stuData.testSort();
//		�ظ�ֵ����, ���Ƿ����HashCode��equals, ����Ϻ󲻻��ظ�����Ҫ��д������Ӻ���Ȼ�ظ�������Ҫ��д��
		stuData.testValueRepetition();
//		���Ե�����equals����HashCode������
		stuData.testValueNotRep();
	}
}
