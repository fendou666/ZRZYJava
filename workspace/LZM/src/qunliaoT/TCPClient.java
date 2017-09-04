package qunliaoT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	
	public static void startTCP(){
		try {
			Socket socket = new Socket("127.0.0.1",4700);
			
			//获取客户端输入流
			BufferedReader cin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 获取客户端输出流
			PrintStream cout = new PrintStream(socket.getOutputStream());
			
			// 获取控制台输入流
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			InputThread input = new InputThread(cin);
			input.start();
			
			String str = "";
			while((str = sin.readLine()) != null){
				cout.println(str);
				cout.flush();
			}
			cin.close();
			cout.close();
			sin.close();
		} catch (UnknownHostException e) {
			System.out.println("连接失败，未找到主机");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		startTCP();
	}

}
