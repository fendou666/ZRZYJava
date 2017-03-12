package basic_20170208;

public class properties {
//	讲全局变量要在局部使用不能直接调用变量名，只能通过this.属性名调用
//	String name="张三";
//	String sex;
//	int age=10;
//	double height=150;
//	double weight;
//	sex="男";
	
	
	public static void main(String[] args){
		String name="张三";
		String sex;
		int age=10;
		double height=150;
		double weight;
		sex="男";
//		weight=30;
		System.out.println("姓名"+ name + (sex="女") + age );
		System.out.println(height);
	}
	
}
