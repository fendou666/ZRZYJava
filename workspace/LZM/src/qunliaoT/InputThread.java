package qunliaoT;

import java.io.BufferedReader;
import java.io.IOException;

public class InputThread extends Thread{
	private BufferedReader br;
	
	public InputThread(BufferedReader br){
		this.br = br;
	}
	
	public void run(){
		String str = null;
		while(true){
			try {
				str = br.readLine();
				System.out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
