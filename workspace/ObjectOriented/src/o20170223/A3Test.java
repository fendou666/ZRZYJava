package o20170223;

public class A3Test {
	public static void main(String[] args) {
		A3Limousine lim = new A3Limousine("±¼³Û111", "DA-12", 3, "ÊæÊÊÉ³·¢");
		A3Bus bus = new A3Bus("ÓîÍ¨12", "ADF-3", 5, 0.5);
		A3Airplane airplane = new A3Airplane("¹úº½12", "GF-AD", 5000);
		A3Shipping ship = new A3Shipping("Ì©Ì¹Äá¿ËºÅ", "FDGF-3", 50, 344);
		System.out.println(lim);
		System.out.println(bus);
		System.out.println(airplane);
		System.out.println(ship);
	}
	
	
}
