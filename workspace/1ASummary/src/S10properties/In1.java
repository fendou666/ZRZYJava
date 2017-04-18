package S10properties;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;



public class In1 {
	
	
	/**
	 * 方法名：第一种put/get/
	 * @param args
	 */
	public void firstPro(){
		Properties p = new Properties();
		p.put("11", "v11");
		p.put("12", "v12");
		p.put("12", "v12");
		p.put("13", "v13");
		p.put("14", "v14");
		
//		Enumeration<Object> elements = p.elements();
//		while(elements.hasMoreElements()){
//			System.out.println(elements.nextElement());
//		}
		
		System.out.println(p.get("11"));
		System.out.println(p.getProperty("11"));
		System.out.println(p.getProperty("111", "A11111111111"));
	}
	
	public void secondPro(){
		Properties p = new Properties();
		p.put("11", "v11");
		p.put("12", "v12");
		p.put("12", "v12");
		p.put("13", "v13");
		p.put("14", "v14");
		
		p.storeToXML(new FileOutputStream(new File("./S9Collection/2.xml")), "");
	}
	
	public static void main(String[] args) {
		In1 p1= new In1(); 
		p1.firstPro();
	}
}
