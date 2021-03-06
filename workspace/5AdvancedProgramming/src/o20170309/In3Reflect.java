package o20170309;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class In3Reflect {
	public static void main(String[] args) {
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		Class<?> c4 = null;
		In3Student test = new In3Student();
		
		
		
//		c1 = Class.forName("o20170309.In3Student");
		c2 = In3Student.class;
		c3 = test.getClass();
		c4 = Class.class;
		
		try {
			c1 = Class.forName("o20170309.In3Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		
		
		// 总结关于获取类中的字段方法，以及构造方法，前提是可以访问的到相应的东西
		
		// 获取Class的所有方法
//		Method [] m = c4.getMethods();
//		
//		for (Method x:m) {
//			System.out.println(x);
//		}
		
		// 获取类中所有方法  如果方法为private亦不可获取
//		Method [] m = c3.getMethods();
//		
//		for (Method x:m) {
//			System.out.println(x);
//		}
		
		// 获取类中的构造方法
//		Constructor<?>[] con = c3.getConstructors();
//		for (Constructor<?> c:con) {
//			System.out.println(c);
//		} 
//		
		// 获取字段
		// 因为字段为private所以不可获得到
//		Field[] fs = c3.getFields();
//		for(Field f:fs) {
//			System.out.println(f);
//		}
		
		
		// 多种实例化
		
		Constructor<?>[] con = c3.getConstructors();
		for (int i =0;i<con.length; i++) {
			System.out.println(con[i]);
		}
//		得到结果
//		public o20170309.In3Student(java.lang.String,int)
//		public o20170309.In3Student(java.lang.String)
//		public o20170309.In3Student()
		In3Student s1, s2, s3=null;
		try {
			s1 = (In3Student)con[2].newInstance();
			s2 = (In3Student)con[1].newInstance("孔子");
			s3 = (In3Student)con[0].newInstance("孟子", 33);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(s3.getName());
		
//		不可以
//		s1 = new (con[0]("meng", 22));
		
                                                           		
	}
	
}
