package basic_20170208;

public class A1RectangleMethod {
	
	static int length = 20;
	static int Width = 10;
	static int circuference (int length, int Width){
		return 2*(length + Width);
	}
	static int area (int length, int Width) {
		return length * Width;
	}
	
	public static void main(String[] args){
		
		System.out.println("����"+length + ",���" + Width +"�ľ���");
		System.out.println("�ܳ�" + circuference(length, Width));
		System.out.println("���" + area(length, Width) );
	}
	
}
