package S9Collection.old;

import java.util.HashSet;
import java.util.Iterator;

public class A3HashSetOld {
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
		A3HashSetOld A3 = new A3HashSetOld();
		A3.initHashSet();
//		A3.showCollections();
//		A3.testAdd();
//		A3.testSort();
		A3.testHashCodeAndEquals();
	}
}
class hashSetApple{
	double db;
	String name;
	public hashSetApple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hashSetApple(double db, String name) {
		super();
		this.db = db;
		this.name = name;
	}
	@Override
	public String toString() {
		return "hashSetApple [db=" + db + ", name=" + name + "]";
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		long temp;
//		temp = Double.doubleToLongBits(db);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		hashSetApple other = (hashSetApple) obj;
//		if (Double.doubleToLongBits(db) != Double.doubleToLongBits(other.db))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
}