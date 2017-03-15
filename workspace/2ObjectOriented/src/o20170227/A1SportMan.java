package o20170227;

public abstract class A1SportMan {
	private String name;
	private A1Clothes clo;
	private String team;
	
	public A1SportMan() {
		
	}
	public A1SportMan(String name, A1Clothes clo, String team) {
		this.name = name;
		this.clo = clo;
		this.team = team;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public A1Clothes getClo() {
		return clo;
	}
	public void setClo(A1Clothes clo) {
		this.clo = clo;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	
	@Override
	public String toString() {
		return "运动员姓名：" + name + ", 衣服是" + clo.getType() + ", 队是" + team;
	}
	public abstract void exercise();
	

	
}
