package o20170306GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class In1LoginConstract extends JFrame {
	private JLabel label = new JLabel();
	
	public In1LoginConstract() {
		setLayout(new BorderLayout());
		setSize(400, 600);
		setLocation(500, 500);
		
		
	}
	
	public void addImage(JLabel label){
		this.label = label;
		add(label);
	}
	
	public static void main(String[] args) {
		
		In1LoginConstract test = new In1LoginConstract();
		
		Container con = test.getContentPane();
		
		
		
		JLabel userName = new JLabel("用户名：");
		JTextField nameFiled = new JTextField();
		JLabel pwd = new JLabel("密码：");
		JTextField pwdFiled = new JTextField();
		JButton loginB = new JButton("登陆");
		JButton resetB = new JButton("重置");
		
		userName.setBounds(50, 50, 150, 40);
		nameFiled.setBounds(150, 50, 300, 40);
		pwd.setBounds(50, 100, 150, 40);
		pwdFiled.setBounds(150, 100, 300, 40);
		loginB.setBounds(100, 150, 120, 30);
		resetB.setBounds(250, 150, 120, 30);
		
		Font f = new Font("新宋体", Font.BOLD, 20);
		userName.setFont(f);
		pwd.setFont(f);
		loginB.setFont(f);
		resetB.setFont(f);
		
		userName.setForeground(Color.red);
		// 没用
		userName.setBackground(Color.green);
		
		con.add(userName);
		con.add(nameFiled);
		con.add(pwd);
		con.add(pwdFiled);
		con.add(loginB);
		con.add(resetB);
		
		JLabel l = new JLabel();
		Icon imgIco = new ImageIcon("d:\\test.jpg");
		l.setIcon(imgIco);
		test.addImage(l);
		
		test.setVisible(true);
	}
	
}
