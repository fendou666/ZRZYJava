package basic_20170221;

// 
public class StaticTest {
	// һ����������ж��ѧ������ֻ��һ����ʦ��static ���ܴ������ٸ�����
	// ��һֱֻ��һ�������д����Ķ����static��ֵ�������ж���ͬ����
	private String studentName;
	private int age;
	private static String teacher="1312";
	
	public StaticTest(){}
	public StaticTest(String name, int age){
		this.studentName = name;
		this.age = age;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public int getAge() {
		return age;
	}
	public void getAgea() {
	
	}
	public static String getTeacher() {
		return teacher;
	}
	public static void setTeacher(String teacher) {
		// ��̬�������ܵ��÷Ǿ�̬����
//		getAgea();
		StaticTest.teacher = teacher;
	}
	
	public static void main(String[] args) {
		//StaticTest.setTeacher("adadsf");
		System.out.println(StaticTest.teacher);
	}
	
	
	
	
}
