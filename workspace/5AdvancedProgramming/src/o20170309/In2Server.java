package o20170309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class In2Server {
	private static BufferedReader br = null;
	private static PrintWriter pw = null;
	private static ServerSocket ss;
	private static Socket s;
	static Scanner input = new Scanner(System.in);

	public In2Server(){
		
	}
	
	public static void main(String[] args) {
		String sendInfo = "";
		try {
			ss = new ServerSocket(5500);
			System.out.println("服务器启动");
			while(true) {
				// 阻塞方法，等待接收到客户端的请求
				s = ss.accept();
				System.out.println(s.getRemoteSocketAddress() + "链接服务成功");
				(new In2ServerThread(s)).start();
			}
			
			
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
