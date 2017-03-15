package o20170302Genericity;

public class In1Test {
	public static void main(String[] args) {
		In1Student [] stu = {
				new In1Student("小明", 22),
				new In1Student("小李", 20),
				new In1Student("小刘", 21),
		};
		
		In1Book [] book = {
				new In1Book("红楼梦", 33),
				new In1Book("西游记", 43),
				new In1Book("鹿鼎记", 23),
		};
		
		//In1GenericityClass<In1Student> stuStore = new In1GenericityClass<In1Student> ();
		
		In1GenericityClass<In1Student> stuStore = new In1GenericityClass<In1Student>(stu, 3);
		
		System.out.println(stuStore);
		
		//stuStore.score(new In1Student("王五",11));
		In1GenericityClass<In1Book> bookStore = new In1GenericityClass<In1Book>();
		bookStore.setE(book);
		System.out.println(bookStore);
	}
}
