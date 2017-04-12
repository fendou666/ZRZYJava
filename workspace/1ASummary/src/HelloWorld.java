public class HelloWorld{
	public static void get(){
		for(int i=0; i<100; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\r"+i+"%");
		}
		
	}
	public static void main(String [] args){
		get();	
	}	

}
