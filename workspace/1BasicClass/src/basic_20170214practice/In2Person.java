package basic_20170214practice;

public class In2Person {
	private String name;
	private long phoneNumber;
	private String idCard;
	private In1Book book;
	
	public In2Person(String name, long phoneNumber, String idCard){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.idCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
//	public In1Book getBook() {
//		return book;
//	}
//	public void setBook(In1Book book) {
//		this.book = book;
//	}
	public String searchBook (In1Book book){
		return book.toString();
	}
	public In1Book getBook(){
		return book;
	}
	public void borrowBook(In1Book book){
		book.setState(true);
		this.book = book;
	}
	public void returnBook(){
		book.setState(false);
		book = null;
	}
	
	
	
	
}
