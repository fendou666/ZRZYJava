package o20170223;

public class A3Car extends A3Vehicle {
//	���
	private double wheelBase;
//	��λ
	private int gears;
	
	public A3Car() {
		
	}
	public A3Car(String name, String engine, int gears) {
		super(name, engine);
		this.gears = gears;
	}
	
	public double getWheelBase() {
		return wheelBase;
	}
	public void setWheelBase(double wheelBase) {
		this.wheelBase = wheelBase;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	
	public String toString() {
		return super.toString() + this.name + "�������" + wheelBase + "\n" 
				+ this.name +"�ĵ�λ��" + gears + "\n";
	}
	
}
