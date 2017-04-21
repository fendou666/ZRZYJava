package s14Thread;

public class A4BasicObj {
	private int i;
	private String str;
	
	public A4BasicObj(int i, String str) {
		this.i = i;
		this.str = str;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "A4BasicObj [i=" + i + ", str=" + str + "]";
	}
	
}
