package S5Branch;

public class A3Switch {
	public static void testSwitch(int a){
		
		switch(a){
		case 1: 
			System.out.println("����1");
			break;
		case 2:
			System.out.println();
			break;
		default:
			System.out.println("����defaultֵ");
			break;
		case 3:
			System.out.println("����3");
			break;
		case 4:
			System.out.println("����4");
		}
		
	}
	
	public static void main(String[] args) {
		testSwitch(22);
		testSwitch(3);
	}
}
