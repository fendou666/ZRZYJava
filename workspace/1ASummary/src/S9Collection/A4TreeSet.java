package S9Collection;

import java.util.TreeSet;
import java.util.Iterator;

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
class TreeSetApple implements Comparable<TreeSetApple>{
	double db;
	String name;
	public TreeSetApple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TreeSetApple(double db, String name) {
		super();
		this.db = db;
		this.name = name;
	}
	@Override
	public String toString() {
		return "TreeSetApple [db=" + db + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(db);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeSetApple other = (TreeSetApple) obj;
		if (Double.doubleToLongBits(db) != Double.doubleToLongBits(other.db))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String  compareString(double t){
		String s = "00000" + t + "0000";
		int index = s.indexOf('.');
		s = s.substring(index-5, index+5);
		return s;
	}
	@Override
	public int compareTo(TreeSetApple o) {
		int rec = 0;
		if(this!=null && o!=null){
			rec = 0;
		}else if (this == null){
			rec = 1;
		}else if (o == null){
			rec = -1;
		}else {
			String o1 = compareString(this.db);
			String o2 = compareString(o.db);
			o1 += this.name;
			o2 += o.name;
			rec = o1.compareTo(o2);
		}
		return rec;
	}
	
}