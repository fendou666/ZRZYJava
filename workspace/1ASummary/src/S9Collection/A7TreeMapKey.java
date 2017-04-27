package S9Collection;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

public class A7TreeMapKey {
	private TreeMap<BasicClassCMP,String> bc1 		= new TreeMap<BasicClassCMP,String>();
	private TreeMap<BasicClassCMPEquals,String> bce = new TreeMap<BasicClassCMPEquals,String>();
	private TreeMap<BasicClassCMPHash,String> bch	= new TreeMap<BasicClassCMPHash,String>();
	private TreeMap<BasicClassCMPEqualsHash,String> bceh = new TreeMap<BasicClassCMPEqualsHash,String>();
	
	public <T> void showData(TreeMap t){
		Set keySet = t.keySet();
		Iterator iterator = keySet.iterator();
		while(iterator.hasNext()){
			T key = (T) iterator.next();
			System.out.println(key + "    value:" + t.get(key));
		}
	}
	
	/**
	 * ���������������
	 * ��δʵ��
	 */
//	public <T> void putData(TreeMap<T> t){
//		t.put(new T(1, "���꼶����", 66.4));
//		t.put(new T(3, "���꼶����", 22.4));
//		t.put(new T(5, "���꼶����", 51.4));
//		t.put(new T(2, "���꼶����", 88.4));
//		t.put(new T(4, "���꼶����", 33.4));
//	}
	
	public void dataInit(){
		bc1.put(new BasicClassCMP(1, "���꼶����", 66.4), "aaa");
		bc1.put(new BasicClassCMP(3, "���꼶����", 22.4), "aaa");
		bc1.put(new BasicClassCMP(5, "���꼶����", 51.4), "aaa");
		bc1.put(new BasicClassCMP(2, "���꼶����", 88.4), "aaa");
		bc1.put(new BasicClassCMP(4, "���꼶����", 33.4), "aaa");
		
		bce.put(new BasicClassCMPEquals(1, "���꼶����", 66.4), "aaa");
		bce.put(new BasicClassCMPEquals(3, "���꼶����", 22.4), "aaa");
		bce.put(new BasicClassCMPEquals(5, "���꼶����", 51.4), "aaa");
		bce.put(new BasicClassCMPEquals(2, "���꼶����", 88.4), "aaa");
		bce.put(new BasicClassCMPEquals(4, "���꼶����", 33.4), "aaa");
		
		bch.put(new BasicClassCMPHash(1, "���꼶����", 66.4), "aaa");
		bch.put(new BasicClassCMPHash(3, "���꼶����", 22.4), "aaa");
		bch.put(new BasicClassCMPHash(5, "���꼶����", 51.4), "aaa");
		bch.put(new BasicClassCMPHash(2, "���꼶����", 88.4), "aaa");
		bch.put(new BasicClassCMPHash(4, "���꼶����", 33.4), "aaa");
		
		bceh.put(new BasicClassCMPEqualsHash(1, "���꼶����", 66.4), "aaa");
		bceh.put(new BasicClassCMPEqualsHash(3, "���꼶����", 22.4), "aaa");
		bceh.put(new BasicClassCMPEqualsHash(5, "���꼶����", 51.4), "aaa");
		bceh.put(new BasicClassCMPEqualsHash(2, "���꼶����", 88.4), "aaa");
		bceh.put(new BasicClassCMPEqualsHash(4, "���꼶����", 33.4), "aaa");
		
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
	public void testputNull(){
		bc1.put(null, "aaa");
		System.out.println("���Nullֵ�����");
		showData(bc1);
	}
	
	public void testSort(){
//		bc1.c  û�е�����compare������������Ҫ��дcompare����������
		bc1.put(new BasicClassCMP(8, "���꼶����", 88.4), "aaa");
		System.out.println("������ݺ��Զ�����");
		/**
		 * ��֧��ֱ��sort
		 *  * �������ΪTreeMap������
		 */
		showData(bc1);
		
	}
	
	/**
	 * ����ֵ�ɷ��ظ���ͨ��ʵ��equals��hashCode����
	 */
	public void testValueRepetition(){
		bceh.put(new BasicClassCMPEqualsHash(1, "���꼶����", 66.4), "aaa");
		System.out.println("equals��HashCode����ظ�ֵ��");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.put(new BasicClassCMPEquals(1, "���꼶����", 66.4), "aaa");
		System.out.println("equals����ظ�ֵ��");
		showData(bce);
		bch.put(new BasicClassCMPHash(1, "���꼶����", 66.4), "aaa");
		System.out.println("HashCode����ظ�ֵ��");
		showData(bch);
	}
	
	
	public static void main(String[] args) {
		A7TreeMapKey stuData = new A7TreeMapKey();
		stuData.dataInit();
//		Ĭ���������
		stuData.testDefaultOrder();
//		��ӿ�ֵ����
//		stuData.testputNull();
//		����������, ����compare��д����Ҫ��ָ������ӣ�����˵����ʱ�����
		stuData.testSort();
//		�ظ�ֵ����, ���Ƿ����HashCode��equals, ����Ϻ󲻻��ظ�����Ҫ��д������Ӻ���Ȼ�ظ�������Ҫ��д��
		stuData.testValueRepetition();
//		���Ե�����equals����HashCode������
		stuData.testValueNotRep();
	}
}
