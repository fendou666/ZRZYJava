package basic_20170215pracice;

public class A5OverSpeedAmount {
	public static void main(String[] args) {
		int overSpeedCarAmount = 0;
		int carSpeed ;
		while (true){
			carSpeed = (int)(20 + Math.random()*210);
			System.out.println("����һ���� ����Ϊ" + carSpeed);
			
			if (carSpeed > 120) {
				
				System.out.println("����������" + (carSpeed -120));
				overSpeedCarAmount++;
			} 
			System.out.println("���ٳ�������Ϊ" + overSpeedCarAmount);
			
		}
		
	}
}
