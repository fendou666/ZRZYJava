package o20170308Thread;

public class In2TestTicket {
	public static void main(String[] args) {
		In2Passenger p1 =new In2Passenger("����");
		In2TrainTicket ticket1 = new In2TrainTicket("T157", "0204", "20150312");
//		�ɴ˷���������wait()��wait����������ͬ�Ķ���
		In2TrainTicket ticket3 = new In2TrainTicket("T157", "0204", "20150312");
		In2Passenger p2 =new In2Passenger("����");
		In2TrainTicket ticket2 = new In2TrainTicket("T157", "0205", "20150312");
		In2Passenger p3 = new In2Passenger("����");
		In2Passenger p4 = new In2Passenger("����");
		In2Passenger p5 = new In2Passenger("����");
		
		p1.buyTicket(ticket1);
		p2.buyTicket(ticket2);
//		p3.buyTicket(ticket1);
		p3.buyTicket(ticket3);
		p4.buyTicket(ticket1);
		p5.buyTicket(ticket2);
		
//		p1.returnTicket(ticket1);
//		p2.returnTicket(ticket2);
	}
}