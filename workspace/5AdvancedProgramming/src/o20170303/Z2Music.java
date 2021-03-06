package o20170303;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Z2Music {
	
//	字节copy1
	public static boolean byteCopy1(File from, File to){
		if(!from.exists()){
			return false;
		}
//		写的时候会自动创建文件，所以不需要这段代码
//		if (!to.exists()){
//			try {
//				to.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		int redChar;
		try {
			FileInputStream fis = new FileInputStream(from);
			FileOutputStream fos = new FileOutputStream(to);
			while((redChar = fis.read())!=-1){
				fos.write(redChar);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	
//	字节copy2
	public static boolean byteCopy2(File from, File to){
		if(!from.exists()){
			return false;
		}
		int redChar;
		try {
			BufferedInputStream bfis = new BufferedInputStream(new FileInputStream(from));
			BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream(to));
			while((redChar = bfis.read())!=-1){
				bfos.write(redChar);
			}
			bfis.close();
			bfos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
//	字节copy3 
	public static boolean byteCopy3(File from, File to){
		if(!from.exists()){
			return false;
		}
		
		int redLegth;
		byte [] b = new byte[1024];
		try {
			FileInputStream fis = new FileInputStream(from);
			FileOutputStream fos = new FileOutputStream(to);
			while((redLegth = fis.read(b))!=-1){
//				用这个读取没问题，redLegth返回每次读到字符
				fos.write(b,0,redLegth);
//				会将文件读大， 最后一个1024读入写入1024有问题
//				fos.write(b);
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	
	
	
//	字节转字符写入文件 发现丢字节
	public static boolean byteToCharCopy1(File from, File to){
		if(!from.exists()){
			return false;
		}
		int redChar;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(from))) ;
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(to))) ;
			while((redChar = br.read())!=-1){
				bw.write(redChar);
			}
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
//	使用printerWriter 丢字节失败
	public static boolean byteToCharCopy2(File from, File to){
		if(!from.exists()){
			return false;
		}
		int redChar;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(from))) ;
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(to))) ;
			while((redChar = br.read())!=-1){
				pw.write(redChar);
			}
			pw.flush();
			br.close();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		File readF = new File("D:\\360极速浏览器下载\\yy小损样-十年戎马心孤单.mp3");
		File writeF = new File("E:\\yy小损样-十年戎马心孤单.mp3");
		if(byteCopy3(readF,writeF)){
			System.out.println("文件copy成功");
		}else{
			System.out.println("文件copy失败");
		}

		
	}
}
