package o20170309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class In1ServerThread {
	private static BufferedReader br = null;
	private static PrintWriter pw = null;
	private static ServerSocket ss;
	private static Socket s;
	static Scanner input = new Scanner(System.in);

	public In1ServerThread(){
		try {
			ss = new ServerSocket(5500);
			System.out.println("服务器启动");
			// 阻塞方法，等待接收到客户端的请求
			s = ss.accept();
			System.out.println(s.getRemoteSocketAddress() + "链接服务成功");
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void  readInfo(){
		while(true){
			try {
				
				System.out.println("客户端：" + br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void  writeInfo(){
		String s = "";
		while(true){
			// 服务端键盘输入
			s = input.next();
			// 服务端发送
			pw.print(s);
			// 清空缓冲区
			pw.flush();
			// 打印出来
			System.out.println(s + ":服务端");
		}
	}
	
	// 写两个线程一个收一个发
	public static void main(String[] args) {
		In1ServerThread ss = new In1ServerThread();
		Thread send = new Thread(ss);
		
		
	}
	
}
