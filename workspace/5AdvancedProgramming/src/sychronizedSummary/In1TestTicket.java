package sychronizedSummary;

public class In1TestTicket {
	public static void main(String[] args) {
		In1Passenger p1 =new In1Passenger("����");
		In1Passenger p2 =new In1Passenger("����");
		In1TrainTicket ticket1 = new In1TrainTicket("T157", "0204", "20150312");
		In1TrainTicket ticket2 = new In1TrainTicket("T157", "0205", "20150312");
//		�ɴ˷���������wait()��wait����������ͬ�Ķ���
		In1TrainTicket ticket3 = new In1TrainTicket("T157", "0204", "20150312");
		
		
		In1Passenger p3 = new In1Passenger("����");
		In1Passenger p4 = new In1Passenger("����");
		In1Passenger p5 = new In1Passenger("����");
		
		p1.buyTicket(ticket1);
//		p2.buyTicket(ticket1);
		p2.buyTicket(ticket3);
//		p2.buyTicket(ticket2);
		

	}
}
