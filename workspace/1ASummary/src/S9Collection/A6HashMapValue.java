package S9Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A6HashMapValue {
	private HashMap<String, BasicClass1> bc1 		= new HashMap<String, BasicClass1>();
	private HashMap<String, BasicClassEquals> bce = new HashMap<String, BasicClassEquals>();
	private HashMap<String, BasicClassHash> bch	= new HashMap<String, BasicClassHash>();
	private HashMap<String, BasicClassEqualsHash> bceh = new HashMap<String, BasicClassEqualsHash>();
	private HashMap<String, BasicClassCMP> bccmp	= new HashMap<String, BasicClassCMP>();
	
	public <T> void showData(HashMap t){
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
//	public <T> void putData(HashMap<T> t){
//		t.put(new T(1, "���꼶����", 66.4));
//		t.put(new T(3, "���꼶����", 22.4));
//		t.put(new T(5, "���꼶����", 51.4));
//		t.put(new T(2, "���꼶����", 88.4));
//		t.put(new T(4, "���꼶����", 33.4));
//	}
	
	public void dataInit(){
		bc1.put("aaa", new BasicClass1(1, "���꼶����", 66.4));
		bc1.put("ccc", new BasicClass1(3, "���꼶����", 22.4));
		bc1.put("ggg", new BasicClass1(5, "���꼶����", 51.4));
		bc1.put("ax", new BasicClass1(2, "���꼶����", 88.4));
		bc1.put("bwe", new BasicClass1(4, "���꼶����", 33.4));
		
		bce.put("aaa", new BasicClassEquals(1, "���꼶����", 66.4));
		bce.put("ccc", new BasicClassEquals(3, "���꼶����", 22.4));
		bce.put("ggg", new BasicClassEquals(5, "���꼶����", 51.4));
		bce.put("ax", new BasicClassEquals(2, "���꼶����", 88.4));
		bce.put("bwe", new BasicClassEquals(4, "���꼶����", 33.4));

		bch.put("aaa", new BasicClassHash(1, "���꼶����", 66.4));
		bch.put("ccc", new BasicClassHash(3, "���꼶����", 22.4));
		bch.put("ggg", new BasicClassHash(5, "���꼶����", 51.4));
		bch.put("ax", new BasicClassHash(2, "���꼶����", 88.4));
		bch.put("bwe", new BasicClassHash(4, "���꼶����", 33.4));
		
		bceh.put("aaa", new BasicClassEqualsHash(1, "���꼶����", 66.4));
		bceh.put("ccc", new BasicClassEqualsHash(3, "���꼶����", 22.4));
		bceh.put("ggg", new BasicClassEqualsHash(5, "���꼶����", 51.4));
		bceh.put("ax", new BasicClassEqualsHash(2, "���꼶����", 88.4));
		bceh.put("bwe", new BasicClassEqualsHash(4, "���꼶����", 33.4));
		
		bccmp.put("aaa", new BasicClassCMP(1, "���꼶����", 66.4));
		bccmp.put("ccc", new BasicClassCMP(3, "���꼶����", 22.4));
		bccmp.put("ggg", new BasicClassCMP(5, "���꼶����", 51.4));
		bccmp.put("ax", new BasicClassCMP(2, "���꼶����", 88.4));
		bccmp.put("bwe", new BasicClassCMP(4, "���꼶����", 33.4));
		
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
		bc1.put(null, null);
		System.out.println("���Nullֵ�����");
		showData(bc1);
	}
	
	public void testSort(){
//		bc1.c  û�е�����compare������������Ҫ��дcompare����������
		bccmp.put(null, null);
		System.out.println("com�����null���ݺ�");
		/**
		 * ��֧��ֱ��sort
		 *  * �������ΪHashMap������
		 */
		System.out.println("��ʹʵ����compareTo�ӿ�Ҳ��������");
		showData(bccmp);
		
	}
	
	/**
	 * ����ֵ�ɷ��ظ���ͨ��ʵ��equals��hashCode����
	 */
	public void testValueRepetition(){
		bceh.put("zzz", new BasicClassEqualsHash(1, "���꼶����", 66.4));
		System.out.println("equals��HashCode����ظ�ֵ��");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.put("zzz", new BasicClassEquals(1, "���꼶����", 66.4));
		System.out.println("equals����ظ�ֵ��");
		showData(bce);
		
		bch.put("zzz", new BasicClassHash(1, "���꼶����", 66.4));
		System.out.println("HashCode����ظ�ֵ��");
		showData(bch);
	}
	
	public void testTheme(){
		System.out.println("HashMapValue����");
	}
	
	
	public static void main(String[] args) {
		A6HashMapValue stuData = new A6HashMapValue();
//		��������
		stuData.testTheme();
//		���ݳ�ʼ��
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
