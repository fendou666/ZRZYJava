package SerializableT;

import java.io.Serializable;

public class BasicClass implements Serializable {
	private int number;
	private String str;
	
	public BasicClass(int number, String str) {
		super();
		this.number = number;
		this.str = str;
	}
	public BasicClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "BasicClass [number=" + number + ", str=" + str + "]";
	}

}
