package o20170307Event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.Border;

/**
 * 
 * ֪ʶ����
 * Java ImageIcon ������ʾ���� http://blog.sina.com.cn/s/blog_6d6483b90100m6qz.html
 * 
 * @author Administrator
 *
 */


public class A2QQLoginNew extends JFrame {
	private JPanel mainNoth = new JPanel();
	private JPanel mainSouth = new JPanel();
	private JPanel mainWeast = new JPanel();
	private JPanel mainCenter = new JPanel();
	private JPanel regBTM = new JPanel();
	private Container con = getContentPane();
	
	private Icon nothIcon = new ImageIcon("src/o20170307Event/noth.png");
	private JLabel noth = new JLabel();
	private Icon weastIcon = new ImageIcon("src/o20170307Event/weast.jpg");
	private JLabel weast = new JLabel();
	
	private JComboBox userName = new JComboBox();
	private JPasswordField passWord = new JPasswordField();
	
	private JLabel regist = new JLabel("���ע��");
	private JLabel retrievePwd = new JLabel("�һ����� ");
	
	private JComboBox status = new JComboBox();
	private JCheckBox remberPwd = new JCheckBox("��ס����");
	private JCheckBox autoLogin = new JCheckBox("�Զ���¼");
	
	private JButton moreAccount = new JButton(">���˺�");
	private JButton set = new JButton("����");
	private JButton login = new JButton("��¼");
	
	public void initElement(){
		// ����
		noth.setIcon(nothIcon);
		mainNoth.add(noth);
		// ����
		mainSouth.add(moreAccount, BorderLayout.WEST);
		mainSouth.add(set, BorderLayout.WEST);
		mainSouth.add(login, BorderLayout.EAST);
		// ���
		weast.setIcon(weastIcon);
		mainWeast.setBackground(Color.white);
		mainWeast.add(weast);
		// �м� ����3����
		mainCenter.setLayout(new GridLayout(3,2,20,10));
		mainCenter.setBackground(Color.white);
		userName.addItem("123456789");
		userName.addItem("666666666");
		userName.addItem("888888888");
		status.addItem("����");
		status.addItem("����");
		status.addItem("����");
		
		regBTM.setLayout(new GridLayout(1,3,20,10));
		regBTM.add(status);
		regBTM.add(remberPwd);
		regBTM.add(autoLogin);
		
		mainCenter.add(userName);
		mainCenter.add(regist);
		mainCenter.add(passWord);
		mainCenter.add(retrievePwd);
		mainCenter.add(regBTM);

		
		login.addActionListener(new loginEvent());
		
	}
	
	public A2QQLoginNew(){
		setSize(430, 330);
		setLocation(400, 400);
		initElement();
		con.add(mainNoth, BorderLayout.NORTH);
		con.add(mainSouth, BorderLayout.SOUTH);
		con.add(mainWeast, BorderLayout.WEST);
		con.add(mainCenter, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	class loginEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "123456789�ڵ�½", "qq��½", 2);
		}
		
	}
	
	
	public static void main(String[] args) {
		A2QQLoginNew qq = new A2QQLoginNew();
		
	}

}