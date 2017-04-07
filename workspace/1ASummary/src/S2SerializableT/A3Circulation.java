package S2SerializableT;

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
//		��Ҷ
		for(int i=1; i<=9;i++){
//			��ߴ�հ�
			for (int j=1;j<=9-i;j++){
				System.out.print(" ");
			}
//			�ұ����ǵ���
			if (i<=3) {
				for (int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				
			}else if(i<=6){
//				i-3�������ѭ����1
				for (int j=1;j<=2*(i-3)-1;j++) {
					System.out.print("*");
				}
//				2*3-1�����һ�����5����2(i-1)ָ����ÿ�л��ٵ���ֵ�� ��Ϊ�����i�״���4������Ҫ��ȥ3������1
				for (int j=1;j<=2*3-1 - 2*((i-3)-1);j++) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*(i-3)-1;j++) {
					System.out.print("*");
				}
				
			}else{
				for (int j=1;j<=2*(i-6)-1;j++) {
					System.out.print("*");
				}
				for (int j=1;j<=2*3-1 - 2*((i-6)-1);j++) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*(i-6)-1;j++) {
					System.out.print("*");
				}
				for (int j=1;j<=2*3-1 - 2*((i-6)-1);j++) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*(i-6)-1;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
//		����
		for(int i=1; i<=8;i++){
			for(int j=1; j<=7; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=3; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void draw(String type, int init, int max){
		if (type == " ") {
			for (int i=init; i<=max; i++) {
				System.out.print(" ");
			}
		}else {
			for (int i=init; i<=max; i++) {
				System.out.print("*");
			}
		}
	}
	
//	��ӡʥ����
	public void getChristmasTree2(){
//		��Ҷ
		for(int i=1; i<=9;i++){
//			��ߴ�հ�
			draw(" ", 1, 9-i);
//			�ұ����ǵ���
			if (i<=3) {
				draw("*", 1, 2*i-1);
			}else if(i<=6){
//				i-3�������ѭ����1
				draw("*", 1, 2*(i-3)-1);
//				2*3-1�����һ�����5����2(i-1)ָ����ÿ�л��ٵ���ֵ�� ��Ϊ�����i�״���4������Ҫ��ȥ3������1
				draw(" ", 1, 2*3-1 - 2*((i-3)-1));
				draw("*", 1, 2*(i-3)-1);
			}else{
				draw("*", 1, 2*(i-6)-1);
				draw(" ", 1, 2*3-1 - 2*((i-6)-1));
				draw("*", 1, 2*(i-6)-1);
				draw(" ", 1, 2*3-1 - 2*((i-6)-1));
				draw("*", 1, 2*(i-6)-1);
			}
			System.out.println();
		}
//		����
		for(int i=1; i<=8;i++){
			draw(" ", 1, 7);
			draw("*", 1, 7);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		A3Circulation A3 = new A3Circulation();
//		A3.getSum();
//		A3.getMultiple();
//		A3.getTriagle();
//		A3.getChristmasTree();
		A3.getChristmasTree2();
	}
//	
	
}
