package o20170307Event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class A1Event {
	private JFrame fra = new JFrame();
	private JButton greenButton = new JButton("�����");
	private JLabel label = new JLabel("�ƶ����");
	
	public A1Event(){
		fra.setLayout(new BorderLayout());
		fra.setSize(400, 300);
		fra.setLocation(400, 400);
		Container con = fra.getContentPane();
		con.add(label);
		
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fra.setVisible(true);
		fra.addMouseMotionListener(new MyMouse());
		
	}
	
	class MyMouse implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			//JOptionPane.showMessageDialog(null, "�������ƶ����", "�ƶ�", 2);
			label.setText("��굱ǰλ���ǣ�x:" + e.getX() + ", y:" + e.getY());
			//fra.setLocation(400+500, 400+400);
		}
		
	}
	
	public static void main(String[] args) {
		A1Event e = new A1Event();
		
	}
	
	
	
}