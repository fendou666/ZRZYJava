package o20170303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class In5InputAndOut {
	
	
	public static void main(String[] args) {
		String file = "d:" + File.separator + "test.txt";
		String word = "上单发给上单发给上单发给是梵蒂冈是电饭锅";
		File f1 = new File(file);
		
		System.out.println(f1.getName());
		System.out.println(f1.getParent()); 
		System.out.println(f1.length());
		System.out.println(f1.getPath());
		
		byte [] b = new byte[(int)(f1.length())];
		
		// 输入流
		try {
			FileInputStream inputS = new FileInputStream(f1);
//			for(int i=0;i<f1.length();i++) {
//				System.out.print(inputS.read());
//				System.out.print((char)(inputS.read()));
//			}
			System.out.print(inputS.read(b));
//			String s = "fs123fdsa";//String变量 
//
//			byte b[] = s.getBytes();//String转换为byte[] 
//
//			String t = new String(b);//bytep[]转换为String
			System.out.println(new String(b));
			inputS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			// 两个的不同在于写入的参数不同，一个为String,一个为byte[]
			
			//FileWriter writer = new FileWriter(f1);
			FileWriter writer = new FileWriter(f1, true);
			//writer.write(word);
			//将str中从off位置开始写入指定长度
			//writer.write(str, off, len);
			writer.write(word, 2, 10);
			writer.close();
//			// 以覆盖的方式写入
//			//FileOutputStream outputS = new FileOutputStream(f1);
//			// 已追加的方式去写入
//			FileOutputStream outputS = new FileOutputStream(f1, true);
//			
//			byte [] bO = word.getBytes();
//			// 非追加
//			outputS.write(bO);;
//			outputS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
