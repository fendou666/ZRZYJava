package o20170223;

public class A3Shipping extends A3Vehicle {
	private double waterLine;
	private int tonnage;
	
	public A3Shipping() {
		
	}
	public A3Shipping(String name, String engine, 
					double waterLine, int tonnage) {
		super(name, engine);
		this.waterLine = waterLine;
		this.tonnage = tonnage;
	}
	
	
	public double getWaterLine() {
		return waterLine;
	}
	public void setWaterLine(double waterLine) {
		this.waterLine = waterLine;
	}
	public int getTonnage() {
		return tonnage;
	}
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	public String toString() {
		return super.toString() + this.name+ "的水位线是" + waterLine + "\n"
				+ this.name + "的吨位是" + tonnage;
	}
	
}
