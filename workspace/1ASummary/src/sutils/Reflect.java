package sutils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
	public Class<?> cls;
	private Object obj;
	
	public Reflect(Class<?> cls, Object obj){
		this.cls = cls;
		this.obj = obj;
	}
	
	public void methodTest(){
		Method [] ms = cls.getMethods();
		for (Method m: ms) {
			try {
				m.invoke(obj, null);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
