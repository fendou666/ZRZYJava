package com.library;

public class Book {
	private String bookId;    //图书编号
	private String bookName;    //图书名称
	private String bookAuthor;    //图书作者
	private String bookPublish;    //图书出版社
	private String bookType;    //图书类型
	
	
	public Book() {
	
	}
	
	public Book(String bookId, String bookName, String bookAuthor,
			String bookPublish, String bookType) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublish = bookPublish;
		this.bookType = bookType;
	}


	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublish() {
		return bookPublish;
	}
	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookAuthor=" + bookAuthor + ", bookPublish=" + bookPublish
				+ ", bookType=" + bookType + "]";
	}
	
}
