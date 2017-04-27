package S9Collection;

import java.util.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;


/**
 * 必须实现comparable接口, 实现排序
 * 不实现equalshashcode方法重复值也添加不进去
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
	 * 方法名：泛型添加
	 * 并未实现
	 */
//	public <T> void addData(TreeSet<T> t){
//		t.add(new T(1, "三年级二班", 66.4));
//		t.add(new T(3, "三年级二班", 22.4));
//		t.add(new T(5, "三年级二班", 51.4));
//		t.add(new T(2, "三年级二班", 88.4));
//		t.add(new T(4, "三年级二班", 33.4));
//	}
	
	/**
	 * 
	 * 要求必须实现comparable接口
	 * 
	 */
	public void dataInit(){
		bc1.add(new BasicClassCMP(1, "三年级二班", 66.4));
		bc1.add(new BasicClassCMP(3, "三年级二班", 22.4));
		bc1.add(new BasicClassCMP(5, "三年级二班", 51.4));
		bc1.add(new BasicClassCMP(2, "三年级二班", 88.4));
		bc1.add(new BasicClassCMP(4, "三年级二班", 33.4));
		
		bce.add(new BasicClassCMPEquals(1, "三年级二班", 66.4));
		bce.add(new BasicClassCMPEquals(3, "三年级二班", 22.4));
		bce.add(new BasicClassCMPEquals(5, "三年级二班", 51.4));
		bce.add(new BasicClassCMPEquals(2, "三年级二班", 88.4));
		bce.add(new BasicClassCMPEquals(4, "三年级二班", 33.4));
		
		bch.add(new BasicClassCMPHash(1, "三年级二班", 66.4));
		bch.add(new BasicClassCMPHash(3, "三年级二班", 22.4));
		bch.add(new BasicClassCMPHash(5, "三年级二班", 51.4));
		bch.add(new BasicClassCMPHash(2, "三年级二班", 88.4));
		bch.add(new BasicClassCMPHash(4, "三年级二班", 33.4));
		
		bceh.add(new BasicClassCMPEqualsHash(1, "三年级二班", 66.4));
		bceh.add(new BasicClassCMPEqualsHash(3, "三年级二班", 22.4));
		bceh.add(new BasicClassCMPEqualsHash(5, "三年级二班", 51.4));
		bceh.add(new BasicClassCMPEqualsHash(2, "三年级二班", 88.4));
		bceh.add(new BasicClassCMPEqualsHash(4, "三年级二班", 33.4));
		
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
	public void testAddNull(){
		bc1.add(null);
		System.out.println("添加Null值后输出");
		showData(bc1);
	}
	
	public void testSort(){
//		bc1.c  没有调出来compare方法，所有需要重写compare方法来排序
		bc1.add(new BasicClassCMP(3, "三年级二班", 33.4));
		bc1.add(new BasicClassCMP(3, "三年级二班", 33.4));
		System.out.println("实现了com类添加新数据后,TreeSet只要实现了comparable接口就可以排序");
		showData(bc1);
	}
	
	/**
	 * 测试值可否重复，通过实现equals和hashCode测试
	 */
	public void testValueRepetition(){
		bceh.add(new BasicClassCMPEqualsHash(1, "三年级二班", 66.4));
		System.out.println("equals和HashCode添加重复值后");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.add(new BasicClassCMPEquals(1, "三年级二班", 66.4));
		System.out.println("equals添加重复值后");
		showData(bce);
		
		bch.add(new BasicClassCMPHash(1, "三年级二班", 66.4));
		System.out.println("HashCode添加重复值后");
		showData(bch);
	}
	
	
	public static void main(String[] args) {
		A4TreeSet stuData = new A4TreeSet();
		stuData.dataInit();
//		默认排序测试
		stuData.testDefaultOrder();
//		添加空值测试
//		stuData.testAddNull();
//		添加排序测试, 关于compare重写，主要是指必须添加，还是说排序时才添加
		stuData.testSort();
//		重复值测试, 即是否添加HashCode和equals, 添加上后不会重复【需要重写】，添加后依然重复【不需要重写】
		stuData.testValueRepetition();
//		测试到底是equals还是HashCode起作用
		stuData.testValueNotRep();
	}
}
