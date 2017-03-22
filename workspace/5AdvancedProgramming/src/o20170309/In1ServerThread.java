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
			System.out.println("����������");
			// �����������ȴ����յ��ͻ��˵�����
			s = ss.accept();
			System.out.println(s.getRemoteSocketAddress() + "���ӷ���ɹ�");
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
				
				System.out.println("�ͻ��ˣ�" + br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void  writeInfo(){
		String s = "";
		while(true){
			// ����˼�������
			s = input.next();
			// ����˷���
			pw.print(s);
			// ��ջ�����
			pw.flush();
			// ��ӡ����
			System.out.println(s + ":�����");
		}
	}
	
	// д�����߳�һ����һ����
	public static void main(String[] args) {
		In1ServerThread ss = new In1ServerThread();
		Thread send = new Thread(ss);
		
		
	}
	
}