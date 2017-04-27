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
	 * 方法名：泛型添加
	 * 并未实现
	 */
//	public <T> void putData(TreeMap<T> t){
//		t.put(new T(1, "三年级二班", 66.4));
//		t.put(new T(3, "三年级二班", 22.4));
//		t.put(new T(5, "三年级二班", 51.4));
//		t.put(new T(2, "三年级二班", 88.4));
//		t.put(new T(4, "三年级二班", 33.4));
//	}
	
	public void dataInit(){
		bc1.put(new BasicClassCMP(1, "三年级二班", 66.4), "aaa");
		bc1.put(new BasicClassCMP(3, "三年级二班", 22.4), "aaa");
		bc1.put(new BasicClassCMP(5, "三年级二班", 51.4), "aaa");
		bc1.put(new BasicClassCMP(2, "三年级二班", 88.4), "aaa");
		bc1.put(new BasicClassCMP(4, "三年级二班", 33.4), "aaa");
		
		bce.put(new BasicClassCMPEquals(1, "三年级二班", 66.4), "aaa");
		bce.put(new BasicClassCMPEquals(3, "三年级二班", 22.4), "aaa");
		bce.put(new BasicClassCMPEquals(5, "三年级二班", 51.4), "aaa");
		bce.put(new BasicClassCMPEquals(2, "三年级二班", 88.4), "aaa");
		bce.put(new BasicClassCMPEquals(4, "三年级二班", 33.4), "aaa");
		
		bch.put(new BasicClassCMPHash(1, "三年级二班", 66.4), "aaa");
		bch.put(new BasicClassCMPHash(3, "三年级二班", 22.4), "aaa");
		bch.put(new BasicClassCMPHash(5, "三年级二班", 51.4), "aaa");
		bch.put(new BasicClassCMPHash(2, "三年级二班", 88.4), "aaa");
		bch.put(new BasicClassCMPHash(4, "三年级二班", 33.4), "aaa");
		
		bceh.put(new BasicClassCMPEqualsHash(1, "三年级二班", 66.4), "aaa");
		bceh.put(new BasicClassCMPEqualsHash(3, "三年级二班", 22.4), "aaa");
		bceh.put(new BasicClassCMPEqualsHash(5, "三年级二班", 51.4), "aaa");
		bceh.put(new BasicClassCMPEqualsHash(2, "三年级二班", 88.4), "aaa");
		bceh.put(new BasicClassCMPEqualsHash(4, "三年级二班", 33.4), "aaa");
		
	}
	
	/**
	 * 方法名：1. 测试有序
	 * 总结： 默认添加默认输出
	 */
	public void testDefaultOrder(){
		showData(bc1);
	}
	/**
	 * 方法名：测试添加空值
	 * 总结：可以添加空值
	 */
	public void testputNull(){
		bc1.put(null, "aaa");
		System.out.println("添加Null值后输出");
		showData(bc1);
	}
	
	public void testSort(){
//		bc1.c  没有调出来compare方法，所有需要重写compare方法来排序
		bc1.put(new BasicClassCMP(8, "三年级二班", 88.4), "aaa");
		System.out.println("添加数据后自动排序");
		/**
		 * 不支持直接sort
		 *  * 排序需改为TreeMap的排序
		 */
		showData(bc1);
		
	}
	
	/**
	 * 测试值可否重复，通过实现equals和hashCode测试
	 */
	public void testValueRepetition(){
		bceh.put(new BasicClassCMPEqualsHash(1, "三年级二班", 66.4), "aaa");
		System.out.println("equals和HashCode添加重复值后");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.put(new BasicClassCMPEquals(1, "三年级二班", 66.4), "aaa");
		System.out.println("equals添加重复值后");
		showData(bce);
		bch.put(new BasicClassCMPHash(1, "三年级二班", 66.4), "aaa");
		System.out.println("HashCode添加重复值后");
		showData(bch);
	}
	
	
	public static void main(String[] args) {
		A7TreeMapKey stuData = new A7TreeMapKey();
		stuData.dataInit();
//		默认排序测试
		stuData.testDefaultOrder();
//		添加空值测试
//		stuData.testputNull();
//		添加排序测试, 关于compare重写，主要是指必须添加，还是说排序时才添加
		stuData.testSort();
//		重复值测试, 即是否添加HashCode和equals, 添加上后不会重复【需要重写】，添加后依然重复【不需要重写】
		stuData.testValueRepetition();
//		测试到底是equals还是HashCode起作用
		stuData.testValueNotRep();
	}
}
