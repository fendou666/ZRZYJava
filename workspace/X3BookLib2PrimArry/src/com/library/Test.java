package com.library;

public class Test {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		Book b1 = new Book("0001", "���μ�1", "��ж�1","���������1", "С˵");
		Book b2 = new Book("0002", "���μ�2", "��ж�2","���������2", "С˵");
		Book b3 = new Book("0003", "���μ�3", "��ж�3","���������3", "��ѧ");
		Book b4 = new Book("0004", "���μ�4", "��ж�4","���������4", "С˵");
		Book b5 = new Book("0005", "���μ�5", "��ж�5","���������5", "��ѧ");
		bm.addBook(b1);
		bm.addBook(b2);
		bm.addBook(b3);
		bm.addBook(b4);
		bm.addBook(b5);
		
		bm.addBook(b1);
		bm.addBook(b2);
		bm.addBook(b3);
		bm.addBook(b4);
		bm.addBook(b5);
		
		bm.showBooks();
		
		bm.delBook("aaa");
		bm.delBook("0004");
		
		bm.updBook("0004", b4);
		bm.updBook("0003", b4);
		
	}
}
