package o20170309;

import java.lang.reflect.Field;

public class In4ReflectObj {
	public static void main(String[] args) {
		Class<?> c = null;
		In3Student st1 = null;
		In3Student st2 = null;
		In3Student st3 = null;
		c = In3Student.class;

		
		try {
			
//			s1 = (In3Student)con[2].newInstance();  与下面的区别？？？？TODO
			st1 = (In3Student)c.newInstance();
			st2 = (In3Student)c.newInstance();
			st3 = (In3Student)c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		st1.setAge(100);
		st1.setName("孔子");
		
		Field name;
		try {
			// 要求所get的field当前类必须可以访问的到
			name = c.getField("name");
			name.set(st2, "孟子");
			Field age = c.getField("age");
			name.set(st2, "孟子");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(st1);
		// 垃圾回收
		System.gc();
		// 退出程序  根据惯例，非 0 的状态码表示异常终止。
		System.exit(0);
		System.out.println(st2);
		
	}
}
