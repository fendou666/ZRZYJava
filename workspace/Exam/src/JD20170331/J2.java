package JD20170331;

import java.io.File;
import java.io.FileOutputStream;

public class J2 {
	
//	public static  void writerFile(String str){
//		
//		File f = new File("src/JD20170331/Dest.txt");
//		try {
//			FileOutputStream fops = new FileOutputStream(f);
//			byte [] wb = str.getBytes();
//			fops.write(wb);
//			fops.close();
//			System.out.println("写入src/JD20170331/Dest.txt文件成功");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	public static  void writerFile2(String str){
		
		File f = new File("src/JD20170331/Dest.txt");
		try {
			FileOutputStream fops = new FileOutputStream(f, true);
			byte [] wb = str.getBytes();
			fops.write(wb);
			fops.close();
			System.out.println("写入src/JD20170331/Dest.txt文件成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
//		writerFile("111,112,113,114,115");
		writerFile2("111");
		writerFile2("112");
		writerFile2("113");
		writerFile2("114");
		writerFile2("115");
	}
	
}
