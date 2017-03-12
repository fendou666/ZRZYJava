package basic_20170210;

public class Poet {
	
	String name;
	String anotherName;
	String nation;
	String dynasty;
	
	String birthplace;
	String diethTime;
	Poet(){};
	
	Poet(String name, String anotherName, String nation,
			String dynasty, String birthplace, String diethTime) {
		this.name = name;
		this.anotherName = anotherName;
		this.nation = nation;
		this.dynasty = dynasty;
		this.birthplace = birthplace;
		this.diethTime = diethTime;
	};
	Poet(String birthplace, String diethTime) {
		this.birthplace = birthplace;
		this.diethTime = diethTime;
	};
	
	String getName() {
		return name;
	}
}
