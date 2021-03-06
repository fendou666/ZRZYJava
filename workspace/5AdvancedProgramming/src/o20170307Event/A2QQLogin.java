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
 * 知识查找
 * Java ImageIcon 不能显示问题 http://blog.sina.com.cn/s/blog_6d6483b90100m6qz.html
 * 
 * @author Administrator
 *
 */


public class A2QQLogin extends JFrame {
	private JPanel mainNoth = new JPanel();
	private JPanel mainSouth = new JPanel();
	private JPanel mainWeast = new JPanel();
	private JPanel mainEast = new JPanel();
	private JPanel mainCenter = new JPanel();
	private JPanel centerNoth = new JPanel();
	private JPanel centerSouth = new JPanel();
	
	private Container con = getContentPane();
	
	private Icon nothIcon = new ImageIcon("src/o20170307Event/noth.png");
	private JLabel noth = new JLabel();
	private Icon weastIcon = new ImageIcon("src/o20170307Event/weast.jpg");
	private JLabel weast = new JLabel();
//	private JLabel userNameL = new JLabel("用户名：");
	private JComboBox userName = new JComboBox();
//	private JLabel pwdL = new JLabel("密码：");
	private JPasswordField passWord = new JPasswordField();
	private JComboBox status = new JComboBox();
	private JCheckBox remberPwd = new JCheckBox("记住密码");
	private JCheckBox autoLogin = new JCheckBox("自动登录");
	private JLabel regist = new JLabel("免费注册   ");
	private JLabel retrievePwd = new JLabel("找回密码    ");
	private JButton moreAccount = new JButton(">多账号");
	private JButton set = new JButton("设置");
	private JButton login = new JButton("登录");
	
	public void initElement(){
		
		noth.setIcon(nothIcon);
		mainNoth.add(noth);
		mainSouth.add(moreAccount, BorderLayout.WEST);
//		mainSouth.add(set, BorderLayout.WEST);
//		mainSouth.add(login, BorderLayout.EAST);
		mainSouth.add(set, BorderLayout.WEST);
		mainSouth.add(login, BorderLayout.EAST);
		weast.setIcon(weastIcon);
		mainWeast.setBackground(Color.white);
		mainWeast.add(weast);
		
		mainEast.setLayout(new GridLayout(4,1));
		mainEast.setBackground(Color.white);
//		mainEast.add(regist, BorderLayout.NORTH);
//		mainEast.add(retrievePwd, BorderLayout.NORTH);
		mainEast.add(regist);
		mainEast.add(retrievePwd);
		

		userName.addItem("123456789");
		userName.addItem("666666666");
		userName.addItem("888888888");
		status.addItem("在线");
		status.addItem("隐身");
		status.addItem("离线");
		
		centerNoth.setLayout(new GridLayout(2,2,20,10));
//		centerNoth.setLayout(new GridLayout(4,1));
//		centerNoth.add(userNameL);
		centerNoth.add(userName);
//		centerNoth.add(pwdL);
		centerNoth.add(passWord);
		centerSouth.setLayout(new GridLayout(1,3));
		centerSouth.add(status);
		centerSouth.add(remberPwd);
		centerSouth.add(autoLogin);
		mainCenter.setLayout(new GridLayout(2,1));
		mainCenter.add(centerNoth);
		mainCenter.add(centerSouth);

		
		login.addActionListener(new loginEvent());
		
		
		
	}
	
	public A2QQLogin(){
		setSize(430, 330);
		setLocation(400, 400);
		initElement();
//		add(noth, BorderLayout.NORTH);
//		add(weast, BorderLayout.WEST);
		con.add(mainNoth, BorderLayout.NORTH);
		con.add(mainSouth, BorderLayout.SOUTH);
		con.add(mainWeast, BorderLayout.WEST);
		con.add(mainEast, BorderLayout.EAST);
		con.add(mainCenter, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	class loginEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "123456789在登陆", "qq登陆", 2);
		}
		
	}
	
	
	public static void main(String[] args) {
		A2QQLogin qq = new A2QQLogin();
		
	}

}
