package o20170227;

public class A1FootballMan extends A1SportMan {
	private String position;
	
	public A1FootballMan() {
		
	}
	public A1FootballMan(String name, A1Clothes clo, 
					String team, String position) {
		super(name, clo, team);
		this.position = position;
	}
	public void kickBallDirection () {
		System.out.println(this.getName() +"���ڴ���");
	}
	
	public String toString() {
		
		return super.toString()+"������λ�ã�" + position;
	}
	
	public  void exercise() {
		System.out.println("���������˶�");
	}
	
}
