package S16Inherit;

public class ClassInherit {
	public int pb = 12;
	private int pv = 15;
	public static int pbs = 13;
	private static int pvs = 16;
	
	public ClassInherit(){
		getpb();
		getpv();
		getpbs();
		getpvs();
	}
	
	
	public void getpb(){
		System.out.println("child public int : " +pb);
	}
	public void getpv(){
		System.out.println("child private int : " +pv);
	}
	public void getpbs(){
		System.out.println("child public static int : " +pbs);
	}
	public void getpvs(){
		System.out.println("child private static int : " +pvs);
	}
	
	public static void main(String[] args) {
		new ClassInherit();
	}
	
}
class Father extends GrandF{
	public int pb = 22;
	private int pv = 25;
	public static int pbs = 23;
	private static int pvs = 26;
	
	public Father(){
		getpb();
		getpv();
		getpbs();
		getpvs();
	}
	
	public void getpb(){
		System.out.println("father public int : " +pb);
	}
	public void getpv(){
		System.out.println("father private int : " +pv);
	}
	public void getpbs(){
		System.out.println("father public static int : " +pbs);
	}
	public void getpvs(){
		System.out.println("father private static int : " +pvs);
	}
}


class GrandF{
	public int pb = 32;
	private int pv = 35;
	public static int pbs = 33;
	private static int pvs = 36;
	
	public GrandF(){
		getpb();
		getpv();
		getpbs();
		getpvs();
	}
	
	public void getpb(){
		System.out.println("Grand father public int : " +pb);
	}
	public void getpv(){
		System.out.println("Grand father private int : " +pv);
	}
	public void getpbs(){
		System.out.println("Grand father public static int : " +pbs);
	}
	public void getpvs(){
		System.out.println("Grand father private static int : " +pvs);
	}
}