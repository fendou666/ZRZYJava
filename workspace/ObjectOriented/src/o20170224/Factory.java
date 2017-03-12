package o20170224;

public class Factory {
	private String type;
	private String address;
	
	
	
	public Factory() {
		// TODO Auto-generated constructor stub
	}
	public Factory(String type, String address) {
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
	
	public void makeClothes(Clothes clo) {
		
		System.out.println("制造了一件衣服  " + clo.toString());
		
	}
	
	
}
