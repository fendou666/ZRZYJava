package o20170306GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class In1Login {
	private JLabel imgLabel;
	
	
	
	public void getImg(){
		String img = "d:\\test.jpg";
		Icon imgIcon = new ImageIcon(img);
		this.imgLabel = new JLabel(imgIcon);
		Dimension size = new Dimension();
		imgLabel.setSize(size);
		
	}
	
	
	public static void main(String[] args) {
		In1Login log = new In1Login();
		
		
		JFrame fra = new JFrame("qq��½");
		// ֻ����������������Ԫ�ض�λ����Ч��
		fra.setLayout(null);
		
		fra.setSize(500, 300);
		fra.setLocation(400, 300);
		
		// ���ñ���ɫ
//		Container con = fra.getContentPane();
//		con.setBackground(Color.BLACK);
//		Dimension test = con.getSize();
//		System.out.println(test);
		
		
		//��½Ԫ��
		JLabel userName = new JLabel("�û�����");
		JTextField nameFiled = new JTextField();
		JLabel pwd = new JLabel("���룺");
		JTextField pwdFiled = new JTextField();
		JButton loginB = new JButton("��½");
		JButton resetB = new JButton("����");
		
		userName.setBounds(50, 50, 150, 40);
		nameFiled.setBounds(150, 50, 300, 40);
		pwd.setBounds(50, 100, 150, 40);
		pwdFiled.setBounds(150, 100, 300, 40);
		loginB.setBounds(100, 150, 120, 30);
		resetB.setBounds(250, 150, 120, 30);
		
		Font f = new Font("������", Font.BOLD, 20);
		userName.setFont(f);
		pwd.setFont(f);
		loginB.setFont(f);
		resetB.setFont(f);
		
		userName.setForeground(Color.red);
		// û��
		userName.setBackground(Color.green);
		
		log.getImg();
		fra.add(log.imgLabel);
		fra.add(userName);
		fra.add(nameFiled);
		fra.add(pwd);
		fra.add(pwdFiled);
		fra.add(loginB);
		fra.add(resetB);
		
		fra.setVisible(true);
		
	}
	
	
}