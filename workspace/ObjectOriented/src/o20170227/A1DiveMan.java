package o20170227;

public class A1DiveMan extends A1SportMan {
	private String diveType;

	public A1DiveMan(String name, A1Clothes clo, 
			String team, String diveType) {
		super(name, clo, team);
		this.diveType = diveType;
	}

	public A1DiveMan() {
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
		System.out.println("引用强制转换后可以调用子类自己的方法，不转换前不能调用");
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "，游泳类型，" + diveType;
	}

	public  void exercise() {
		System.out.println("我在游泳池运动");
	}
	
	
}
