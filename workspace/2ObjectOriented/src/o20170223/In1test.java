package o20170223;

public class In1test {
	public static void main(String[] args) {
		Train t = new Train();
		t.setName("����");
		t.setPrice(4245415);
		t.setSeats(1500);
		t.setCarriage(100);
		System.out.println(t);
		
		In1Car benz = new In1Car();
		benz.setName("����4");
		benz.setPrice(545122);
		benz.setRunMode("½��");
		System.out.println(benz);
	}
}
