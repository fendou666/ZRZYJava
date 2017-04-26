package S9Collection;

public class BasicClassCMPEquals implements Comparable<BasicClassCMPEquals> {
	private int studentNum;
	private String ClassName;
	private double score;
	
	
	public BasicClassCMPEquals() {
	
	}

	public BasicClassCMPEquals(int studentNum, String className, double score) {
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
		return "BasicClassCMPEquals [studentNum=" + studentNum + ", ClassName="
				+ ClassName + ", score=" + score + "]";
	}

	public String getCompareString(int em1){
		String em1Str = "0000000000" + em1;
		em1Str = em1Str.substring(em1Str.length() -10);
		return em1Str;
	}
	
	public String getCompareString(double em1){
		String em1Str = "0000000000" + em1 + "0000000";
		int index = em1Str.indexOf('.');
		em1Str = em1Str.substring(index-5, index+5);
		return em1Str;
	}
	
	@Override
	public int compareTo(BasicClassCMPEquals o) {
//		System.out.println("这是this " + this);
//		System.out.println("这是o" + o);
		
		int rec = 0;
		if(this == null && o == null){
			rec =  0;
		}else if(this == null){
			rec =  1;
		}else if(o == null) {
			rec =  -1;
		}else{
			String thisStr = getCompareString(this.studentNum);
			String oStr =  getCompareString(o.studentNum);
			
			thisStr += getCompareString(this.score);
			oStr += getCompareString(o.score);

			thisStr += this.ClassName;
			oStr += o.ClassName;
			rec =  thisStr.compareTo(oStr);
		}
		return rec;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicClassCMPEquals other = (BasicClassCMPEquals) obj;
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
