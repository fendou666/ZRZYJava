package basic_20170215pracice;

public class ASummary {
	// ��������
//	public static boolean testTrue() {
//		System.out.println("����true����");
//		return true;
//	}
//	public static boolean testFalse() {
//		System.out.println("����false����");
//		return false;
//	}
	// for����
	static int count1 = 1; 
	static int count2 = 2; 
	public static void onlyOnce(){
		System.out.println("���ǵ�һ��");
	}
	public static boolean conditionOneMore(){
		System.out.println("���������ĵ�" + (count1++) +"��");
		if (count1 == 10) {
			return false;
		} else {
			return true;
		}
		
	}
	public static void needCount(){
		System.out.println("���ǵ�����ĵ�" + (count2++) + "��" );
	}
	public static void main(String[] args) {
		// condition
//		boolean a = true;
		
//		if (testTrue()){
//			System.out.println("����if���");
//		}
		
		// for����
		for (onlyOnce(); conditionOneMore();needCount()) {
			System.out.println("�����Ǹ���");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
