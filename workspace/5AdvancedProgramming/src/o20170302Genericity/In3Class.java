package o20170302Genericity;

public class  In3Class<Z> implements Comparable<In1Book>, In3GenericityITF<In1Book> {
	private Z name;
//	@Override
//	public <T> T getT() {
//		// TODO Auto-generated method stub
//		return name;
//	}
//
//	@Override
//	public <T> void setT(T t) {
//		// TODO Auto-generated method stub
//		this.name = t;
//		
//	}
//	


	@Override
	public int compareTo(In1Book o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public In1Book getT() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setT(In1Book t) {
		// TODO Auto-generated method stub
		
	}


}
