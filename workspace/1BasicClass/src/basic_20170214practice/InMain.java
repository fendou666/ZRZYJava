package basic_20170214practice;

public class InMain {
	
	public static void main(String[] args){
		
		In2Person student = new In2Person("小明", 13514512652L, "1154251");
		In1Book geLin = new In1Book(100, "格林童话", "格林兄弟", "novel", "人民出版社", 24.3);
		student.borrowBook(geLin);
		System.out.println(student.getBook());
		student.returnBook();
		System.out.println(student.getBook());
	}
	
	
	
	
}
