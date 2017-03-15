package o20170303;

import java.io.File;
import java.io.IOException;

public class In3File {
	public static void main(String[] args) {
		
		String fileName = "d:" + File.separator + "aa.text";
		String fileName1 = "d:\\bb.text";
		// 创建
		String dirName = "d:\\java00207";
		// 读取目录
		String apowerDir = "D:\\Program Files (x86)\\Apowersoft\\Video Download Capture 6";
		File f = new File(fileName);
		
		try {
			if (f.exists()) {
				f.delete();
				System.out.println(fileName + "已经被删除");
			} else {
				f.createNewFile();
				System.out.println(fileName + "已经被创建");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
//		long length = 10L;
//		int[] a = new int[length];
//		
//		byte[] b = new byte[length];
		File dir = new File(dirName);
		
		dir.mkdir();
		
		
		
		
		
	}
}
