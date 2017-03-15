package basic_20170213com.Ics.practice;


public class ScoreCalculate {
	// 属性
	double javaScore;
	double cScore;
	double databaseScore;
	
	// 静态快
	static {
		System.out.println("我是静态块");
	}
	// 实例块
	{
		System.out.println("我是实例块");
	}
	// 内部类
	class innerClass {
		String str = "我是内部类";
		String func() {
			System.out.println("我是内部类的方法");
			return str;
		}
	}
	
	
	// 构造方法
	public ScoreCalculate() {
		System.out.println("我是无参构造方法");
	}
	ScoreCalculate(double javaScore, double cScore, double databaseScore) {
		this.javaScore = javaScore;
		this.cScore = cScore;
		this.databaseScore = databaseScore;
		System.out.println("我是有参构造方法");
	}
	
	// 测试是否会调用静态块
	public static void staticBloackTest() {
		System.out.println("通过直接加载类调用静态块");
	}
	
	// getter/setter方法
	double getJavaScore(){
		return javaScore;
	};
	void setJavaScore(double javaScore){
		this.javaScore = javaScore; 
	};
	
	double getCScore(){
		return cScore;
	};
	void setCScore(double cScore){
		this.cScore = cScore;
	};
	
	double getDatabaseScore(){
		return databaseScore;
	};
	void setdatabaseScore(double databaseScore){
		this.databaseScore = databaseScore;
	};
	
	// other method
	double getAverageScore() {
		double averageScore = (javaScore + cScore + databaseScore)/3;
		return averageScore;
	};
	double getToutleScore() {
		return (javaScore + cScore + databaseScore);
	};
	
	public static void main(String[] args) {
		staticBloackTest();
		int a = 10;
		System.out.println();
	}
	
}
