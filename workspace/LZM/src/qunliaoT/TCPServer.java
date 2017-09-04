package qunliaoT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TCPServer extends Thread{
	Socket client;
	static int num = 0;
	String name;
	
	public TCPServer(Socket s,String name){
		this.client = s;
		this.name = name + ": ";
	}
	
	public void run(){
		try{
			//获取客户端输入流
			BufferedReader cin = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
			
			// 获取客户端输出流
			PrintStream cout = new PrintStream(this.client.getOutputStream());
			
			// 获取控制台输入流
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			
			String str = "";
			while((str = cin.readLine()) != null){
				for(Socket socket : MainServer.socketArray){
					PrintStream perout = new PrintStream(socket.getOutputStream());
					perout.println(this.name + str);
				}
			}
			
			cin.close();
			cout.close();
			sin.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
}
