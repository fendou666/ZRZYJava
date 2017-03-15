package o20170223;

// 公交车
public class A3Bus extends A3Car {
	private double ticketPrice;

	public A3Bus () {
		
	}
	public A3Bus(String name, String engine, 
						int gears, double ticketPrice) {
		super(name, engine, gears);
		this.ticketPrice = ticketPrice;
	}
	
	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public String toString() {
		return super.toString() + name + "的票价是" + ticketPrice;
	}
	
}
