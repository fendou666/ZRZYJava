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
		System.out.println("����ǿ��ת������Ե��������Լ��ķ�������ת��ǰ���ܵ���");
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "����Ӿ���ͣ�" + diveType;
	}

	public  void exercise() {
		System.out.println("������Ӿ���˶�");
	}
	
	
}
