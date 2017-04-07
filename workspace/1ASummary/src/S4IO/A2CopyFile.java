package S4IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class A2CopyFile {

	
	public void charCopy1(File from, File to) throws Exception{
		
		FileReader f = new FileReader(from);
		FileWriter t = new FileWriter(to); 
		
		int ch = 0;
		while ((ch=f.read())!=-1) {
			System.out.println((char)ch);
			t.write(ch);
		}
		f.close();
		t.close();
	}
	
	public void bufferCharCopy(File from, File to) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(from));
		BufferedWriter bw = new BufferedWriter(new FileWriter(to));
		
		int ch = 0;
		while((ch=br.read())!=-1){
			bw.write(ch);
		}
		bw.write("可以直接写入一串字符串");
		bw.write("可以写入字符数组".toCharArray());
		bw.flush();
		bw.close();
		br.close();
	}
	public static void main(String[] args) {
		A2CopyFile A2 = new A2CopyFile();
		File from = new File("D:"+File.separator +"bbb.txt");
		File to = new File("F:"+File.separator +"bbb.txt");
		File to1 = new File("E:"+File.separator +"bbb.txt");
		try {
			A2.charCopy1(from, to);
			A2.bufferCharCopy(from, to1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
