package S12ThreadNet;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class In2Client {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("127.0.0.1", 9999);
			new ReadInfo(client, "·þÎñÆ÷Ëµ£º").start();
			new WriteInfo(client).start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
