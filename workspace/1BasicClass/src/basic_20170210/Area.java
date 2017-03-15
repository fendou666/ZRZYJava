package basic_20170210;

public class Area {
	
	// 圆形变量
	double pi = 3.14;
	int r;
	
	// 矩形变量
	int length;
	int width;
	
	// 梯形变量
	int topLength;
	int bottomLength;
	int h;
	
	
	Area(int r){
		this.r = r;
	};
	
	Area(int length, int width) {
		this.length = length;
		this.width = width;
	};
	
	Area(int topLength, int bottomLength, int h) {
		this.topLength = topLength;
		this.bottomLength = bottomLength;
		this.h = h;
	};
	
	// 类型用于标志不同的重载方法
	double getArea(int circlr) {
		System.out.println("计算圆的面积");
		return pi*r*r;
	};
	
	int getArea(double rectangle) {
		System.out.println("计算矩形的面积");
		return length*width;
	};
	
	int getArea(String trapezoid) {
		System.out.println("计算梯形的面积");
		return (topLength + bottomLength)*h/2;
	};
}
