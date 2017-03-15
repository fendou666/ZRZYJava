package o20170302Genericity;

import java.util.Arrays;


// ∑∫–Õ¿‡
public class In1GenericityClass<E> {
	E[] e;
	int length;
	int index = 0;
	
	public In1GenericityClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public In1GenericityClass(E[] e, int length) {
		super();
		this.e = e;
		this.length = length;
		//this.index = index;
	}
	public void setE(E [] e){
		this.e = e;
	}
	


	public void setLength(int length){
		this.length = length;
	}
	
	public boolean score(E e){
		if (index <= length){
			System.out.println(e);
			this.e[index] = e;
			index ++;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "In1GenericityClass [e=" + Arrays.toString(e) + ", length="
				+ length + ", index=" + index + "]";
	}
	
	
	
	
}
