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
		// �����ȽϷ��ַ�����synchronized���˸����Ͻ�
		synchronized (ticket){
			for (In1TrainTicket t1:pool) {
				if(t1.equals(ticket)){
					t = t1;
					System.out.println("���ڳ�Ʊ" + t1 + "�����ĵȴ���������");
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
	
//	ʹ��synchronized ���������Թ���ֵ��ͬ����
//	public synchronized static In1TrainTicket sellTicket(In1TrainTicket ticket) {
//		In1TrainTicket t = null;
//		for (In1TrainTicket t1:pool) {
//			if(t1.equals(ticket)){
//				t = t1;
//				System.out.println("���ڳ�Ʊ" + t1 + "�����ĵȴ���������");
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


