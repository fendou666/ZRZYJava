
package casestudy;

public class DeCreaseThread implements Runnable {

	private Sample sample;
	
	public DeCreaseThread(Sample sample){
		this.sample = sample;
	}
	
	@Override
	public void run() {
		for(int i=0; i<20; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sample.decrease();
		}
		
		
	}

}
