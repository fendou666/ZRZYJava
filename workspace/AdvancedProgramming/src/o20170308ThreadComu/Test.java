package o20170308ThreadComu;

public class Test {
	public static void main(String[] args) {
		Info in=new Info();
		Producter p=new Producter(in);
		Customer c=new Customer(in);
		new Thread(p).start();
		new Thread(c).start();
	}
}
