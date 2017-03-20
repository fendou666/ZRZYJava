package sychronizedSummary;

public class In1TestTicket {
	public static void main(String[] args) {
		In1Passenger p1 =new In1Passenger("张三");
		In1Passenger p2 =new In1Passenger("李四");
		In1TrainTicket ticket1 = new In1TrainTicket("T157", "0204", "20150312");
		In1TrainTicket ticket2 = new In1TrainTicket("T157", "0205", "20150312");
//		由此分析出关于wait()是wait是物理上相同的对象
		In1TrainTicket ticket3 = new In1TrainTicket("T157", "0204", "20150312");
		
		
		In1Passenger p3 = new In1Passenger("王五");
		In1Passenger p4 = new In1Passenger("孙六");
		In1Passenger p5 = new In1Passenger("赵七");
		
		p1.buyTicket(ticket1);
//		p2.buyTicket(ticket1);
		p2.buyTicket(ticket3);
//		p2.buyTicket(ticket2);
		

	}
}
