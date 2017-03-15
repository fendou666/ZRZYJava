package o20170223;

public class A4Manage extends A4Employee {
	// 部门
	private String department;

	public A4Manage() {
		//super("姓名", "地址", 1111.4);
		this("经理", "新城区", 234, "ateam");
		
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
