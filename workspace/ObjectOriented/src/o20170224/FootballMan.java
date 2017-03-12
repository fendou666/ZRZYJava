package o20170224;

public class FootballMan extends SportMan {
	private String position;
	
	public FootballMan() {
		
	}
	public FootballMan(String name, Clothes clo, 
					String team, String position) {
		super(name, clo, team);
		this.position = position;
	}
	public void kickBallDirection () {
		System.out.println(this.getName() +"ÕýÔÚ´«Çò");
	}
	
	public String toString() {
		System.out.println("adf");
		return "asdfasdf";
	}
	
	
}
