package o20170303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class In1Property {
	public static void main(String[] args) {
		Properties pro = new Properties();
		
		try {
			pro.load(new FileInputStream(new File("src/o20170303/test.properties")));
			System.out.println(pro.getProperty("name"));
			pro.setProperty("ddd", "123234");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("ddd"));
		
	}
}
