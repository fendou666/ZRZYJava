package o20170223;

public class A3Car extends A3Vehicle {
//	轴距
	private double wheelBase;
//	档位
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
		return super.toString() + this.name + "的轴距是" + wheelBase + "\n" 
				+ this.name +"的档位是" + gears + "\n";
	}
	
}
