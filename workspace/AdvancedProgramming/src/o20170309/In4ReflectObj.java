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
			
//			s1 = (In3Student)con[2].newInstance();  ����������𣿣�����TODO
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
		st1.setName("����");
		
		Field name;
		try {
			// Ҫ����get��field��ǰ�������Է��ʵĵ�
			name = c.getField("name");
			name.set(st2, "����");
			Field age = c.getField("age");
			name.set(st2, "����");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(st1);
		// ��������
		System.gc();
		// �˳�����  ���ݹ������� 0 ��״̬���ʾ�쳣��ֹ��
		System.exit(0);
		System.out.println(st2);
		
	}
}