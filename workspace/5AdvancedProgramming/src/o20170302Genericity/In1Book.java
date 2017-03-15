package o20170302Genericity;

public class In1Book {
	private String name;
	private int count;
	
	public In1Book(){
		
	}
	
	public In1Book(String name, int count) {
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return "In1Book [name=" + name + ", count=" + count + "]";
	}
	
	
}
