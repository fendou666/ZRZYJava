package o20170223;

public class In1test {
	public static void main(String[] args) {
		Train t = new Train();
		t.setName("¸ßÌú");
		t.setPrice(4245415);
		t.setSeats(1500);
		t.setCarriage(100);
		System.out.println(t);
		
		In1Car benz = new In1Car();
		benz.setName("±¼³Û4");
		benz.setPrice(545122);
		benz.setRunMode("Â½µØ");
		System.out.println(benz);
	}
}
