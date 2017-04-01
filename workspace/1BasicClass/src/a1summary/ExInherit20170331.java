package a1summary;



// 方法对值有就近原则
//  外面的访问属性使用父类属性
public class ExInherit20170331 {
	int i = 10;
	public ExInherit20170331(){
		System.out.println("父类构造函数");
	}
	
	
	public void change(int i){
		this.i = i;
	}
	public void print(){
		System.out.println(this.i);
	}
	public void testConstructor(){
		System.out.println("++++++++++");
		ExInherit20170331 f = new ExInherit20170331();
		System.out.println("------------");
		C c = new C();
		System.out.println("***********");
		ExInherit20170331 ff = new C();
	}
	public void testPropertyMethod(){
		ExInherit20170331 p = new C();
		System.out.println(p.i);
		p.i = 50;
		System.out.println(p.i);
		p.change(15);
		System.out.println(p.i);
		p.print();
	}
	
	
	public static void main(String[] args) {
		ExInherit20170331 t = new ExInherit20170331();
//		测试构造方法
//		t.testConstructor();
//		测试属性和方法
		t.testPropertyMethod();
		
	}
}
class C extends ExInherit20170331 {
	int i = 20;
	public C(){
		System.out.println("子类构造方法");
	}
	
	public void print(){
//		i++;
		System.out.println(this.i);
	}
}
