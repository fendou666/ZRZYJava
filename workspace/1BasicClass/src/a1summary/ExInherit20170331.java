package a1summary;



// ������ֵ�оͽ�ԭ��
//  ����ķ�������ʹ�ø�������
public class ExInherit20170331 {
	int i = 10;
	public ExInherit20170331(){
		System.out.println("���๹�캯��");
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
//		���Թ��췽��
//		t.testConstructor();
//		�������Ժͷ���
		t.testPropertyMethod();
		
	}
}
class C extends ExInherit20170331 {
	int i = 20;
	public C(){
		System.out.println("���๹�췽��");
	}
	
	public void print(){
//		i++;
		System.out.println(this.i);
	}
}