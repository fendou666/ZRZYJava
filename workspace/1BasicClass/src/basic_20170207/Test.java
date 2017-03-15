package basic_20170207;

public class Test{
	public static boolean test() {
		System.out.println("false 会执行吗");
		return false;
	}
	public static void main(String[] args){
	        System.out.println("保护环境,人人有责！");
	        int a = 0b10001;
	        System.out.println(a); 
	        if (!test()) {
	        	System.out.println("浮云");
	        }
	}
}