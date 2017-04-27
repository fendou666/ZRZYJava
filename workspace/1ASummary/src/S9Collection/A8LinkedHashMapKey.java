package S9Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class A8LinkedHashMapKey {
	private LinkedHashMap<BasicClass1,String> bc1 		= new LinkedHashMap<BasicClass1,String>();
	private LinkedHashMap<BasicClassEquals,String> bce = new LinkedHashMap<BasicClassEquals,String>();
	private LinkedHashMap<BasicClassHash,String> bch	= new LinkedHashMap<BasicClassHash,String>();
	private LinkedHashMap<BasicClassEqualsHash,String> bceh = new LinkedHashMap<BasicClassEqualsHash,String>();
	private LinkedHashMap<BasicClassCMP,String> bccmp	= new LinkedHashMap<BasicClassCMP,String>();
	
	public <T> void showData(LinkedHashMap t){
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
//	public <T> void putData(LinkedHashMap<T> t){
//		t.put(new T(1, "���꼶����", 66.4));
//		t.put(new T(3, "���꼶����", 22.4));
//		t.put(new T(5, "���꼶����", 51.4));
//		t.put(new T(2, "���꼶����", 88.4));
//		t.put(new T(4, "���꼶����", 33.4));
//	}
	
	public void dataInit(){
		bc1.put(new BasicClass1(1, "���꼶����", 66.4), "aaa");
		bc1.put(new BasicClass1(3, "���꼶����", 22.4), "aaa");
		bc1.put(new BasicClass1(5, "���꼶����", 51.4), "aaa");
		bc1.put(new BasicClass1(2, "���꼶����", 88.4), "aaa");
		bc1.put(new BasicClass1(4, "���꼶����", 33.4), "aaa");
		
		bce.put(new BasicClassEquals(1, "���꼶����", 66.4), "aaa");
		bce.put(new BasicClassEquals(3, "���꼶����", 22.4), "aaa");
		bce.put(new BasicClassEquals(5, "���꼶����", 51.4), "aaa");
		bce.put(new BasicClassEquals(2, "���꼶����", 88.4), "aaa");
		bce.put(new BasicClassEquals(4, "���꼶����", 33.4), "aaa");
		
		bch.put(new BasicClassHash(1, "���꼶����", 66.4), "aaa");
		bch.put(new BasicClassHash(3, "���꼶����", 22.4), "aaa");
		bch.put(new BasicClassHash(5, "���꼶����", 51.4), "aaa");
		bch.put(new BasicClassHash(2, "���꼶����", 88.4), "aaa");
		bch.put(new BasicClassHash(4, "���꼶����", 33.4), "aaa");
		
		bceh.put(new BasicClassEqualsHash(1, "���꼶����", 66.4), "aaa");
		bceh.put(new BasicClassEqualsHash(3, "���꼶����", 22.4), "aaa");
		bceh.put(new BasicClassEqualsHash(5, "���꼶����", 51.4), "aaa");
		bceh.put(new BasicClassEqualsHash(2, "���꼶����", 88.4), "aaa");
		bceh.put(new BasicClassEqualsHash(4, "���꼶����", 33.4), "aaa");
		
		bccmp.put(new BasicClassCMP(1, "���꼶����", 66.4), "aaa");
		bccmp.put(new BasicClassCMP(3, "���꼶����", 22.4), "aaa");
		bccmp.put(new BasicClassCMP(5, "���꼶����", 51.4), "aaa");
		bccmp.put(new BasicClassCMP(2, "���꼶����", 88.4), "aaa");
		bccmp.put(new BasicClassCMP(4, "���꼶����", 33.4), "aaa");
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
		bccmp.put(null, "aaa");
		System.out.println("com�����null���ݺ�");
		/**
		 * ��֧��ֱ��sort
		 *  * �������ΪLinkedHashMap������
		 */
		System.out.println("��ʹʵ����compareTo�ӿ�Ҳ��������");
		showData(bccmp);
		
	}
	
	/**
	 * ����ֵ�ɷ��ظ���ͨ��ʵ��equals��hashCode����
	 */
	public void testValueRepetition(){
		bceh.put(new BasicClassEqualsHash(1, "���꼶����", 66.4), "aaa");
		System.out.println("equals��HashCode����ظ�ֵ��");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.put(new BasicClassEquals(1, "���꼶����", 66.4), "aaa");
		System.out.println("equals����ظ�ֵ��");
		showData(bce);
		
		bch.put(new BasicClassHash(1, "���꼶����", 66.4), "aaa");
		System.out.println("HashCode����ظ�ֵ��");
		showData(bch);
	}
	
	
	public static void main(String[] args) {
		A8LinkedHashMapKey stuData = new A8LinkedHashMapKey();
		stuData.dataInit();
//		Ĭ���������
		stuData.testDefaultOrder();
//		��ӿ�ֵ����
		stuData.testputNull();
//		����������, ����compare��д����Ҫ��ָ������ӣ�����˵����ʱ�����
		stuData.testSort();
//		�ظ�ֵ����, ���Ƿ����HashCode��equals, ����Ϻ󲻻��ظ�����Ҫ��д������Ӻ���Ȼ�ظ�������Ҫ��д��
		stuData.testValueRepetition();
//		���Ե�����equals����HashCode������
		stuData.testValueNotRep();
	}
}
