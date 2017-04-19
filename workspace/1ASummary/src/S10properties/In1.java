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
	 * ����������һ��put/get/
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
//			comment��������Ϣ
			p.storeToXML(new FileOutputStream(new File("src/S10properties/2.xml")), "����key11��������´ζ�ȡ���Ǹ��ĵ�ֵ");
			p.replace("11", "12zzzzzzz");
//			�������Ի��滻��һ�ε�comment
			p.storeToXML(new FileOutputStream(new File("src/S10properties/2.xml")), "������ӵĻ�������");
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
	 * ������������.properties�ļ�
	 * 
	 */
	
	public void thirdPro(){
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream("src/S10properties/ZH_CN.properties"));
			System.out.println(pro.get("id"));
			System.out.println(pro.get("name"));
			System.out.println(pro.getProperty("menu", "����"));
			System.out.println(pro.getProperty("add", "����"));
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
	 * ��������ͨ�������ȡ��ȡ�����ļ�<br>
	 * 1. ע�⣺���ڷ����ȡ���ļ���Ĭ���ǵ�ǰ���µ��ļ���<br>
	 * 2. ������ļ��ڵ�ǰĿ¼����Ŀ¼������    ��Ŀ¼/�ļ���<br>
	 * 3. ����Ŀ¼���԰���Ϊ����·����  /��·��/�ļ���<br>
	 * @since <a href="http://www.cnblogs.com/javayuer/archive/2011/01/02/1924192.html">Java��getResourceAsStream���÷�</a>
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
	 * �����������ʻ�
	 * ����Local���ȡ��ǰ���ԣ�����ȵ�
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
