package o20170224;

public class SportMan {
	private String name;
	private Clothes clo;
	private String team;
	
	public SportMan() {
		
	}
	public SportMan(String name, Clothes clo, String team) {
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
	public Clothes getClo() {
		return clo;
	}
	public void setClo(Clothes clo) {
		this.clo = clo;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
