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
//						通过vim确认里面全是\n
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
//						System.out.println("进入目录");
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
//			总结出来readLine遇到\r，先看后面有没有\n，有的话就继续读到\n结束
//			如果先读到\n，则直接换行遇到\r后读取字符，就会认为读取空行，范围length为0的字符串
//			总结readLine的3中行, \r\n, \n, \r, 每个读取到都返回一个空的字符串, 主要看有没有\n，有的话一行就读到\n，没有的话读到\r
			
//			从这里也就直到为什么没有writeLine这个方法
			
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
