package JD20170331;

import java.io.File;
import java.io.FileInputStream;

public class J1 {
	public static boolean readFile(File f){
		if(!f.exists()){
			System.out.println("�ļ�������");
			return false;
		}
		try {
			int rednum = 0;
			byte [] readbt = new byte[1024];
			String str = "";
			FileInputStream fis = new FileInputStream(f);
			while((rednum=fis.read(readbt))!=-1){
				str = new String(readbt);
				System.out.print(str);
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		File f = new File("src/JD20170331/J3.java");
		readFile(f);
	}
}
