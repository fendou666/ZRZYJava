package basic_20170208;

public class A2InvestmentVolume {
	
	public static double calculateVolume (int sumVolume, int mileage) {
		
		return sumVolume/mileage;
	}
	public static void main(String[] args) {
		
		int sumVolume = 2209;
		int mileage = 1318;
		System.out.println("����������Ͷ��2209��Ԫ");
		System.out.println("�����ܳ���1318ǧ��");
		System.out.println("����ÿǧ��Ͷ�ʶ��Ϊ" 
				+ calculateVolume(sumVolume, mileage) +"��Ԫ/ǧ��");
		System.out.println("ͨ��ʱ�䣺2011��");
		System.out.println("����ʱ�䣺4.5Сʱ");
		System.out.println("�����ٶȣ�350ǧ��/Сʱ");
	}
	
}
