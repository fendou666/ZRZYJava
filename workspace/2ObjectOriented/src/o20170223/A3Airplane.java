package o20170223;

public class A3Airplane extends A3Vehicle {
	private int flightHeight;
	
	public A3Airplane() {
		
	}
	public A3Airplane(String name, String engine, int flightHeight) {
		super(name, engine);
		this.flightHeight = flightHeight;
	}
	
	public int getFlightHeight() {
		return flightHeight;
	}

	public void setFlightHeight(int flightHeight) {
		this.flightHeight = flightHeight;
	}
	
	public String toString() {
		return super.toString() + this.name + "的飞行高度是" + flightHeight;
	}
	
}
