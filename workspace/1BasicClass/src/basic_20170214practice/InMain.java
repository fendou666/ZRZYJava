package basic_20170214practice;

public class InMain {
	
	public static void main(String[] args){
		
		In2Person student = new In2Person("С��", 13514512652L, "1154251");
		In1Book geLin = new In1Book(100, "����ͯ��", "�����ֵ�", "novel", "���������", 24.3);
		student.borrowBook(geLin);
		System.out.println(student.getBook());
		student.returnBook();
		System.out.println(student.getBook());
	}
	
	
	
	
}
