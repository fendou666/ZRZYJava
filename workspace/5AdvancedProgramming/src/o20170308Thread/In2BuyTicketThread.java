package o20170308Thread;

public class In2BuyTicketThread implements Runnable {
	private In2Passenger passenger;
	private In2TrainTicket ticket;
	public In2BuyTicketThread(In2Passenger passenger, In2TrainTicket ticket) {
		super();
		this.passenger = passenger;
		this.ticket = ticket;
	}
	@Override
	public void run() {
		synchronized(ticket) {
			In2TrainTicket t = In2TicketSeller.sellTicket(ticket);
			while(t==null) {
				System.out.println(passenger.getName()+ "很抱歉，票已经售出，请等待退票");
					try {
						ticket.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			if(t!=null){
				System.out.println(passenger.getName()+"购票成功，信息为：" + ticket);
			}
		}
	}
	
}
