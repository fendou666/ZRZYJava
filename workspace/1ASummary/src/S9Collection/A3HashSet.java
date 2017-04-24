package S9Collection;

import java.util.HashSet;
import java.util.Iterator;

import S9Collection.old.hashSetApple;

public class A3HashSet {
	private static HashSet<hashSetApple> apples = new HashSet<hashSetApple>();
	
	/**
	 * 初始化
	 * 
	 */
	public void initHashSet(){
		apples.add(new hashSetApple(2.333, "aa"));
		apples.add(new hashSetApple(1.23, "bb"));
		apples.add(new hashSetApple(1.23, "cc"));
		apples.add(new hashSetApple(1.23, "dd"));
		apples.add(new hashSetApple(5.18, "ff"));
		apples.add(new hashSetApple(2.783, "ee"));
		apples.add(new hashSetApple(8.0, "gg"));

	}
	
	/**
	 * 1. 自然排序
	 */
	public void showCollections(){
		Iterator<hashSetApple> iterator = apples.iterator();
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
		System.out.println("没有找到");
	}
	
	
	/**
	 * 4. hashCode和equals测试
	 * 经过测试，两个都得重写才能起效果
	 */
	public void testHashCodeAndEquals(){
		apples.add(new hashSetApple(8.0, "gg"));
		apples.add(new hashSetApple(8.0, "gg"));
		showCollections();
	}
	/**
	 * 5. 排序方法增加
	 * 
	 */
	
	public static void main(String[] args) {
		A3HashSet A3 = new A3HashSet();
		A3.initHashSet();
//		A3.showCollections();
//		A3.testAdd();
//		A3.testSort();
		A3.testHashCodeAndEquals();
	}
}
