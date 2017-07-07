package com.library;

public class Test {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		Book b1 = new Book("0001", "西游记1", "吴承恩1","人民出版社1", "小说");
		Book b2 = new Book("0002", "西游记2", "吴承恩2","人民出版社2", "小说");
		Book b3 = new Book("0003", "西游记3", "吴承恩3","人民出版社3", "文学");
		Book b4 = new Book("0004", "西游记4", "吴承恩4","人民出版社4", "小说");
		Book b5 = new Book("0005", "西游记5", "吴承恩5","人民出版社5", "文学");
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
