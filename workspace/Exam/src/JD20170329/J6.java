package JD20170329;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * 
 * 6.	把文件从D盘流到E盘S
 * @author Administrator
 *
 */

public class J6 {
	public static void main(String[] args) {
		File readF = new File("D:\\360极速浏览器下载\\yy小损样-十年戎马心孤单.mp3");
		File writeF = new File("E:\\yy小损样-十年戎马心孤单.mp3");
		String redStr;
		if (!writeF.exists()){
			try {
				writeF.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(readF)));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writeF)));
			PrintStream pw = new PrintStream(new FileOutputStream(writeF));
//			int i = 0;
			while((redStr = bf.readLine())!=null){
				pw.print(redStr);
			}
			pw.flush();
			bf.close();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
