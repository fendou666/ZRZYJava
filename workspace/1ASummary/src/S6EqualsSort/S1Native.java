package S6EqualsSort;

public class S1Native {
	
	public static native String testCNative(String input);
	
	public static void main(String[] args) {
		testCNative("123123");
	}
}
