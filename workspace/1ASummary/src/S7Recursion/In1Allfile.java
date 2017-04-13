package S7Recursion;

import java.io.File;

public class In1Allfile {
	
	public static void getFiles(File f){
		if(f.isFile()){
			String filePath = f.getPath();
			int index = filePath.lastIndexOf('\\');
			String dirName = filePath.substring(0, index);
			String fileName = filePath.substring(index+1);
			System.out.println(dirName+"  :  " + fileName);
			
		}else {
			File [] files = f.listFiles();
			for (File dirF: files ) {
				getFiles(dirF);
			}
		}
	}
	
	public static void main(String[] args) {
		getFiles(new File("D:\\Program Files (x86)"));
	}
	
}
