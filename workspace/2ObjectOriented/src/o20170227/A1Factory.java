package o20170227;

public class A1Factory {
	private String type;
	private String address;
	
	
	
	public A1Factory() {
		// TODO Auto-generated constructor stub
	}
	public A1Factory(String type, String address) {
		this.type = type;
		this.address = address;
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
	
	public void makeClothes(A1Clothes clo) {
		
		System.out.println("制造了一件衣服  " + clo.toString());
		
	}
	
	
}
