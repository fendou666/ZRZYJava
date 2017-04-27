package S9Collection;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;

public class A6HashMapKey {
	private HashMap<BasicClass1,String> bc1 		= new HashMap<BasicClass1,String>();
	private HashMap<BasicClassEquals,String> bce = new HashMap<BasicClassEquals,String>();
	private HashMap<BasicClassHash,String> bch	= new HashMap<BasicClassHash,String>();
	private HashMap<BasicClassEqualsHash,String> bceh = new HashMap<BasicClassEqualsHash,String>();
	private HashMap<BasicClassCMP,String> bccmp	= new HashMap<BasicClassCMP,String>();
	
	public <T> void showData(HashMap t){
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
//	public <T> void putData(HashMap<T> t){
//		t.put(new T(1, "三年级二班", 66.4));
//		t.put(new T(3, "三年级二班", 22.4));
//		t.put(new T(5, "三年级二班", 51.4));
//		t.put(new T(2, "三年级二班", 88.4));
//		t.put(new T(4, "三年级二班", 33.4));
//	}
	
	public void dataInit(){
		bc1.put(new BasicClass1(1, "三年级二班", 66.4), "aaa");
		bc1.put(new BasicClass1(3, "三年级二班", 22.4), "aaa");
		bc1.put(new BasicClass1(5, "三年级二班", 51.4), "aaa");
		bc1.put(new BasicClass1(2, "三年级二班", 88.4), "aaa");
		bc1.put(new BasicClass1(4, "三年级二班", 33.4), "aaa");
		
		bce.put(new BasicClassEquals(1, "三年级二班", 66.4), "aaa");
		bce.put(new BasicClassEquals(3, "三年级二班", 22.4), "aaa");
		bce.put(new BasicClassEquals(5, "三年级二班", 51.4), "aaa");
		bce.put(new BasicClassEquals(2, "三年级二班", 88.4), "aaa");
		bce.put(new BasicClassEquals(4, "三年级二班", 33.4), "aaa");
		
		bch.put(new BasicClassHash(1, "三年级二班", 66.4), "aaa");
		bch.put(new BasicClassHash(3, "三年级二班", 22.4), "aaa");
		bch.put(new BasicClassHash(5, "三年级二班", 51.4), "aaa");
		bch.put(new BasicClassHash(2, "三年级二班", 88.4), "aaa");
		bch.put(new BasicClassHash(4, "三年级二班", 33.4), "aaa");
		
		bceh.put(new BasicClassEqualsHash(1, "三年级二班", 66.4), "aaa");
		bceh.put(new BasicClassEqualsHash(3, "三年级二班", 22.4), "aaa");
		bceh.put(new BasicClassEqualsHash(5, "三年级二班", 51.4), "aaa");
		bceh.put(new BasicClassEqualsHash(2, "三年级二班", 88.4), "aaa");
		bceh.put(new BasicClassEqualsHash(4, "三年级二班", 33.4), "aaa");
		
		bccmp.put(new BasicClassCMP(1, "三年级二班", 66.4), "aaa");
		bccmp.put(new BasicClassCMP(3, "三年级二班", 22.4), "aaa");
		bccmp.put(new BasicClassCMP(5, "三年级二班", 51.4), "aaa");
		bccmp.put(new BasicClassCMP(2, "三年级二班", 88.4), "aaa");
		bccmp.put(new BasicClassCMP(4, "三年级二班", 33.4), "aaa");
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
		bccmp.put(null, "aaa");
		System.out.println("com类添加null数据后");
		/**
		 * 不支持直接sort
		 *  * 排序需改为HashMap的排序
		 */
		System.out.println("即使实现了compareTo接口也不能排序");
		showData(bccmp);
		
	}
	
	/**
	 * 测试值可否重复，通过实现equals和hashCode测试
	 */
	public void testValueRepetition(){
		bceh.put(new BasicClassEqualsHash(1, "三年级二班", 66.4), "aaa");
		System.out.println("equals和HashCode添加重复值后");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.put(new BasicClassEquals(1, "三年级二班", 66.4), "aaa");
		System.out.println("equals添加重复值后");
		showData(bce);
		
		bch.put(new BasicClassHash(1, "三年级二班", 66.4), "aaa");
		System.out.println("HashCode添加重复值后");
		showData(bch);
	}
	
	
	public static void main(String[] args) {
		A6HashMapKey stuData = new A6HashMapKey();
		stuData.dataInit();
//		默认排序测试
		stuData.testDefaultOrder();
//		添加空值测试
		stuData.testputNull();
//		添加排序测试, 关于compare重写，主要是指必须添加，还是说排序时才添加
		stuData.testSort();
//		重复值测试, 即是否添加HashCode和equals, 添加上后不会重复【需要重写】，添加后依然重复【不需要重写】
		stuData.testValueRepetition();
//		测试到底是equals还是HashCode起作用
		stuData.testValueNotRep();
	}
}
