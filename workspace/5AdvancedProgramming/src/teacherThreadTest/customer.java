package teacherThreadTest;

public class customer implements Runnable { 
	 Store s; 
	public customer(Store s) {
		this.s = s;
	}
	@Override
	public  void run() {
	    while(true){
	    	synchronized (s) {
	    		if(s.b.size()>0){
	        		s.outProudct();
	        		System.out.println("消费产品："+s.b.size());
	    	    	}else{
	    					try {
	    						s.wait();
	    					} catch (InterruptedException e) {
	    						e.printStackTrace();
	    					}
	    					//s.notifyAll();	
	    	    	}
			}
	    	
	   }
	    	/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	if(s.count<=0){
	    		try {
	    			s.notify();
	    			System.out.println("消费者被wait");
					s.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	    	}else{
	    		s.outProudct();
	    		System.out.println("消费产品："+s.count);
	    	}
	    	
	    }
		
	}*/
	}
}
	


class Producer implements Runnable {
	static Store s;
	 
	public Producer(Store s) {
		this.s = s;
	}

	@Override
	public  synchronized void run() {
		int i=0;
		while(true){
			
				if(s.b.size()<10){
					s.inProudct( new apple("name"+i));
					//System.out.println("生产产品："+s.b.size());
				}
				else{
						//try {
							//s.wait();
							s.notify();
						//} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						//}
				
			}
			}
			
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(s.count>=10){
	    		
	    			System.out.println("生产者被wait");
	    		
			
	    	}else{
	    		s.inProudct();
	    		System.out.println("生产产品："+s.count);
	    	}
			
		}*/
	}
}
