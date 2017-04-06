package Basic;

import java.math.BigInteger;

public class z {
	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt("1a2d", 16));
//		
		System.out.println(new BigInteger("1010",10).toString(2));
		
		System.out.println(new BigInteger("-2",10).toString(2));
		
		System.out.println(Integer.toBinaryString(-2));
		
//		单目
		int a = 3, b;
		b = a++;
		System.out.println(b);
		System.out.println(a);
		
		b = ++a;
		System.out.println(b);
		System.out.println(a);
//		双目
		int x = 4270;
		System.out.println(x/1000*1000);
		double y = 4270;
		System.out.println(x/1000*1000);
//		双目中的特殊+号, 
		System.out.println(5+2);
		System.out.println("5"+2);
		System.out.println(5+"2");
		System.out.println(5+5+"2");
		System.out.println(5+5+"2"+5+5);// 证明只要左边变成字符串后，就会一直是字符串拼接
		System.out.println(5+5+"2"+(5+5)); // 有括号的优先算
//		赋值运算符
		int m = 10;
		m+=10;
		m-=10;
		m*=10;
		m/=10;
//		short n = 2;
//		n=n+1; // 普通的运算会自动变成最大的数据类型
//		n+=1; // += 只是对值直接加1，不会有类型转换的问题
//		double j = 10;
//		int k = (int)(j + 22.3);
		int zzz = 1;
		zzz +=2.3;
		System.out.println(zzz);
		
//		转义运算符
//		System.out.println("\"); // 直接一个\会报错，转义必须跟转义字符 要么字母要么符号
		
		System.out.println("\\\"你好，世界\"\\");
		System.out.println("123\b222"); // \b相当于键盘的backspace
		System.out.println("hellow\rworld"); // \r相当于回车键
		System.out.println("hellow\nworld"); // \n为换行符
		System.out.println("hellow\tworld"); // 制表符
		System.out.println("hellow\r\nworld"); // windows的回车键相当于\r\n
//		其他转义
		System.out.println("\"");
		
//		比较运算符
		
//		逻辑运算符 &|, && || ! ^,
		System.out.println(false^false); // 异或同真为真，其余为假
		
		
//		总结
		int i = Integer.MAX_VALUE;
		System.out.println(i); // 2147483647
		i+=1;
		System.out.println(i); // -2147483648
		System.out.println(Integer.parseInt("00000000000000000000000000000010", 2));
//		System.out.println(new BigInteger("10000000000000000000000000000000", 2));
		
		System.out.println(Integer.toBinaryString(-1));
//		i+=1;
//		System.out.println(i); // -2147483648
//		i+=1;
//		System.out.println(i); // -2147483647
		
//		System.out.println(64%0);
		System.out.println(false==false); // 为true
		System.out.println(64%0.0);
		System.out.println(64/0.0);
		System.out.println(64/0.0);
		System.out.println(64.0%0.0);
		
//		下面主要是用于对于Integer对象常量池的计算
//		测试原因
		Integer ii=120,jj=120,kk=150,ll=150;
		System.out.println(ii==jj);
		System.out.println(kk==ll);
//		证明常量池在-128到+127, 只有这个范围内两个包装器才是相同的
		
//		int g,h;
//		g= Integer.MIN_VALUE;
//		h= Integer.MIN_VALUE;
//		
//		while (true){
//			g++;
//			h++;
//			Integer r = g;
//			Integer t = h;
//			if (r==t){
//				System.out.println(r);
//				break;
//			}
//		}
//		short gg,hh;
//		gg= Short.MIN_VALUE;
//		hh= Short.MIN_VALUE;
//		
//		while (true){
//			gg++;
//			hh++;
//			Short r = (short)gg ;
//			Short t = (short)hh;
//			if (r==t){
//				System.out.println(r);
//				break;
//			}
//		}
		
//		long ggg,hhh;
//		ggg= Long.MIN_VALUE;
//		hhh= Long.MIN_VALUE;
//		
//		while (true){
//			ggg++;
//			hhh++;
//			Long r = ggg;
//			Long t = hhh;
//			System.out.println(r);
//			if (r==t){
//				System.out.println(r);
//				break;
//			}
//		}
		
		
//		引用常量null测试
//		((TestClass)null).theMethod();
//		((TestClass)null).theStatic();
//		TestClass.theStatic();
//		if(Object.class.equals(obj))
		
		System.out.println(Integer.reverse(1));
		System.out.println(Integer.toBinaryString(-2147483648));
	}
}
