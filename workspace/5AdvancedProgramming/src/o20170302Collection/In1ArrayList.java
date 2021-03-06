package o20170302Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class In1ArrayList {
	
//	public <T> void addList(T t){
//		
//	}
	/***
	 * 这里面的e代表一个对象,e[] 代表list数组
	 * 
	 * boolean add(e), addAll(e[]), addAll(index, e[]);void add(index,e),
	 * e remove(index);boolean remove(e), removeAll();void clean();
	 * boolean isEmpty();
	 * e[] subList(fromIndex, toIndex)
	 * boolean retainList()取交集并赋值
	 * e get(index);int indexOf(e), lastIndexOf(e);boolean contains(e), containsAll(e[]);
	 * e set(index, element),更新相应位置的值, 返回更新之前的值
	 * int size(),Iterator iterator();
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		
		List<In11Book> bookList = new ArrayList<In11Book>();
		In11Book b1 = new In11Book("红楼梦1", 11);
		In11Book b2 = new In11Book("西游记2", 12);
		In11Book b3 = new In11Book("盗墓笔3", 41);
		In11Book b4 = new In11Book("斗破苍4", 31);
		In11Book b5 = new In11Book("鹿鼎记5", 33);
		
		bookList.add(b1);
		// index从0开始
		bookList.add(0, b2);
		
		In11Book newB3 = bookList.set(1, b3);
		
		System.out.println("new -----" +newB3);
		System.out.println("for start -----");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		System.out.println("for end -----");
		
		bookList.remove(0);
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		bookList.remove(b2);
		
		In11Book  b6 = new In11Book("红楼梦6", 11);
		
		// 证明删除的是引用对应的对象，而不是值相同的对象
		bookList.remove(b6);
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		
//		bookList.removeAll(bookList);
//		for (In11Book b: bookList) {
//			System.out.println(b);
//		}
		// 获取index的值
		System.out.println(bookList.get(1));
		// 查看list是否包含引用
		System.out.println(bookList.contains(null));
		System.out.println(bookList.contains(b5));
		System.out.println(bookList.indexOf(b4));
		In11Book test = b4;
		System.out.println(bookList.indexOf(test));
		System.out.println(bookList.set(1, b6));
		System.out.println("*********************************************");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		System.out.println(bookList.set(1, b2));
		
		
		List<In11Book> bookList1 = new ArrayList<In11Book>();
		In11Book b7 = new In11Book("i7", 11);
		In11Book b8 = new In11Book("i8", 12);
		In11Book b9 = new In11Book("i9", 41);
		In11Book b10 = new In11Book("i10", 31);
		In11Book b11 = new In11Book("i11", 33);
		
		bookList1.add(b7);
		bookList1.add(b8);
		bookList1.add(b9);
		bookList1.add(b10);
		bookList1.add(b11);
		
		bookList.addAll(3, bookList1);
		System.out.println("++++++++++++++++++++++++++++++++");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		// list1删除数据不影响List，说明addAll是将加入的ArrayList拆分后插入的对象引用
		bookList1.remove(0);
		System.out.println("++++++++++++++++++++++++++++++++");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		// 证明存入的是引用
		b11.setCount(1000);
		System.out.println("++++++++++++++++++++++++++++++++");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		
		In11Book b12 = new In11Book("i12", 20000);
		bookList.add(5, b12);
		System.out.println("++++++++++++++++++++++++++++++++");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		// 证明containAll 是将List1中的所有引用查看list是否存在每个引用
		System.out.println(bookList.containsAll(bookList1));
		bookList.remove(b10);
		System.out.println("++++++++++++++++++++++++++++++++");
		for (In11Book b: bookList1) {
			System.out.println(b);
		}
		System.out.println("..................................");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		System.out.println(bookList.containsAll(bookList1));
		
		// 包前不包后,此方法不可取，一旦主clean，或者removeAll则失去引用，此方法有BUG，尽量不用
		/**
		 * ArrayList数组表的subList（）方法截取的是同内存一个片段，
		 * 在截取后返回新的ArrayList数组表增加、删减、排序，都会对原数组表产生影响！
		 * http://blog.csdn.net/qiuhuimian/article/details/8670213
		 *  
		 */
		List<In11Book> bookSubList =  bookList.subList(3, 6);
		System.out.println("、、、、、、、、、、、、、、、、、、");
		for (In11Book b: bookSubList) {
			System.out.println(b);
		}
		
		//bookList.clear();
		//bookList.removeAll(bookList);
		System.out.println("-------------------");
		for (In11Book b: bookSubList) {
			System.out.println(b);
		}
		// 获取两个集合的交集 http://blog.csdn.net/xiancaifu/article/details/7246918
		bookList.retainAll(bookSubList);
		System.out.println("--------ddd-----------");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		
		
		// test index ,remove 插入多个相同对象
		List<In11Book> bookList2 = new ArrayList<In11Book>();
		bookList2.add(b1);
		bookList2.add(b2);
		bookList2.add(b1);
		bookList2.add(b1);
		System.out.println(bookList2.indexOf(b1));
		System.out.println(bookList2.lastIndexOf(b1));
		System.out.println(bookList2.remove(b1));
		System.out.println(bookList2.indexOf(b2));
		
		// 迭代
		for (int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
		
		Iterator<In11Book> it = bookList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		// 并没有多任何方法，觉得应该list就是按照ArrayList方法初始化的
		ArrayList<In11Book> bookList3 = new ArrayList<In11Book>();
		
		
//		for (In11Book b: bookList1) {
//			System.out.println(b);
//		}
		
		
//		bookList.add(b1);
//		bookList.add(b2);
//		bookList.add(b3);
//		bookList.add(b4);
//		bookList.add(3, b5);
//		
////		// 迭代
////		for (int i=0; i<bookList.size(); i++) {
////			System.out.println(bookList.get(i));
////		}
////		
////		for (In11Book b: bookList) {
////			System.out.println(b);
////		}
//		// 迭代器
//		Iterator<In11Book> it = bookList.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
//		
//		bookList.remove(3);
//		bookList.remove(b3);
//
//		for (In11Book b: bookList) {
//			System.out.println(b);
//		}
//		// bookList+
//		
	}
}
