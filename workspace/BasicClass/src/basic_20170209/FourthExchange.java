package basic_20170209;

public class FourthExchange {
	
	
	public static void main(String[] args) {
		int a = 10, 
			b = 20, 
			c = 30, 
			d = 40,
			e = 50,
			tmp = 0;
		/*System.out.println("已知\na = " +a +"\n"
							+ "b = " + b + "\n"
							+ "c = " + c + "\n"
							+ "d = " + d);*/
		System.out.println("已知\na = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		// 数据交换 根据要求得知 需要a,e交换， b,d交换
		tmp = a;
		a = e;
		e = tmp;
		tmp = b;
		b = d;
		d = tmp;
		System.out.println("数据交换后\na = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		/*System.out.println("数据交换后\na = " +a +"\n"
							+ "b = " + b + "\n"
							+ "c = " + c + "\n"
							+ "d = " + d);*/
	}
};
	
