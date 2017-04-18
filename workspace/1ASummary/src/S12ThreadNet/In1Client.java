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


public class In1Client {
	public static void main(String[] args) {
		try {
			final Socket client = new Socket("127.0.0.1", 6666);
			new Thread(new ReadMassenge(client, "·þÎñÆ÷Ëµ£º")).start();
			new Thread(new WriteMessage(client)).start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ReadMassenge implements Runnable{
	private Socket accept;
	private String name;
	
	public ReadMassenge(Socket accept, String name){
		this.accept = accept;
		this.name = name;
	}
	
	@Override
	public void run() {
		String message;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
			while(true){
				message = br.readLine();
				System.out.println(name + message);
				if(message.equals("88")){
					br.close();
					return;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class WriteMessage implements Runnable {
	Socket accept;
	
	public WriteMessage(Socket accept){
		this.accept = accept;
	}

	@Override
	public void run() {
		String message;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
			while(true){
				message = br.readLine();
				bw.write(message+"\n");
				bw.flush();
				if(bw.equals("88")){
					br.close();
					return;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}


