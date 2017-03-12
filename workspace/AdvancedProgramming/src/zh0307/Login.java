package zh0307;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Login {
//attribute
  private JFrame frame;
  private ImageIcon icon;
  private ImageIcon ico;
  private JPanel panel;
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private JLabel label4;
  private JCheckBox check1;
  private JCheckBox check2;
  private JButton button;
//  private JCheckBox box;
  private JTextField field;
  private JPasswordField psw;
//constructor
  public Login(){
	  init();
  }
//main
  public static void main(String[] args) {
	Login go = new Login();
}
//init
  public void init(){
	  frame = new JFrame(); 
	  Container cont = frame.getContentPane();
	  Font f1 = new Font("����",Font.BOLD,13);
	  Font f2 = new Font("����",Font.BOLD,12);
	  Font f3 = new Font("����",Font.BOLD,12);
	  frame.setTitle("QQ��¼����");
	  frame.setSize(436,370);
	  frame.setLocation(500,320);
	  frame.setBackground(new Color(0,0,0));
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  //top
	  String img = "src/zh0307/timg.jpg";
	  String imge = "src/zh0307/45745ukjtf.jpg";
	  
	  //img1
	  icon = new ImageIcon(img);
	  label1 = new JLabel();
	  label1.setSize(430,180);
	  label1.setIcon(icon);
	  //img2
	  ico = new ImageIcon(imge);
	  label2 = new JLabel();
	  label2.setIcon(ico);
	  label2.setBounds(40,18, 80, 90);
	  
	  //user
//	  String[] user = {"25171836","18245961224","25171836@qq.com"};
//	  JComboBox<String> box= new JComboBox<String>(user);
//	  box.setEditable(true);
//	  box.addItem("917524242");
//	  box.setSelectedItem("25171836@qq.com");
//	  box.setBounds(130, 20,195,30);
	  //user2
	  field = new JTextField("251718536@qq.com");
	  field.setBounds(130, 20,195,30);
	  //psw
	  psw = new JPasswordField();
	  psw.setBounds(130,52,195,30);
	  //��ס�������Զ���¼����ѡ��
	  check1 = new JCheckBox("��ס����");
	  check1.setFont(f2);
	  check1.setBounds(130,85,80,20);
	  check2 = new JCheckBox("�Զ���¼");
	  check2.setFont(f2);
	  check2.setBounds(250,85,80,20);
	  //ע���˺����һ�����
	  label3 = new JLabel("ע���˺�");
	  label3.setFont(f3);
	  label3.setForeground(new Color(70,130,200));
	  label3.setBounds(340,20,60,30);
	  label4 = new JLabel("�һ�����");
	  label4.setFont(f3);
	  label4.setForeground(new Color(70,130,200));
	  label4.setBounds(340,55,60,30);
	  //button login
	  button = new JButton("��  ¼");
	  button.setFont(f1);
	  button.setForeground(new Color(250,255,255));
	  button.setBackground(new Color(8,163,219));
	  button.setBounds(132,110,190,28);
	  //state
	  JPopupMenu p = new JPopupMenu();
	  JMenuItem on = new JMenuItem("����");
	  JMenuItem off = new JMenuItem("����");
	  JMenuItem busy = new JMenuItem("æµ");
	  JMenuItem invisible = new JMenuItem("����");
	  JMenuItem no = new JMenuItem("�����");
	  on.setFont(f2);
	  off.setFont(f2);
	  busy.setFont(f2);
	  invisible.setFont(f2);
	  no.setFont(f2);
	  p.add(on);
	  p.add(off);
	  p.add(busy);
	  p.add(invisible);
	  p.add(no);
	  //down
	  panel = new JPanel();
	  panel.setSize(430,180);
	  panel.setBackground(new Color(235,242,250));
	  panel.setLayout(null);
	  panel.add(label2);
//	  panel.add(box);
	  panel.add(field);
	  panel.add(psw);
	  panel.add(label3);
	  panel.add(label4);
	  panel.add(check1);
	  panel.add(check2);
	  panel.add(button);
	  //add
	  frame.setLayout(new BorderLayout());
	  frame.add(label1,BorderLayout.NORTH);
	  frame.add(panel,BorderLayout.CENTER);
	  //
	  frame.setResizable(false);
	  frame.setVisible(true);
	  //ע�����������
//	  box.addActionListener(new MyAction());
	  field.addActionListener(new MyAction());
	  psw.addActionListener(new MyAction());
	  button.addActionListener(new MyAction());
	  
//	  label2.addMouseListener(new MouseAdapter()
//	  {
//		  public void mouseReleased(MouseEvent event){
//			  if(event.isPopupTrigger())
//			  p.show(event.getComponent(),event.getX(),event.getY());
//		 }
//	  		}
//			  );
  }
//event  
  
  //
  class MyAction implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(name.equals("��  ¼") && field.getText()!=null && psw.getText().equals("123456")){
			JOptionPane.showMessageDialog(null,field.getText()+"��¼�ɹ�","TRUE",-1);
			frame.dispose();
			System.exit(0);
		}else{
			JOptionPane.showMessageDialog(null,"��¼ʧ��","FALSE",2);
		}
		
//		System.out.println(" ");
	}
  }
}
