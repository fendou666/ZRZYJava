package o20170302Genericity;

public class In2GenericityMethod {
	
	
	public static <T> void makeFly(T t){
		((In2CanFly) t).fly();
	}
	
	public static <T> T makeFly1(T t){
		return t;
	}
	
	public static void main(String[] args) {
		In2Airplane air = new In2Airplane();
		In2Bird bird = new In2Bird();
		makeFly(air);
		makeFly(bird);
	}
}
