package o20170223;

public class A4Manage extends A4Employee {
	// ����
	private String department;

	public A4Manage() {
		//super("����", "��ַ", 1111.4);
		this("����", "�³���", 234, "ateam");
		
	}
	public A4Manage(String name, String address, 
			double salary, String department) {
		super(name, address, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return super.toString() + "\nA4Manage [department=" + department + "]";
	}
	
	
	
}
