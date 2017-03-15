package o20170223;

public class A4Test {
	public static void main(String[] args) {
		A4Director  dir = new A4Director("张三", "未央区", 12131.4, 400);
		A4Employee em = new A4Employee("李四", "莲湖区", 1141.4);
		A4Manage ma = new A4Manage("第三方", "新城区", 1111.4 ,"ATEAM");
		System.out.println(dir);
		System.out.println(em);
		System.out.println(ma);
	}
	
}
