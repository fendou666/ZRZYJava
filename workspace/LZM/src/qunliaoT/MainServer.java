package qunliaoT;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainServer {
	public  static ArrayList<Socket> socketArray = new ArrayList<Socket>();
	private static int num = 1;
	
	public static Map<String, String> ipMap = new HashMap<String, String>();
	static{
		ipMap.put("/127.0.0.1", "������");
		ipMap.put("/175.3.13.2", "��ٻ");
		ipMap.put("/175.3.13.4", "���");
	}
	
	public void initMainServer(){
		ServerSocket server = null;
		Socket client = null;
		try {
			// 1.����ServerSocket���󣬲��󶨶˿�
			server = new ServerSocket(4700);
			System.out.println("�����������ɹ�");
			
			while(true){
				client = server.accept();
				SocketAddress s = client.getRemoteSocketAddress();
				InetAddress is = client.getInetAddress();
				String name = ipMap.get(is.toString());
				System.out.println(is + "���ӳɹ�");
				socketArray.add(client);
				
				TCPServer tcp = new TCPServer(client, name);
				tcp.start();
			}
			
		} catch (IOException e) {
			System.out.println("����������ʧ��");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MainServer ms = new MainServer();
		ms.initMainServer();
	}
	
}