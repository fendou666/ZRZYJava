package o20170306;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class In3Byte {
	public static void main(String[] args) {
		String fileName =  "d:\\" + "test.txt";
		File f1 = new File(fileName);
		FileInputStream byteInput;
		FileOutputStream byteOutput;
		String add = "这是新加的String";
		
		try {
			byteInput = new FileInputStream(f1);
			byte [] byteArray = new byte[(int)f1.length()];
//			for (int i=0;i<f1.length();i++) {
//				System.out.print(byteInput.read());
//			}
			byteInput.read(byteArray);
			System.out.println(new String(byteArray));
			byteOutput = new FileOutputStream(f1);
			
			byte [] outputByteArray = add.getBytes();
			byteOutput.write(outputByteArray);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
