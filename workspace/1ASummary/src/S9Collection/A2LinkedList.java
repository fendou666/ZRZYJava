package S9Collection;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ��ʱ������
 * 
 * 
 * @author Administrator
 *
 */

public class A2LinkedList {
	private LinkedList<BasicClass1> bc1 		= new LinkedList<BasicClass1>();
	private LinkedList<BasicClassEquals> bce = new LinkedList<BasicClassEquals>();
	private LinkedList<BasicClassHash> bch	= new LinkedList<BasicClassHash>();
	private LinkedList<BasicClassEqualsHash> bceh = new LinkedList<BasicClassEqualsHash>();
	private LinkedList<BasicClassCMP> bccmp	= new LinkedList<BasicClassCMP>();
	
	public void showData(LinkedList t){
		Iterator iterator = t.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	/**
	 * ���������������
	 * ��δʵ��
	 */
//	public <T> void addData(LinkedList<T> t){
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
		System.out.println("com��������ݺ�");
		showData(bccmp);
		/**
		 * �˴�����Ҳ�����Զ�������
		 * List��sort����Ҫ�������д����nullֵ���������Ȼ�ᱨ��
		 * Collection��sortû��������nullֵ��������
		 * Collections������Ҫ�����Ҳ����null����صĲ���
		 */
		bccmp.sort(new Comparator<BasicClassCMP>(){
			@Override
			public int compare(BasicClassCMP o1, BasicClassCMP o2) {
				int rec = 0;
				if(o1 == null && o2 == null){
					rec =  0;
				}else if(o1 == null){
					rec =  1;
				}else if(o2 == null) {
					rec =  -1;
				}else{
					rec =  o1.compareTo(o2);
				}
				return rec;
			}
		});
//		Collections.sort(bccmp);
		System.out.println("������com��ֵ");
		showData(bccmp);
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
		A2LinkedList stuData = new A2LinkedList();
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
