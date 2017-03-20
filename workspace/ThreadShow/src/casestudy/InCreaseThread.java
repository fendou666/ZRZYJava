package casestudy;

public class InCreaseThread implements Runnable {

	private Sample sample;
	
	public InCreaseThread(Sample sample){
		this.sample = sample;
	}
	
	@Override
	public void run() {
		for(int i=0; i<20; i++){
			try {
				Thread.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sample.increase();
		}
		
		
	}

}
