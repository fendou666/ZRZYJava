package sychronizedSummary;

import java.util.ArrayList;

public class In1TicketSeller {
	private static ArrayList<In1TrainTicket> pool = new ArrayList<In1TrainTicket>();
	 
	static{
		pool.add(new In1TrainTicket("T157", "0204", "20150312"));
		pool.add(new In1TrainTicket("T157", "0205", "20150312"));
		pool.add(new In1TrainTicket("T157", "0206", "20150312"));
		pool.add(new In1TrainTicket("T157", "0207", "20150312"));
		pool.add(new In1TrainTicket("T157", "0208", "20150312"));
		pool.add(new In1TrainTicket("T157", "0209", "20150312"));
		pool.add(new In1TrainTicket("T157", "0210", "20150312"));
	}
	
	public static In1TrainTicket sellTicket(In1TrainTicket ticket) {
		In1TrainTicket t = null;
		// 经过比较发现方法的synchronized过滤更加严谨
		synchronized (ticket){
			for (In1TrainTicket t1:pool) {
				if(t1.equals(ticket)){
					t = t1;
					System.out.println("正在出票" + t1 + "请耐心等待。。。。");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					pool.remove(t1);
					break;
				}
				
			}
		}
		
		return t;
	}
	
//	使用synchronized 方法，可以过滤值相同对象
//	public synchronized static In1TrainTicket sellTicket(In1TrainTicket ticket) {
//		In1TrainTicket t = null;
//		for (In1TrainTicket t1:pool) {
//			if(t1.equals(ticket)){
//				t = t1;
//				System.out.println("正在出票" + t1 + "请耐心等待。。。。");
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				pool.remove(t1);
//				break;
//			}
//			
//		}
//		return t;
//	}
	public static void returnTicket(In1TrainTicket ticket){
		synchronized (ticket) {
			pool.add(ticket);
		}
	}
}


