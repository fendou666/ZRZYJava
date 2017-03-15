package o20170228;


public class A1Student {
	private String name;
	private int studentNumber;
	
	public A1Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A1Student(String name, int studentNumber) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + studentNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A1Student other = (A1Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studentNumber != other.studentNumber)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "A1Student [name=" + name + ", studentNumber=" + studentNumber
				+ "]";
	}
	
	
	
	
}
