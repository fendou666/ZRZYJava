package o20170223;

public class In1vehicle {
	private String name;
	private double engine;
	
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// ��ʼ
	public void star(){
		System.out.println(name + "��ʼ");
	}
	
	// ת��
	public void wheel(){
		System.out.println(name + "ת��");
	}
	// ת��
	public void shutdown (){
		System.out.println(name + "ֹͣ");
	}

	

	
}
