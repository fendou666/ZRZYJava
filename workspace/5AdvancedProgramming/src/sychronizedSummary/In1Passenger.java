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
		System.out.println("�˿�" + name +"������Ʊ����ϢΪ��" +ticket);
		Thread t = new Thread(new In1BuyTicketThread(this, ticket));
		t.start();
	}
	
	public void returnTicket(In1TrainTicket ticket) {
		System.out.println("�˿�" + name +"������Ʊ����ϢΪ��" +ticket);
		Thread t = new Thread(new In1ReturnTicketThread(this, ticket));
		t.start();
	}
	
	public String toString() {
		return "�˿�[����=" +  name + "]";
	}
	
}
