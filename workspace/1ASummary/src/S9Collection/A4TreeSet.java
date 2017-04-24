package S9Collection;

import java.util.TreeSet;
import java.util.Iterator;

import S9Collection.old.TreeSetApple;

/**
 * 必须实现comparable接口, 实现排序
 * 必须实现equlas， 实现添加不重复元素
 * 
 * 
 * @author Administrator
 *
 */

public class A4TreeSet {
	private static TreeSet<TreeSetApple> apples = new TreeSet<TreeSetApple>();
	
	/**
	 * 初始化
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
	 * 1. 自然排序
	 */
	public void showCollections(){
		Iterator<TreeSetApple> iterator = apples.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	/**
	 * 2. 添加null值
	 */
	public void testAdd(){
		apples.add(null);
		showCollections();
	}
	/**
	 * 3. 外排序
	 * 
	 */
	public void testSort(){
		Iterator<TreeSetApple> iterator = apples.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	
	/**
	 * 4. hashCode和equals测试
	 * 经过测试，两个都得重写才能起效果
	 */
	public void testHashCodeAndEquals(){
		apples.add(new TreeSetApple(8.0, "gg"));
		apples.add(new TreeSetApple(8.0, "gg"));
		showCollections();
	}
	/**
	 * 5. 排序方法增加
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
