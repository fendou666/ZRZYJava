package o20170308Thread;

import java.util.ArrayList;

public class In2TicketSeller {
	private static ArrayList<In2TrainTicket> pool = new ArrayList<In2TrainTicket>();
	 
	static{
		pool.add(new In2TrainTicket("T157", "0204", "20150312"));
		pool.add(new In2TrainTicket("T157", "0205", "20150312"));
		pool.add(new In2TrainTicket("T157", "0206", "20150312"));
		pool.add(new In2TrainTicket("T157", "0207", "20150312"));
		pool.add(new In2TrainTicket("T157", "0208", "20150312"));
		pool.add(new In2TrainTicket("T157", "0209", "20150312"));
		pool.add(new In2TrainTicket("T157", "0210", "20150312"));
	}
	
	
	public static In2TrainTicket sellTicket(In2TrainTicket ticket) {
		In2TrainTicket t = null;
		for (In2TrainTicket t1:pool) {
			if(t1.equals(ticket)){
				t = t1;
				System.out.println("正在出票" + t1 + "请耐心等待。。。。");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
		}
		return t;
	}
	public static void returnTicket(In2TrainTicket ticket){
		synchronized (ticket) {
			pool.add(ticket);
		}
	}
}


