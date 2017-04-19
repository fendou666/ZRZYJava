package S12ThreadNet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class In2Server {
	public static void main(String[] args) {
		try {
			ServerSocket svst = new ServerSocket(9999);
			while(true){
				Socket accept = svst.accept();
				new ReadInfo(accept, "客户说:").start();
				new WriteInfo(accept).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}



class ReadInfo extends Thread{
	private final Socket accept;
	private String massage;
	private String positon;
	public ReadInfo(Socket accept, String positon){
		this.accept = accept;
		this.positon = positon;
		System.out.println("当前客户线程名称：" + Thread.currentThread().getName());
	}
	
	public void run(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
			while(true){
				massage = br.readLine();
				System.out.println(positon + massage);
				if (massage.equals("88")){
					return;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class WriteInfo extends Thread{
	private Socket accept;
	private String massage;
	
	public WriteInfo(Socket accept){
		this.accept = accept;
	}
	
	public void run(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
			while(true){
				massage = br.readLine();
				bw.write(massage+"\n");
				bw.flush();
				if(massage.equals("88")){
					return;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

