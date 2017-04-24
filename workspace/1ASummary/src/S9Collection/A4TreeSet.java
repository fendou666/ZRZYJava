package S9Collection;

import java.util.TreeSet;
import java.util.Iterator;

import S9Collection.old.TreeSetApple;

/**
 * ����ʵ��comparable�ӿ�, ʵ������
 * ����ʵ��equlas�� ʵ����Ӳ��ظ�Ԫ��
 * 
 * 
 * @author Administrator
 *
 */

public class A4TreeSet {
	private static TreeSet<TreeSetApple> apples = new TreeSet<TreeSetApple>();
	
	/**
	 * ��ʼ��
	 * 
	 */
	public void initTreeSet(){
		apples.add(new TreeSetApple(2.333, "aa"));
		System.out.println(apples.add(new TreeSetApple(1.23, "bb")));
		
		apples.add(new TreeSetApple(1.23, "cc"));
		apples.add(new TreeSetApple(1.23, "dd"));
		apples.add(new TreeSetApple(5.18, "ff"));
		apples.add(new TreeSetApple(2.783, "ee"));
		apples.add(new TreeSetApple(8.0, "gg"));
	}
	
	/**
	 * 1. ��Ȼ����
	 */
	public void showCollections(){
		Iterator<TreeSetApple> iterator = apples.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	/**
	 * 2. ���nullֵ
	 */
	public void testAdd(){
		apples.add(null);
		showCollections();
	}
	/**
	 * 3. ������
	 * 
	 */
	public void testSort(){
		Iterator<TreeSetApple> iterator = apples.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	
	/**
	 * 4. hashCode��equals����
	 * �������ԣ�����������д������Ч��
	 */
	public void testHashCodeAndEquals(){
		apples.add(new TreeSetApple(8.0, "gg"));
		apples.add(new TreeSetApple(8.0, "gg"));
		showCollections();
	}
	/**
	 * 5. ���򷽷�����
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		A4TreeSet A4 = new A4TreeSet();
		A4.initTreeSet();
		A4.showCollections();
//		A4.testAdd();
//		A4.testSort();
//		A4.testHashCodeAndEquals();
	}
}
