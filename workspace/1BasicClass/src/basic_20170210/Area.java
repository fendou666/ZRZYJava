package basic_20170210;

public class Area {
	
	// Բ�α���
	double pi = 3.14;
	int r;
	
	// ���α���
	int length;
	int width;
	
	// ���α���
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
	
	// �������ڱ�־��ͬ�����ط���
	double getArea(int circlr) {
		System.out.println("����Բ�����");
		return pi*r*r;
	};
	
	int getArea(double rectangle) {
		System.out.println("������ε����");
		return length*width;
	};
	
	int getArea(String trapezoid) {
		System.out.println("�������ε����");
		return (topLength + bottomLength)*h/2;
	};
}
