package o20170227;

public class In3Test {
	
	public static void method(In3TypeF f) {
		// instanceof 用于控制是否引用是当前类的实例
		if (f instanceof In3TypeC2) {
			f.show();
		}
//		else {
//			f.show();
//		}
	}
	
	public static void main(String[] args) {
		In3TypeF f1 = new In3TypeC1(); 
		f1.showF();
		In3TypeF f2 = new In3TypeC2();
		f2.showF();
		
		In3TypeC1 f11 = (In3TypeC1)f1;
		In3TypeC2 f22 = (In3TypeC2)f2;
		
		method(f11);
		method(f22);
		
		
	}
}
