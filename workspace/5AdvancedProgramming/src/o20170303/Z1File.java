package o20170303;

import java.io.File;
import java.io.IOException;

public class Z1File {
	public static void main(String[] args) {
		File dir = new File("C:\\Program Files\\feiq\\Recv Files\\170308\\PPT\\PPT\\JavaSE知识点课程");
		String needDir = "C:\\Program Files\\feiq\\Recv Files\\170308\\PPT\\PPT\\JavaSE知识点课程\\总结\\";
		File need =  new File("C:\\Program Files\\feiq\\Recv Files\\170308\\PPT\\PPT\\JavaSE知识点课程\\总结\\zz.txt");
		//need.mkdir();
		try {
			need.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for (String f:dir.list()) {
//			System.out.println(f);
//			(new File(needDir+f)).mkdir();
//		}
		
	}
}
