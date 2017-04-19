package S10properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Locale;
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
//		p.clear();
//		p.contains("v14")
//		p.containsKey("11")
//		p.containsValue("v14")
//		p.entrySet()
//		p.keySet()
//		p.list(out);
//		p.propertyNames()
//		p.putAll(t);
//		p.remove(key)
//		p.values()
	}
	
	public void secondPro(){
		Properties p = new Properties();
		p.put("11", "v11");
		p.put("12", "v12");
		p.put("12", "v12");
		p.put("13", "v13");
		p.put("14", "v14");
		
		
		
		try {
			p.storeToXML(new FileOutputStream(new File("src/S10properties/2.xml")), "");
			System.out.println(p.get("11"));
			p.replace("11", "123123123123");
			System.out.println(p.containsKey("12312312"));
//			comment即更改信息
			p.storeToXML(new FileOutputStream(new File("src/S10properties/2.xml")), "更改key11必须存入下次读取才是更改的值");
			p.replace("11", "12zzzzzzz");
//			经过测试会替换上一次的comment
			p.storeToXML(new FileOutputStream(new File("src/S10properties/2.xml")), "重新添加的会在哪里");
			p.loadFromXML(new FileInputStream("src/S10properties/2.xml"));
			System.out.println(p.get("11"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 方法名：测试.properties文件
	 * 
	 */
	
	public void thirdPro(){
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream("src/S10properties/ZH_CN.properties"));
			System.out.println(pro.get("id"));
			System.out.println(pro.get("name"));
			System.out.println(pro.getProperty("menu", "增加"));
			System.out.println(pro.getProperty("add", "增加"));
			String menuStr = pro.getProperty("menu");
			String [] menu = menuStr.split("#");
			for(String a: menu){
				System.out.println(a);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 方法名：通过反射获取获取本地文件<br>
	 * 1. 注意：关于反射获取的文件名默认是当前包下的文件名<br>
	 * 2. 如果：文件在当前目录的子目录下则是    子目录/文件名<br>
	 * 3. 绝对目录是以包名为绝对路径的  /包路径/文件名<br>
	 * @since <a href="http://www.cnblogs.com/javayuer/archive/2011/01/02/1924192.html">Java中getResourceAsStream的用法</a>
	 */
	public void fourthPro(){
//		InputStream input = this.getClass().getResourceAsStream("ZH_CN.properties");
		InputStream input = this.getClass().getResourceAsStream("/S10properties/ZH_CN.properties");
		try {
			Properties pro = new Properties();
			pro.load(input);
			Enumeration<Object> elements = pro.elements();
			while(elements.hasMoreElements()){
				System.out.println(elements.nextElement());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 方法名：国际化
	 * 调用Local类获取当前语言，编码等等
	 * 
	 */
	
	public void internation(){
		Locale locDefault = Locale.getDefault();
//		System.out.println(locDefault.toString());
		System.out.println(new Locale("Chinese").getVariant());
//		System.out.println(new Locale("Chinese").toString());
//		System.out.println(Locale.getISOCountries());
//		System.out.println(Locale.getISOLanguages());
		
	}
	
	public static void main(String[] args) {
		In1 p1= new In1(); 
//		p1.firstPro();
//		p1.secondPro();
//		p1.thirdPro();
//		p1.fourthPro();
		p1.internation();
	}
}
