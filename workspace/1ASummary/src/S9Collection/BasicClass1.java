package S9Collection;


/**
 * 假设这是一个学生类
 * @author Administrator
 *
 */
public class BasicClass1 {
	private int studentNum;
	private String ClassName;
	private double score;
	
	
	public BasicClass1() {
	}


	public BasicClass1(int studentNum, String className, double score) {
		this.studentNum = studentNum;
		ClassName = className;
		this.score = score;
	}


	public int getStudentNum() {
		return studentNum;
	}


	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}


	public String getClassName() {
		return ClassName;
	}


	public void setClassName(String className) {
		ClassName = className;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "BasicClass1 [studentNum=" + studentNum + ", ClassName="
				+ ClassName + ", score=" + score + "]";
	}
	
	
}
