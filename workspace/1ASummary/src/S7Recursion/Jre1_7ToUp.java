package S7Recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Jre1_7ToUp {

	public static void jreNameChange(File f){
		String s = "";
		int i = 0;
		if (f.isFile()){
			if (f.getName().equals(".classpath")){
				try {
					BufferedReader br = new BufferedReader(new FileReader(f));
					StringBuffer sb = new StringBuffer();
					while((s=br.readLine())!=null){
//						ͨ��vimȷ������ȫ��\n
						sb.append(s+"\n");
					}
					br.close();
					//if((i=sb.indexOf("/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.7"))!=-1){
						System.out.println("aaa");
						BufferedWriter bw = new BufferedWriter(new FileWriter(f));
						s = new String(sb);
						//s = s.replaceAll("/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.7", "");
						bw.write(s);
						bw.flush();
						bw.close();
					//}
//					System.out.println(sb);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			File[] files = f.listFiles();
			for (File dirF: files) {
				if(!".metadata".equals(dirF.getName())){
					jreNameChange(dirF);
//						System.out.println("����Ŀ¼");
				}
			}
		}
		
	}
	
	public static void lineFeed(){
		File f = new File("./src/S7Recursion/lineFeedTest.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			String s = "abc\rdef\nghi\r\njkl\n\rmno\r\n\r\nxyz";
			bw.write(s);
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String brStr = "";
			String bwStr = "";
//			�ܽ����readLine����\r���ȿ�������û��\n���еĻ��ͼ�������\n����
//			����ȶ���\n����ֱ�ӻ�������\r���ȡ�ַ����ͻ���Ϊ��ȡ���У���ΧlengthΪ0���ַ���
//			�ܽ�readLine��3����, \r\n, \n, \r, ÿ����ȡ��������һ���յ��ַ���, ��Ҫ����û��\n���еĻ�һ�оͶ���\n��û�еĻ�����\r
			
//			������Ҳ��ֱ��Ϊʲôû��writeLine�������
			
			while((brStr=br.readLine())!=null){
				System.out.println(brStr);
				bwStr += brStr;
//				System.out.println(bwStr);
				System.out.println(brStr.length());
			}
			System.out.print(bwStr);
//			String test = "\r";
//			System.out.println(test.length());
			String test = "22\b11";
			System.out.println(test);
			
			
//			String all = "abc\rdef\nghi\r\njkl\n\rmno";
//			System.out.println(all);
//			String test = "adsfadf";
//			test += "\r";
//			test += "zzzz";
//			System.out.print(test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void testStringSub(){
		double a = 111.111;
		String sa = "00000"+a + "00000";
		int index = sa.indexOf('.');
		sa = sa.substring(index-5, index+5);
		System.out.println(sa);
		
	}
	public static void main(String[] args) {
//		jreNameChange(new File("E:\\java\\javase\\ZRZYJava\\workspace"));
		lineFeed();
//		testStringSub();
	}
}
