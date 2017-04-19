package S11io;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class In3LoadTieba {
	public static void loadJpgFiles(){
		try {
			URL tieba = new URL("https://tieba.baidu.com/p/5068302771");
			URLConnection openConnection;
			try {
				openConnection = tieba.openConnection();
				openConnection.connect();
				
				InputStream inputStream = openConnection.getInputStream();
				
				BufferedOutputStream bops = new BufferedOutputStream(new FileOutputStream("d://test.txt"))
				
				
//				Method [] ms = openConnection.getClass().getMethods();
//				for (Method m : ms) {
//					try {
//						System.out.println("方法名：" + m.getName());
//						System.out.println(m.invoke(openConnection, null));
//					} catch (IllegalAccessException | IllegalArgumentException
//							| InvocationTargetException e) {
//					}
//				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
//			Method [] ms = tieba.getClass().getMethods();
//			for (Method m : ms) {
//				try {
//					System.out.println("方法名：" + m.getName());
//					System.out.println(m.invoke(tieba, null));
//				} catch (IllegalAccessException | IllegalArgumentException
//						| InvocationTargetException e) {
//				}
//			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		loadJpgFiles();
	}
}
