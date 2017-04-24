package S9Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * 替换第一步 将ArrayList更改为其他类型
 * 替换第二部 将类名替换为当前类名
 * @author Administrator
 *
 */


public class A1ArrayList {
	private ArrayList<BasicClass1> bc1 		= new ArrayList<BasicClass1>();
	private ArrayList<BasicClassEquals> bce = new ArrayList<BasicClassEquals>();
	private ArrayList<BasicClassHash> bch	= new ArrayList<BasicClassHash>();
	private ArrayList<BasicClassEqualsHash> bceh = new ArrayList<BasicClassEqualsHash>();
	private ArrayList<BasicClassCMP> bccmp	= new ArrayList<BasicClassCMP>();
	
	public void showData(ArrayList t){
		Iterator iterator = t.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	/**
	 * 方法名：泛型添加
	 * 并未实现
	 */
//	public <T> void addData(ArrayList<T> t){
//		t.add(new T(1, "三年级二班", 66.4));
//		t.add(new T(3, "三年级二班", 22.4));
//		t.add(new T(5, "三年级二班", 51.4));
//		t.add(new T(2, "三年级二班", 88.4));
//		t.add(new T(4, "三年级二班", 33.4));
//	}
	
	public void dataInit(){
		bc1.add(new BasicClass1(1, "三年级二班", 66.4));
		bc1.add(new BasicClass1(3, "三年级二班", 22.4));
		bc1.add(new BasicClass1(5, "三年级二班", 51.4));
		bc1.add(new BasicClass1(2, "三年级二班", 88.4));
		bc1.add(new BasicClass1(4, "三年级二班", 33.4));
		
		bce.add(new BasicClassEquals(1, "三年级二班", 66.4));
		bce.add(new BasicClassEquals(3, "三年级二班", 22.4));
		bce.add(new BasicClassEquals(5, "三年级二班", 51.4));
		bce.add(new BasicClassEquals(2, "三年级二班", 88.4));
		bce.add(new BasicClassEquals(4, "三年级二班", 33.4));
		
		bch.add(new BasicClassHash(1, "三年级二班", 66.4));
		bch.add(new BasicClassHash(3, "三年级二班", 22.4));
		bch.add(new BasicClassHash(5, "三年级二班", 51.4));
		bch.add(new BasicClassHash(2, "三年级二班", 88.4));
		bch.add(new BasicClassHash(4, "三年级二班", 33.4));
		
		bceh.add(new BasicClassEqualsHash(1, "三年级二班", 66.4));
		bceh.add(new BasicClassEqualsHash(3, "三年级二班", 22.4));
		bceh.add(new BasicClassEqualsHash(5, "三年级二班", 51.4));
		bceh.add(new BasicClassEqualsHash(2, "三年级二班", 88.4));
		bceh.add(new BasicClassEqualsHash(4, "三年级二班", 33.4));
		
		bccmp.add(new BasicClassCMP(1, "三年级二班", 66.4));
		bccmp.add(new BasicClassCMP(3, "三年级二班", 22.4));
		bccmp.add(new BasicClassCMP(5, "三年级二班", 51.4));
		bccmp.add(new BasicClassCMP(2, "三年级二班", 88.4));
		bccmp.add(new BasicClassCMP(4, "三年级二班", 33.4));
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
		bccmp.add(null);
		System.out.println("com类添加数据后");
		showData(bccmp);
		/**
		 * 此处排序也可以自定以排序
		 */
		bccmp.sort(new Comparator<BasicClassCMP>(){
			@Override
			public int compare(BasicClassCMP o1, BasicClassCMP o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("排序后的com类值");
		showData(bccmp);
	}
	
	/**
	 * 测试值可否重复，通过实现equals和hashCode测试
	 */
	public void testValueRepetition(){
		bceh.add(new BasicClassEqualsHash(1, "三年级二班", 66.4));
		System.out.println("equals和HashCode添加重复值后");
		showData(bceh);
	}
	
	public void testValueNotRep(){
		bce.add(new BasicClassEquals(1, "三年级二班", 66.4));
		System.out.println("equals添加重复值后");
		showData(bce);
		
		bch.add(new BasicClassHash(1, "三年级二班", 66.4));
		System.out.println("HashCode添加重复值后");
		showData(bch);
	}
	
	
	public static void main(String[] args) {
		A1ArrayList stuData = new A1ArrayList();
		stuData.dataInit();
//		默认排序测试
		stuData.testDefaultOrder();
//		添加空值测试
		stuData.testAddNull();
//		添加排序测试, 关于compare重写，主要是指必须添加，还是说排序时才添加
		stuData.testSort();
//		重复值测试, 即是否添加HashCode和equals, 添加上后不会重复【需要重写】，添加后依然重复【不需要重写】
		stuData.testValueRepetition();
//		测试到底是equals还是HashCode起作用
		stuData.testValueNotRep();
	}
	
}

