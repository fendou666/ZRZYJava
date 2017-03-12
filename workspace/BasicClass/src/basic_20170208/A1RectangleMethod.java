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
		
		System.out.println("长度"+length + ",宽度" + Width +"的矩形");
		System.out.println("周长" + circuference(length, Width));
		System.out.println("面积" + area(length, Width) );
	}
	
}
