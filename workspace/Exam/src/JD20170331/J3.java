package JD20170331;

public class J3 {
	private int in1;
	private String str1;
	private static J3 obj=null;
	
	private J3() {
	}

	private J3(int in1, String str1) {
		this.in1 = in1;
		this.str1 = str1;
	}

	public static J3 getObj(){
		if (obj==null){
			obj = new J3();
		}
		return obj;
	}
	
}
