package basic_20170216practice;

public class In1ForBeak {
	public static void main(String[] args) {
		int number = 0;
		int j=0;
		while(j<100){
			number = (int)(Math.random()*10000);
			System.out.println("��ǰ�������" + number);
			if (number%5 == 0) {
				System.out.println("��ǰ�������5�ı����˳�ѭ��");
				break;
			}
			if (number%9 == 0) {
				System.out.println("��ǰ�������9�ı�������ѡ��");
				continue;
			}
			if (number%2==0) {
				System.out.println("��ǰ�������ż��");
			}else{
				System.out.println("��ǰ�����������");
			}
			
			j++;
		}
//		for (int i = 0; i<10; i++){
//			number = (int)(Math.random()*10000);
//			if (number%2==0) {
//				System.out.println("��ǰ�������ż��");
//			}else {
//				System.out.println("��ǰ�����������");
//			}
//		}
//		// ֱ�����ż����ֵ
//		for (int i = 2; i<100; i+=2) {
//			number = number + i;
//		}
	}
}
