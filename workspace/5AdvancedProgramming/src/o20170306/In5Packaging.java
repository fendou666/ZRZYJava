package o20170306;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class In5Packaging {
	public static void main(String[] args) {
		String fileName =  "d:\\" + "test.txt";
		File f1 = new File(fileName);
		
		FileReader charReader = null;
		FileWriter charWriter = null;
		
		BufferedReader buffR = null;
		BufferedWriter buffW = null;
		
		String readLine="";
		String add = "这是新加的String";
		int readCharReturn;
		int writeCharReturn;
		char [] readCharArray = new char[1024];
		try {
			charReader = new FileReader(f1);
			buffR = new BufferedReader(charReader);
			
			while((readLine = buffR.readLine())!=null){
				System.out.println(readLine);
			}
			buffR.close();
			
			charWriter = new FileWriter(f1);
			buffW = new BufferedWriter(charWriter);
			buffW.write(add);
			buffW.flush();
			buffW.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
