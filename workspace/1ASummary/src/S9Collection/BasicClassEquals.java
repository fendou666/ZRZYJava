package S9Collection;

public class BasicClassEquals {
	private int studentNum;
	private String ClassName;
	private double score;
	
	
	public BasicClassEquals() {
	
	}


	public BasicClassEquals(int studentNum, String className, double score) {
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
		return "BasicClassEquals [studentNum=" + studentNum + ", ClassName="
				+ ClassName + ", score=" + score + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicClassEquals other = (BasicClassEquals) obj;
		if (ClassName == null) {
			if (other.ClassName != null)
				return false;
		} else if (!ClassName.equals(other.ClassName))
			return false;
		if (Double.doubleToLongBits(score) != Double
				.doubleToLongBits(other.score))
			return false;
		if (studentNum != other.studentNum)
			return false;
		return true;
	}
	
	
	
}
