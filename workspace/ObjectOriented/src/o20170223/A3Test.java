package o20170223;

public class A3Test {
	public static void main(String[] args) {
		A3Limousine lim = new A3Limousine("����111", "DA-12", 3, "����ɳ��");
		A3Bus bus = new A3Bus("��ͨ12", "ADF-3", 5, 0.5);
		A3Airplane airplane = new A3Airplane("����12", "GF-AD", 5000);
		A3Shipping ship = new A3Shipping("̩̹��˺�", "FDGF-3", 50, 344);
		System.out.println(lim);
		System.out.println(bus);
		System.out.println(airplane);
		System.out.println(ship);
	}
	
	
}
