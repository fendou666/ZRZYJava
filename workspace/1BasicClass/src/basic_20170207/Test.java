package basic_20170207;

public class Test{
	public static boolean test() {
		System.out.println("false ��ִ����");
		return false;
	}
	public static void main(String[] args){
	        System.out.println("��������,��������");
	        int a = 0b10001;
	        System.out.println(a); 
	        if (!test()) {
	        	System.out.println("����");
	        }
	}
}