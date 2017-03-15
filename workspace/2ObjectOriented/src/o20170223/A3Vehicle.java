package o20170223;

public class A3Vehicle {
	protected String name;
	protected String engine;
	 
	public A3Vehicle() {
		
	}
	
	public A3Vehicle(String name, String engine) {
		this.name = name;
		this.engine = engine;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	
	
//	public String toString() {
//		return "[engine---> name:" + name + ", engine:" + engine + "]";  
//	}
	
	public void star() {
		System.out.println(name + "启动");
	}
	public void stop() {
		System.out.println(name + "停下");
	}
	public void wheel(String direction) {
		System.out.println(name + "向" + direction + "转弯");
	}
	
	public String toString() {
		return name + "的引擎是" + engine  + "\n";
	}
	
}
