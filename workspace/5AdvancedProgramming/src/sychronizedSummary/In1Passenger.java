package sychronizedSummary;

public class In1Passenger {
	private String name;
	
	public In1Passenger(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void buyTicket(In1TrainTicket ticket) {
		System.out.println("乘客" + name +"打算买票，信息为：" +ticket);
		Thread t = new Thread(new In1BuyTicketThread(this, ticket));
		t.start();
	}
	
	public void returnTicket(In1TrainTicket ticket) {
		System.out.println("乘客" + name +"打算退票，信息为：" +ticket);
		Thread t = new Thread(new In1ReturnTicketThread(this, ticket));
		t.start();
	}
	
	public String toString() {
		return "乘客[姓名=" +  name + "]";
	}
	
}
