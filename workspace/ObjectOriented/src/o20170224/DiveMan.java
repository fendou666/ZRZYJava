package o20170224;

public class DiveMan extends SportMan {
	private String diveType;

	public DiveMan(String name, Clothes clo, 
			String team, String diveType) {
		super(name, clo, team);
		this.diveType = diveType;
	}

	public DiveMan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDiveType() {
		return diveType;
	}

	public void setDiveType(String diveType) {
		this.diveType = diveType;
	}
	
	public void test() {
		System.out.println("adsfasdfasdfadsf");
	}
	
	
}
