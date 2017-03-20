package sychronizedSummary;

public class In1BuyTicketThread implements Runnable {
	private In1Passenger passenger;
	private In1TrainTicket ticket;
	public In1BuyTicketThread(In1Passenger passenger, In1TrainTicket ticket) {
		super();
		this.passenger = passenger;
		this.ticket = ticket;
	}
	@Override
	public void run() {
			In1TrainTicket t = In1TicketSeller.sellTicket(ticket);
			if(t==null) {
				System.out.println(passenger.getName()+ "�ܱ�Ǹ��Ʊ�Ѿ��۳�����ȴ���Ʊ");
			}else{
				System.out.println(passenger.getName()+"��Ʊ�ɹ�����ϢΪ��" + ticket);
			}
	}
//	public void run() {
//		synchronized(ticket) {
//			In1TrainTicket t = In1TicketSeller.sellTicket(ticket);
//			while(t==null) {
//				System.out.println(passenger.getName()+ "�ܱ�Ǹ��Ʊ�Ѿ��۳�����ȴ���Ʊ");
//					try {
//						ticket.wait();
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//			}
//			if(t!=null){
//				System.out.println(passenger.getName()+"��Ʊ�ɹ�����ϢΪ��" + ticket);
//			}
//		}
//	}
	
}
