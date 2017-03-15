package o20170223;

public class A4Employee {
	private String name;
	private String address;
	private double salary;
	
	public A4Employee() {
		this("–’√˚", "µÿ÷∑", 1111.4);
	}
	public A4Employee(String name, String address, double salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "A4Employee [name=" + name + ", address=" + address
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	
}
