package o20170306;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class In6ByteToCharToStream {
	public static void main(String[] args) {
		BufferedReader inputByteToCharToSteam = new  BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				System.out.println("������һ���ַ���");
				String s = inputByteToCharToSteam.readLine();
				System.out.println(s);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
