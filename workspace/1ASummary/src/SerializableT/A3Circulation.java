package SerializableT;

public class A3Circulation {
//	1��10���
	public void getSum(){
		int sum = 0; // ����ѭ������Ҫ�ı���
		int i = 1; // ������������
		while(i<=10){ // �����˳�����
			sum = sum +i;
			i++; // ��������
		}
		System.out.println(sum);
		
		sum = 0;
		i = 1;
		do {
			sum = sum +i;
			i++;
		}while(i<=10);
		
		sum = 0;
		for (int j=1;j<=10;j++){
			sum += j;
		}
	}
	
//	1��100֮��7�ı������
	public void getMultiple(){
		int i = 1; // ������������
		while(i<=100){ // �����˳�����
			if(i%7==0){
				System.out.println(i);
			}
			i++; // ��������
		}
		
		i = 1;
		do {
			if(i%7==0){
				System.out.println(i);
			}
			i++;
		}while(i<=100);
		
		for (int j=1;j<=100;j++){
			if(j%7==0){
				System.out.println(j);
			}
		}
		 
	}
//	��ӡ����
	public void getRhombus(){
		
		
	}
//	��ӡ������
	public void getTriagle(){
		for(int i =1 ; i<=5;i++){
			for(int j=1; j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for(int j=1; j<=i;j++){
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	��ӡʥ����
	public void getChristmasTree(){
		
		
	}
	
	
	public static void main(String[] args) {
		A3Circulation A3 = new A3Circulation();
//		A3.getSum();
//		A3.getMultiple();
		A3.getTriagle();
	}
//	
	
}