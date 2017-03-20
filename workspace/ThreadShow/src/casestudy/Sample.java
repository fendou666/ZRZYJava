package casestudy;

public class Sample {
	
	private int number;
	
	public synchronized void increase() {
		if(0 != number){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		number++;
		
		System.out.println(Thread.currentThread().getName()+"  " +number);
		notify();
	}
	
	public synchronized void decrease() {
		if( 0==number) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		number--;
		System.out.println(Thread.currentThread().getName()+"  " +number);
		
		notify();
		
	}
	
}
