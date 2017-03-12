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
		
		
		// �ܽ���ڻ�ȡ���е��ֶη������Լ����췽����ǰ���ǿ��Է��ʵĵ���Ӧ�Ķ���
		
		// ��ȡClass�����з���
//		Method [] m = c4.getMethods();
//		
//		for (Method x:m) {
//			System.out.println(x);
//		}
		
		// ��ȡ�������з���  �������Ϊprivate�಻�ɻ�ȡ
//		Method [] m = c3.getMethods();
//		
//		for (Method x:m) {
//			System.out.println(x);
//		}
		
		// ��ȡ���еĹ��췽��
//		Constructor<?>[] con = c3.getConstructors();
//		for (Constructor<?> c:con) {
//			System.out.println(c);
//		} 
//		
		// ��ȡ�ֶ�
		// ��Ϊ�ֶ�Ϊprivate���Բ��ɻ�õ�
//		Field[] fs = c3.getFields();
//		for(Field f:fs) {
//			System.out.println(f);
//		}
		
		
		// ����ʵ����
		
		Constructor<?>[] con = c3.getConstructors();
		for (int i =0;i<con.length; i++) {
			System.out.println(con[i]);
		}
//		�õ����
//		public o20170309.In3Student(java.lang.String,int)
//		public o20170309.In3Student(java.lang.String)
//		public o20170309.In3Student()
		In3Student s1, s2, s3=null;
		try {
			s1 = (In3Student)con[2].newInstance();
			s2 = (In3Student)con[1].newInstance("����");
			s3 = (In3Student)con[0].newInstance("����", 33);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(s3.getName());
		
//		������
//		s1 = new (con[0]("meng", 22));
		
                                                           		
	}
	
}