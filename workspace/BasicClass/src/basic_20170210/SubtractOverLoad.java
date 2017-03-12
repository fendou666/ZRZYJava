package basic_20170210;

public class SubtractOverLoad {
	
	int subtract(int a, int b) {
		return a-b;
	}
	int subtract(int a, int b, int c) {
		return a - b - c;
	}
	
	double subtract(double a, double b) {
		return a-b;
	}
	double subtract(double a, int b, int c) {
		return a - b - c;
	}
	double subtract(int a, double b, double c){
		return a-b-c;
	}
	
}
