package yangjian;

/**
 * 
 * 
 * �ַ��������
 * ����:	ʵ��һ�����ܣ��ҳ��ַ����У���ͬ���ַ�(�ַ�����a~z,A~Z,0~9)�ĸ���
 * ������ַ������Ȳ�����20������ͬ���ַ�����������10��
 * �ڴ�����:	128MByte
 * ����:	�ַ������ȣ��ַ���
 * ���:	�ַ��������
 * ��������:	6,abaaal
 * �������:	3
 * ����ʾ	1�ҳ��ַ����в�ͬ���ַ�(�ַ�����a~z,A~Z,0~9)�ĸ���������ַ������Ȳ�����20������ͬ���ַ�����������10����
 * 2��Ҫ�����յĽ��ʹ�ô�ӡ������ӡ���д�ӡ��
 * 
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Ex9CharCount {
	public static Scanner in = new Scanner(System.in);
	
	public static String getDiffChar(ArrayList diffChar){
		char ch;
		byte [] diffB = new byte[diffChar.size()];
		for(int i=0; i<diffChar.size(); i++){
			diffB[i] = (byte)diffChar.get(i);
		}
		return new String(diffB);
	}
	
	public static boolean getDiffCharCount(String testStr){
		if(testStr.length()>20){
			System.out.println("�ַ������ȳ���20");
			return false;
		}
		
		byte[] bytes = testStr.getBytes();
		// ���岻ͬ�ַ������鼯��
		ArrayList diffChar = new ArrayList();
		boolean diffSign = false;
		for(byte b: bytes){
			//System.out.println(b);
			diffSign = true;
			// ����������Ĳ�ͬ�ַ������бȽ�
			for(int i=0; i<diffChar.size(); i++){
				if(b==(byte)diffChar.get(i)){
					diffSign = false;
				}
			}
			if(diffSign){
				diffChar.add(b);
			}
		}
		String diffString = getDiffChar(diffChar);
		System.out.println("��ͬ���ַ���" + diffString);
		if(diffString.length()>10){
			System.out.println("��ͬ�ַ�����10��");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("�������ַ���");
		String testStr = in.next();
		boolean sign = Ex9CharCount.getDiffCharCount(testStr);
	}
}
