package o20170306;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class In4Char {
	public static void main(String[] args) {
		String fileName =  "d:\\" + "test.txt";
		File f1 = new File(fileName);
		FileReader charReader = null;
		FileWriter charWriter = null;
		String add = "这是新加的String";
		int readCharReturn;
		int writeCharReturn;
		char [] readCharArray = new char[1024];
		try {
			charReader = new FileReader(f1);
//			while((readCharReturn = charReader.read())!=-1) {
//				System.out.println(readCharReturn);
//			}
			charReader.read(readCharArray);
//			for (int i=0;i<readCharArray.length;i++) {
//				System.out.println(readCharArray[i]);
//			}

			System.out.println(new String(readCharArray));
			
			charWriter = new FileWriter(f1, true);
			
			charWriter.write(add.toCharArray());
			charWriter.write(add);
			charReader.close();
			charWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
