package S9Collection;

public class BasicClassCMPHash implements Comparable<BasicClassCMPHash> {
	private int studentNum;
	private String ClassName;
	private double score;
	
	
	public BasicClassCMPHash() {
	
	}

	public BasicClassCMPHash(int studentNum, String className, double score) {
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
		return "BasicClassCMPHash [studentNum=" + studentNum + ", ClassName="
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
	public int compareTo(BasicClassCMPHash o) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ClassName == null) ? 0 : ClassName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + studentNum;
		return result;
	}
	
}
