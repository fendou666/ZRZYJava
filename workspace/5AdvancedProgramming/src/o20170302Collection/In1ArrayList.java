package o20170302Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class In1ArrayList {
	
//	public <T> void addList(T t){
//		
//	}
	/***
	 * �������e����һ������,e[] ����list����
	 * 
	 * boolean add(e), addAll(e[]), addAll(index, e[]);void add(index,e),
	 * e remove(index);boolean remove(e), removeAll();void clean();
	 * boolean isEmpty();
	 * e[] subList(fromIndex, toIndex)
	 * boolean retainList()ȡ��������ֵ
	 * e get(index);int indexOf(e), lastIndexOf(e);boolean contains(e), containsAll(e[]);
	 * e set(index, element),������Ӧλ�õ�ֵ, ���ظ���֮ǰ��ֵ
	 * int size(),Iterator iterator();
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		
		List<In11Book> bookList = new ArrayList<In11Book>();
		In11Book b1 = new In11Book("��¥��1", 11);
		In11Book b2 = new In11Book("���μ�2", 12);
		In11Book b3 = new In11Book("��Ĺ��3", 41);
		In11Book b4 = new In11Book("���Ʋ�4", 31);
		In11Book b5 = new In11Book("¹����5", 33);
		
		bookList.add(b1);
		// index��0��ʼ
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
		
		In11Book  b6 = new In11Book("��¥��6", 11);
		
		// ֤��ɾ���������ö�Ӧ�Ķ��󣬶�����ֵ��ͬ�Ķ���
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
		// ��ȡindex��ֵ
		System.out.println(bookList.get(1));
		// �鿴list�Ƿ��������
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
		// list1ɾ�����ݲ�Ӱ��List��˵��addAll�ǽ������ArrayList��ֺ����Ķ�������
		bookList1.remove(0);
		System.out.println("++++++++++++++++++++++++++++++++");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		// ֤�������������
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
		// ֤��containAll �ǽ�List1�е��������ò鿴list�Ƿ����ÿ������
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
		
		// ��ǰ������,�˷�������ȡ��һ����clean������removeAll��ʧȥ���ã��˷�����BUG����������
		/**
		 * ArrayList�������subList����������ȡ����ͬ�ڴ�һ��Ƭ�Σ�
		 * �ڽ�ȡ�󷵻��µ�ArrayList��������ӡ�ɾ�������򣬶����ԭ���������Ӱ�죡
		 * http://blog.csdn.net/qiuhuimian/article/details/8670213
		 *  
		 */
		List<In11Book> bookSubList =  bookList.subList(3, 6);
		System.out.println("������������������������������������");
		for (In11Book b: bookSubList) {
			System.out.println(b);
		}
		
		//bookList.clear();
		//bookList.removeAll(bookList);
		System.out.println("-------------------");
		for (In11Book b: bookSubList) {
			System.out.println(b);
		}
		// ��ȡ�������ϵĽ��� http://blog.csdn.net/xiancaifu/article/details/7246918
		bookList.retainAll(bookSubList);
		System.out.println("--------ddd-----------");
		for (In11Book b: bookList) {
			System.out.println(b);
		}
		
		
		// test index ,remove ��������ͬ����
		List<In11Book> bookList2 = new ArrayList<In11Book>();
		bookList2.add(b1);
		bookList2.add(b2);
		bookList2.add(b1);
		bookList2.add(b1);
		System.out.println(bookList2.indexOf(b1));
		System.out.println(bookList2.lastIndexOf(b1));
		System.out.println(bookList2.remove(b1));
		System.out.println(bookList2.indexOf(b2));
		
		// ����
		for (int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
		
		Iterator<In11Book> it = bookList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		// ��û�ж��κη���������Ӧ��list���ǰ���ArrayList������ʼ����
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
////		// ����
////		for (int i=0; i<bookList.size(); i++) {
////			System.out.println(bookList.get(i));
////		}
////		
////		for (In11Book b: bookList) {
////			System.out.println(b);
////		}
//		// ������
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