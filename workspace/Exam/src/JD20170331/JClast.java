package JD20170331;

import pack1.*;
import pack2.*;

class Person {
	 static void sayHello() {
		 System.out.println("HelloWorld!");
	 }
}

public class JClast {
	public static void main(String[] args) {
		((Person)null).sayHello();
		boolean b=true?false:true==true?false:true;
		System.out.println(b);
		boolean c=true?false:true?false:true;
		System.out.println(c);
		boolean d=false?true:true?false:true;
		System.out.println(d);
		String x="fmn";
		x.toUpperCase();
		String y=x.replace('f','F');
		y=y+"wxy";
		System.out.println(y);
//		不指定不可以运行
//		Class1.testMethod();
	}
}
