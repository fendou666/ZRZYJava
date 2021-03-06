package o20170309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class In1Server {
	private static BufferedReader br = null;
	private static PrintWriter pw = null;
	private static ServerSocket ss;
	private static Socket s;
	static Scanner input = new Scanner(System.in);

	public In1Server(){
		
	}
	
	public static void main(String[] args) {
		String sendInfo = "";
		try {
			ss = new ServerSocket(5500);
			System.out.println("服务器启动");
			// 阻塞方法，等待接收到客户端的请求
			s = ss.accept();
			System.out.println(s.getRemoteSocketAddress() + "链接服务成功");
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true) {
				System.out.println("等待客户端输入");
				System.out.println("客户端：" + br.readLine());
				sendInfo = input.next();
				pw.println(sendInfo);
				pw.flush();
				System.out.println(sendInfo+": 服务端");
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
