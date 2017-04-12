package S5Recursion;

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
						sb.append(s+"\r");
					}
					br.close();
					if((i=sb.indexOf("/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.7"))!=-1){
						System.out.println("aaa");
						BufferedWriter bw = new BufferedWriter(new FileWriter(f));
						s = new String(sb);
						s = s.replaceAll("/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.7", "");
						bw.write(s);
						bw.flush();
						bw.close();
					}
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
//						System.out.println("½øÈëÄ¿Â¼");
				}
			}
		}
		
	}
	
	public static void lineFeed(){
		File f = new File("./src/S5Recursion/lineFeedTest.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			String s = "abc\rdef\nghi\r\njkl\n\rmno";
			bw.write(s);
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
//		jreNameChange(new File("E:\\java\\javase\\ZRZYJava\\workspace"));
		lineFeed();
	}
}
