package o20170302Collection;

public class In11Book {
	private String name;
	private int count;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public In11Book(){
		
	}
	
	public In11Book(String name, int count) {
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return "In1Book [name=" + name + ", count=" + count + "]";
	}
	
	
}
