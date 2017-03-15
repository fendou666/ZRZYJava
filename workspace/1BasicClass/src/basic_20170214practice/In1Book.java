package basic_20170214practice;

public class In1Book {
	private int id;
	private String name;
	private String author;
	private String type;
	private String address;
	private double price;
	private boolean state;
	
	public In1Book(int id, String  name, String author, 
					String type, String address, double price){
		this.id = id;
		this.name = name;
		this.author = author;
		this.type = type;
		this.address = address;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean getState(){
		return state;
	}
	public void setState(boolean state){
		this.state = state;
	}
	
	public String toString(){
		return "Book id = " + id + "\nname = " + name + "\nauthor" + author
				+ "\ntype = " + type + "\naddress = " + address + "\nprice = " + price;
		
	}

	
	
}
