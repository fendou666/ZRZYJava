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
	
//	�ֽ�copy1
	public static boolean byteCopy1(File from, File to){
		if(!from.exists()){
			return false;
		}
//		д��ʱ����Զ������ļ������Բ���Ҫ��δ���
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
//	�ֽ�copy2
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
	
//	�ֽ�ת�ַ�д���ļ� ���ֶ��ֽ�
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
//	ʹ��printerWriter ���ֽ�ʧ��
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
		File readF = new File("D:\\360�������������\\yyС����-ʮ�������Ĺµ�.mp3");
		File writeF = new File("E:\\yyС����-ʮ�������Ĺµ�.mp3");
		if(byteToCharCopy2(readF,writeF)){
			System.out.println("�ļ�copy�ɹ�");
		}else{
			System.out.println("�ļ�copyʧ��");
		}

		
	}
}