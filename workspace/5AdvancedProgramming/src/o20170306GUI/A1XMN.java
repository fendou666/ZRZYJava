package o20170306GUI;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class A1XMN {
	private static JLabel l;
	static JFrame frame=new JFrame("������");
	public A1XMN(JLabel l){
		frame.setSize(580, 700);
		frame.setLocation(400,200);
		this.l=l;
		frame.add(l);
		frame.setVisible(true);
	}
	public void setImage(String img){
		Icon icon=new ImageIcon(img);
		l.setIcon(icon);
	}
	public static void main(String[] args){
		JTextField test=new JTextField();
		JButton button=new JButton("�� ��");
		test.setBounds(100, 550, 290, 40);
		button.setBounds(420, 550, 80, 40);
		test.setFont(new Font("����",Font.BOLD,16));
		button.setFont(new Font("����",Font.BOLD,16));
		Container cont=frame.getContentPane();
		cont.setBackground(Color.cyan);
		frame.add(test);
		frame.add(button);
		JLabel jb=new JLabel();
		A1XMN c=new A1XMN(jb);
		c.setImage("e:\\����.jpg");
		
	}
	
}
