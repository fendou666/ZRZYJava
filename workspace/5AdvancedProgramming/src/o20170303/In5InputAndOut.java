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
		String word = "�ϵ������ϵ������ϵ���������ٸ��ǵ緹��";
		File f1 = new File(file);
		
		System.out.println(f1.getName());
		System.out.println(f1.getParent()); 
		System.out.println(f1.length());
		System.out.println(f1.getPath());
		
		byte [] b = new byte[(int)(f1.length())];
		
		// ������
		try {
			FileInputStream inputS = new FileInputStream(f1);
//			for(int i=0;i<f1.length();i++) {
//				System.out.print(inputS.read());
//				System.out.print((char)(inputS.read()));
//			}
			System.out.print(inputS.read(b));
//			String s = "fs123fdsa";//String���� 
//
//			byte b[] = s.getBytes();//Stringת��Ϊbyte[] 
//
//			String t = new String(b);//bytep[]ת��ΪString
			System.out.println(new String(b));
			inputS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			// �����Ĳ�ͬ����д��Ĳ�����ͬ��һ��ΪString,һ��Ϊbyte[]
			
			//FileWriter writer = new FileWriter(f1);
			FileWriter writer = new FileWriter(f1, true);
			//writer.write(word);
			//��str�д�offλ�ÿ�ʼд��ָ������
			//writer.write(str, off, len);
			writer.write(word, 2, 10);
			writer.close();
//			// �Ը��ǵķ�ʽд��
//			//FileOutputStream outputS = new FileOutputStream(f1);
//			// ��׷�ӵķ�ʽȥд��
//			FileOutputStream outputS = new FileOutputStream(f1, true);
//			
//			byte [] bO = word.getBytes();
//			// ��׷��
//			outputS.write(bO);;
//			outputS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}