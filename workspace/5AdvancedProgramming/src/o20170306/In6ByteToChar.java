package o20170306;

import java.io.IOException;
import java.io.InputStreamReader;

public class In6ByteToChar {
	public static void main(String[] args) {
		InputStreamReader inputByteToChar = new InputStreamReader(System.in);
		try {
			while(true) {
				System.out.println("������һ���ַ�");
				int i = inputByteToChar.read();
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
