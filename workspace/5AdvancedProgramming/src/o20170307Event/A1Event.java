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
	private JButton greenButton = new JButton("点击我");
	private JLabel label = new JLabel("移动鼠标");
	
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
			//JOptionPane.showMessageDialog(null, "您正在移动鼠标", "移动", 2);
			label.setText("鼠标当前位置是：x:" + e.getX() + ", y:" + e.getY());
			//fra.setLocation(400+500, 400+400);
		}
		
	}
	
	public static void main(String[] args) {
		A1Event e = new A1Event();
		
	}
	
	
	
}
