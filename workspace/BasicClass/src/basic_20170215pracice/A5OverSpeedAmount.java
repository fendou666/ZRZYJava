package basic_20170215pracice;

public class A5OverSpeedAmount {
	public static void main(String[] args) {
		int overSpeedCarAmount = 0;
		int carSpeed ;
		while (true){
			carSpeed = (int)(20 + Math.random()*210);
			System.out.println("过来一辆车 车速为" + carSpeed);
			
			if (carSpeed > 120) {
				
				System.out.println("这辆车超速" + (carSpeed -120));
				overSpeedCarAmount++;
			} 
			System.out.println("超速车辆总数为" + overSpeedCarAmount);
			
		}
		
	}
}
