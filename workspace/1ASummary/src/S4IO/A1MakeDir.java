package S4IO;

import java.io.File;
import java.io.IOException;

public class A1MakeDir {
	public void makeDir(String path) throws IOException{
		File f= new File(path);
		if(!f.exists()){
			f.mkdir();
		}
//		���½�Ŀ¼�´����ļ�
		File f1 = new File(path + File.separator +"1.txt");
		File f2 = new File(path + File.separator +"2.txt");
		File f3 = new File(path + File.separator +"3.txt");
		File f4 = new File(path + File.separator +"4.txt");
		File f5 = new File(path + File.separator +"5.txt");
		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		f4.createNewFile();
		f5.createNewFile();
	}
	
	public static void main(String[] args) {
//		�Ͽ�
		File [] fa = File.listRoots();
		for (File f: fa) {
			System.out.println(f);
		}
		
		A1MakeDir A1 = new A1MakeDir();
		try {
			A1.makeDir("D:\\����Ŀ¼\\����1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		�ļ���ȡ
	}
}
