package o20170309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class In2ServerThread extends Thread {
	private Socket  s;
	private BufferedReader br;
	private PrintWriter pw;
	private String sendInfo;
	private Scanner input = new Scanner(System.in);
	
	public In2ServerThread(Socket s){
		this.s = s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true){
			try {
				
				System.out.println(Thread.currentThread().getName() +" : " + br.readLine());
				sendInfo = (input.nextLine()).trim();
				pw.println(sendInfo);
				pw.flush();
				System.out.println("����ˣ�����"+ sendInfo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
	
}
