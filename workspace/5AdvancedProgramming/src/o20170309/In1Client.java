package o20170309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class In1Client {
	private static BufferedReader br;
	private static PrintWriter pw;
	private static Socket cli;
 	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String sendInfo = "";
		String readInfo = "";
		try {
			cli = new Socket(InetAddress.getLocalHost(), 5500);
//			cli = new Socket("175.3.13.29", 5550);
			System.out.println("客户端创建链接");
			br = new BufferedReader(new InputStreamReader(cli.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(cli.getOutputStream()));
			
			while(true){
				sendInfo = input.next();
				pw.println(sendInfo);
				pw.flush();
				System.out.println(sendInfo + ":客户端");
				readInfo = br.readLine();
				System.out.println( "服务端:" + readInfo);
				if (readInfo.equals("exit")) {
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.close();
		
	}
	
}
