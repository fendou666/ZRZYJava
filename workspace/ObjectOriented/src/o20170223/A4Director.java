package o20170223;

public class A4Director extends A4Employee {
	
	private double trafficAllowance;

	public A4Director() {
		this("–’√˚", "µÿ÷∑", 111, 0);
	}
	public A4Director(String name, String address, 
			double salary, double trafficAllowance) {
		super(name, address, salary);
		this.trafficAllowance = trafficAllowance;
	}
	
	public double getTrafficAllowance() {
		return trafficAllowance;
	}

	public void setTrafficAllowance(double trafficAllowance) {
		this.trafficAllowance = trafficAllowance;
	}
	@Override
	public String toString() {
		return super.toString() + "\nA4Director [trafficAllowance=" + trafficAllowance + "]";
	}
	
}
