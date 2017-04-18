package S12ThreadNet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.sun.imageio.spi.OutputStreamImageOutputStreamSpi;

public class In1Server {
	public static void main(String[] args) {
		try {
			ServerSocket svst = new ServerSocket(6666);
			final Socket accept = svst.accept();
			final Scanner sc = new Scanner(System.in);
			new Thread(){
				public void run(){
					String readInfo;
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
						while(true){
							readInfo = br.readLine();
							System.out.println("¿Í»§Ëµ£º" + readInfo);
							if (readInfo.equals("88")){
								return;
							}
						}
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}.start();
			
			new Thread(){
				
				public void run(){
					String inputMessage;
					try {
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
						while(true){
							inputMessage = sc.nextLine();
							bw.write(inputMessage+"\n");
							bw.flush();
							if(inputMessage.equals("88")){
								return;
							}
						}
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}.start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
