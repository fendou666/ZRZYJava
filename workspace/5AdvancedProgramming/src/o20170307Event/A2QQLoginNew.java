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
	
	private JLabel regist = new JLabel("免费注册");
	private JLabel retrievePwd = new JLabel("找回密码 ");
	
	private JComboBox status = new JComboBox();
	private JCheckBox remberPwd = new JCheckBox("记住密码");
	private JCheckBox autoLogin = new JCheckBox("自动登录");
	
	private JButton moreAccount = new JButton(">多账号");
	private JButton set = new JButton("设置");
	private JButton login = new JButton("登录");
	
	public void initElement(){
		// 上面
		noth.setIcon(nothIcon);
		mainNoth.add(noth);
		// 下面
		mainSouth.add(moreAccount, BorderLayout.WEST);
		mainSouth.add(set, BorderLayout.WEST);
		mainSouth.add(login, BorderLayout.EAST);
		// 左边
		weast.setIcon(weastIcon);
		mainWeast.setBackground(Color.white);
		mainWeast.add(weast);
		// 中间 布局3行列
		mainCenter.setLayout(new GridLayout(3,2,20,10));
		mainCenter.setBackground(Color.white);
		userName.addItem("123456789");
		userName.addItem("666666666");
		userName.addItem("888888888");
		status.addItem("在线");
		status.addItem("隐身");
		status.addItem("离线");
		
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
			JOptionPane.showMessageDialog(null, "123456789在登陆", "qq登陆", 2);
		}
		
	}
	
	
	public static void main(String[] args) {
		A2QQLoginNew qq = new A2QQLoginNew();
		
	}

}
