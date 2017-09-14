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
			
			//��ȡ�ͻ���������
			BufferedReader cin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// ��ȡ�ͻ��������
			PrintStream cout = new PrintStream(socket.getOutputStream());
			
			// ��ȡ����̨������
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
			System.out.println("����ʧ�ܣ�δ�ҵ�����");
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