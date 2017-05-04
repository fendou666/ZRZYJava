package S16Inherit;

public class ClassInherit  extends Father{
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
	
	public int getPb() {
		return pb;
	}
	public int getPv() {
		return pv;
	}
	public static int getPbs() {
		return pbs;
	}
	public static int getPvs() {
		return pvs;
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
		
		GrandF aa = new ClassInherit();
//		Father aa = new ClassInherit();
//		ClassInherit aa = new ClassInherit();
		System.out.println("public int " + aa.getPb());
		System.out.println("private int " + aa.getPv());
		System.out.println("public static int " + aa.getPbs());
		System.out.println("private static int " + aa.getPvs());
		aa.getpb();
		aa.getpv();
		aa.getpbs();
		aa.getpvs();
		
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
	
	public int getPb() {
		return pb;
	}
	public int getPv() {
		return pv;
	}
	public static int getPbs() {
		return pbs;
	}
	public static int getPvs() {
		return pvs;
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
	public int getPb() {
		return pb;
	}
	public int getPv() {
		return pv;
	}
	public static int getPbs() {
		return pbs;
	}
	public static int getPvs() {
		return pvs;
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