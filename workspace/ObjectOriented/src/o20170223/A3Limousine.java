package o20170223;

// �γ�
public class A3Limousine extends A3Car {
	private String sofa;

	public A3Limousine () {
		
	}
	public A3Limousine(String name, String engine, 
						int gears, String sofa) {
		super(name, engine, gears);
		this.sofa = sofa;
	}
	
	public String getSofa() {
		return sofa;
	}

	public void setSofa(String sofa) {
		this.sofa = sofa;
	}
	
	public String toString() {
		return  super.toString() + "ɳ����" + sofa;
	}
	
}
