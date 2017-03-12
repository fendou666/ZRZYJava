package basic_20170221;

// 
public class StaticTest {
	// 一个班里可以有多个学生但是只有一个老师，static 不管创建多少个对象，
	// 它一直只有一个，所有创建的对象的static的值，由所有对象共同决定
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
		// 静态方法不能调用非静态方法
//		getAgea();
		StaticTest.teacher = teacher;
	}
	
	public static void main(String[] args) {
		//StaticTest.setTeacher("adadsf");
		System.out.println(StaticTest.teacher);
	}
	
	
	
	
}
