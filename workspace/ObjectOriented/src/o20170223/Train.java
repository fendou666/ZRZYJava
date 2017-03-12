package o20170223;

public class Train extends In1isa {
	// ×ùÎ»
	private int seats;
	// ³µÏá
	private int carriage;
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getCarriage() {
		return carriage;
	}
	public void setCarriage(int carriage) {
		this.carriage = carriage;
	}
	@Override
	public String toString() {
		getInfo();
		return "Train [seats=" + seats + ", carriage=" + carriage + "]";
	}
	
}
