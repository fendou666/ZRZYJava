package basic_20170213com.Ics.practice;


public class ScoreCalculate {
	// ����
	double javaScore;
	double cScore;
	double databaseScore;
	
	// ��̬��
	static {
		System.out.println("���Ǿ�̬��");
	}
	// ʵ����
	{
		System.out.println("����ʵ����");
	}
	// �ڲ���
	class innerClass {
		String str = "�����ڲ���";
		String func() {
			System.out.println("�����ڲ���ķ���");
			return str;
		}
	}
	
	
	// ���췽��
	public ScoreCalculate() {
		System.out.println("�����޲ι��췽��");
	}
	ScoreCalculate(double javaScore, double cScore, double databaseScore) {
		this.javaScore = javaScore;
		this.cScore = cScore;
		this.databaseScore = databaseScore;
		System.out.println("�����вι��췽��");
	}
	
	// �����Ƿ����þ�̬��
	public static void staticBloackTest() {
		System.out.println("ͨ��ֱ�Ӽ�������þ�̬��");
	}
	
	// getter/setter����
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
