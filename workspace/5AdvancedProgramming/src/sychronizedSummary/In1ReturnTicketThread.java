package sychronizedSummary;

public class In1ReturnTicketThread implements Runnable {
	private In1Passenger passenger;
	private In1TrainTicket ticket;
	
	public In1ReturnTicketThread(In1Passenger passenger, In1TrainTicket ticket) {
		super();
		this.passenger = passenger;
		this.ticket = ticket;
	}

	public void run(){
		synchronized(ticket){
			In1TicketSeller.returnTicket(ticket);
			System.out.println("�˿�" + passenger.getName() + "������Ʊ������������");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			����ͬ�����������notifyAll������֪ͨ���еȴ�����Ʊ���߳�
			ticket.notifyAll();
			System.out.println("�˿�" + passenger.getName() + "��Ʊ�ɹ�����ϢΪ��" + ticket);
			
		}
	}
	
}
