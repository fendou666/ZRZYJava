package S9Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class A1ArrayList {
	private Iterator<Apple> iterator;
	private static List<Apple> apples = new ArrayList<Apple>();
	private Iterator<Apple> iterator2;
	
	public void showApples(List<Apple> apples){
		iterator = apples.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	/**
	 * 方法名：
	 * <p>功能描述：</p>
	 * 
	 * @param addE
	 * 
	 * @return
	 * 
	 * @see 引用其他类或者方法
	 * 
	 * @exception 会处理的异常名
	 * 			异常描述
	 * @throw 会抛出的异常
	 * 
	 */
	public void addElement(Apple addE){
		System.out.println("添加ArrayList");
		System.out.println("前size: " + apples.size());
		apples.add(addE);
		System.out.println("后size: " + apples.size());
	}
	/**
	 * 方法名：删除元素
	 * 
	 * @param delE 要删除的元素
	 */
	public void delElement(Apple delE){
		System.out.println("删除ArrayList");
		System.out.println("前size: " + apples.size());
		apples.remove(delE);
		System.out.println("后size: " + apples.size());
	}
	/**
	 * 方法名：更新元素
	 * 
	 * @param updE 要更新的元素
	 */
	public void updElement(Apple updE){
		updE.size = 0.1;
	}
	/**
	 * 方法名：排序（调用默认排序）
	 * 
	 * <p>
	 * 通过Collection.sort(); 调用默认排序
	 * </p>
	 */
//	调用默认排序
	public void sortElement1(){
		Collections.sort(apples);
	}
//	comparator调用默认排序
	public void sortElement2(){
		Collections.sort(apples, new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				
				return o1.compareTo(o2);
			}
		});
	}
	public void sortElement3(){
		Collections.sort(apples, new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return 1;
			}
		});
	}
//	调用默认排序
	public void listSort1(){
		apples.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.compareTo(o2);
			}
		});
	}
//	自定义排序
	public void listSort2(){
		apples.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				int rec = 0;
				if(o1!=null&&o2!=null){
					rec = 0;
				}else if(o1!=null){
					rec = -1;
				}else if(o2!=null){
					rec = 1;
				}else{
					rec = 0;
					if(o1.size>o2.size){
						rec = 1;
					}else if (o1.size==o2.size){ 
						if (!(o1.weigth==o2.weigth)){
							rec = (o1.weigth-o2.weigth)>0?1:-1;
						}
					}else if (o1.size<o2.size) {
						rec = -1;
					}
				}
				return rec;
			}
		});
	}

	/**
	 * 方法名：增测试
	 * <p>未重写equals和HashCode方法：添加元素</p>
	 * <p>重写equals和HashCode方法：还是添加元素</p>
	 * <p>未重写equals方法：</p>
	 * <p>重写equals方法：</p>
	 * <p>未重写HashCode方法：</p>
	 * <p>重写HasHcode方法：</p>
	 * <p>
	 */
	public void testAdd(){
		Apple addE1 = new Apple(1.1, 2.2);
		Apple addE2 = new Apple(1.1, 2.2);
		addElement(addE1);
		addElement(addE2);
		showApples(apples);
	}
	/**
	 * 方法名：删除测试[就equals重写有效]
	 * <p>未重写equals和HashCode方法：只是删除自己</p>
	 * <p>重写equals和HashCode方法：删除值相同的元素</p>
	 * <p>未重写equals方法：只是删除自己</p>
	 * <p>重写equals方法：删除值相同的元素</p>
	 * <p>未重写HashCode方法：只是删除自己</p>
	 * <p>重写HasHcode方法：只是删除自己</p>
	 * <p>
	 */
	public void testDel(){
		Apple addE1 = new Apple(2.2, 3.3);
		Apple addE2 = new Apple(2.2, 3.3);
		apples.add(addE1);
		apples.add(addE2);
		delElement(addE1);
		delElement(addE1);
		showApples(apples);
	}
	/**
	 * 方法名：更新测试
	 * 对于更新产生了歧义，1.只更新对象的值，2，重新创建一个对象，值与添加的值相同，然后进行循环List中的值在进行排序
	 * 关于更新一般是更新某个ID， 所以这是一个比较相同的过程，a.equals(b)的过程，找到相同值【根据是否重写】的ID
	 * <p>未重写equals和HashCode方法：</p>
	 * <p>重写equals和HashCode方法：</p>
	 * <p>未重写equals方法：</p>
	 * <p>重写equals方法：</p>
	 * <p>未重写HashCode方法：</p>
	 * <p>重写HasHcode方法：</p>
	 * <p>
	 */
	public void testUpd(){
		Apple updE1 = new Apple(3.3, 4.4);
		Apple updE2 = new Apple(3.3, 4.4);
		apples.add(updE1);
		apples.add(updE2);
		updElement(updE1);
		System.out.println("更改后的值");
		System.out.println(updE1);
		updElement(updE1);
		System.out.println("再次调用更新后");
		showApples(apples);
	}
	/**
	 * 方法名：测试增删改与equals和HashCode关系
	 * 
	 */
	public void testEqualsHashCode(){
//		testAdd();
//		testDel();
		testUpd();
	}
	/**
	 * 方法名：排序测试
	 * 
	 * 
	 * @param args
	 */
	public void testSort(){
//		sortElement1();
//		sortElement2();
//		sortElement3();
//		listSort1();
		listSort2();
	}
	public void basicTest(){
//		1. 证明是有序的
		showApples(apples);
//		2. 证明可以有null值
		apples.add(null);
		showApples(apples);
//		3. 可以排序
		listSort2();
	}
	public void otherTest(){
//		4. equals重写[没有作用]
		apples.add(new Apple(1.23, 33.1));
		showApples(apples);
//		5. HashCode重写
		Apple a = new Apple(11.1, 22.22);
		Apple b = new Apple(11.1, 22.22);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		if(a.equals(b)){
			System.out.println("equals重写成功");
		}
	}
	public static void main(String[] args) {
		A1ArrayList A1 = new A1ArrayList();
		apples.add(new Apple(2.333, 12.33));
		apples.add(new Apple(1.23, 23.47));
		apples.add(new Apple(1.23, 5.123));
		apples.add(new Apple(1.23, 33.1));
		apples.add(new Apple(5.18, 10.789));
		apples.add(new Apple(2.783, 13.78));
		apples.add(new Apple(8.0, 5.987));

//		6. compare重写
//		A1.testSort();
//		7. 测试增删改与equals和HashCode关系
		A1.testEqualsHashCode();
	}
	
}

class Apple implements Comparable<Apple>{
	double size;
	double weigth;
	public Apple() {
		
	}
	public Apple(double size, double weigth) {
		super();
		this.size = size;
		this.weigth = weigth;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weigth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Apple other = (Apple) obj;
		if (Double.doubleToLongBits(size) != Double
				.doubleToLongBits(other.size))
			return false;
		if (Double.doubleToLongBits(weigth) != Double
				.doubleToLongBits(other.weigth))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Apple [size=" + size + ", weigth=" + weigth + "]";
	}
	@Override
	public int compareTo(Apple o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
