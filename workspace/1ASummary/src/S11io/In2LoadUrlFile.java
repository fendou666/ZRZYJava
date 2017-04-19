package S11io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class In2LoadUrlFile {
	
	public static void loadUrlFile(){
		try {
			URL jpgUrl = new URL("http://avatar.csdn.net/2/B/6/1_foart.jpg");
			URLConnection openConnection = jpgUrl.openConnection();
			openConnection.connect();
			InputStream ipts = openConnection.getInputStream();
			
			byte[] b = new byte[1024];
			int n = 0;
			BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("d://test.jpg")); 
			while((n=ipts.read(b))!=-1){
				bos.write(b, 0, n);
			}
			ipts.close();
			bos.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		loadUrlFile();
	}
}
