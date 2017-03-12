package o20170223;

public class In1vehicle {
	private String name;
	private double engine;
	
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 开始
	public void star(){
		System.out.println(name + "开始");
	}
	
	// 转弯
	public void wheel(){
		System.out.println(name + "转弯");
	}
	// 转弯
	public void shutdown (){
		System.out.println(name + "停止");
	}

	

	
}
