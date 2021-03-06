package o20170307Event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class In3RadioCheckBoxComboBox extends JFrame {
	private Container cont;
	private JPanel maxPanel = new JPanel();
	private JPanel radioPanel = new JPanel();
	private JPanel checkPanel = new JPanel();
	private JPanel comboxPanel = new JPanel();
	private JLabel downLabel = new JLabel("答案提示框");
	private ButtonGroup radioGroup = new ButtonGroup(); 
	private ButtonGroup checkGroup = new ButtonGroup(); 
	
	private JRadioButton radio1 = new JRadioButton("A: -1");
	private JRadioButton radio2 = new JRadioButton("B: 0");
	private JRadioButton radio3 = new JRadioButton("C: 1");
	private JRadioButton radio4 = new JRadioButton("D: 2");
	
	private JCheckBox check1 = new JCheckBox("A: -1");
	private JCheckBox check2 = new JCheckBox("B: 0");
	private JCheckBox check3 = new JCheckBox("C: 1");
	private JCheckBox check4 = new JCheckBox("D: 2");
	
	private JComboBox comGroup = new JComboBox();

	public In3RadioCheckBoxComboBox() {
		setSize(400, 300);
		setLocation(300, 400);
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		maxPanel.setLayout(new GridLayout(3,1));
		
		radioPanel.setBorder(BorderFactory.createTitledBorder("1+1=?"));
		radioPanel.setLayout(new GridLayout(1,4));
		radio1.addActionListener(new ButtonAction());
		radio2.addActionListener(new ButtonAction());
		radio3.addActionListener(new ButtonAction());
		radio4.addActionListener(new ButtonAction());
		
		radioGroup.add(radio1);
		radioGroup.add(radio2);
		radioGroup.add(radio3);
		radioGroup.add(radio4);
		radioPanel.add(radio1);
		radioPanel.add(radio2);
		radioPanel.add(radio3);
		radioPanel.add(radio4);
		maxPanel.add(radioPanel);
		
		checkPanel.setBorder(BorderFactory.createTitledBorder("1+1=?"));
		checkPanel.setLayout(new GridLayout(1,4));
		check1.addItemListener(new checkAction());
		check2.addItemListener(new checkAction());
		check3.addItemListener(new checkAction());
		check4.addItemListener(new checkAction());
		
		checkGroup.add(check1);
		checkGroup.add(check2);
		checkGroup.add(check3);
		checkGroup.add(check4);
		checkPanel.add(check1);
		checkPanel.add(check2);
		checkPanel.add(check3);
		checkPanel.add(check4);
		maxPanel.add(checkPanel);
		
		comboxPanel.setBorder(BorderFactory.createTitledBorder("1+1=?"));
		comGroup.addItem("A: -1");
		comGroup.addItem("B: 0");
		comGroup.addItem("C: 1");
		comGroup.addItem("D: 2");
		comGroup.addItemListener(new comboAction());
		
		comboxPanel.add(comGroup);
		// 设置位置如何去做
		maxPanel.add(comboxPanel);
		
		cont.add(maxPanel, BorderLayout.NORTH);
		cont.add(downLabel, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	
	class ButtonAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == radio4) {
				downLabel.setForeground(Color.green);
				downLabel.setText("恭喜你回答正确");
			}else if(e.getSource() == radio1||
					e.getSource() == radio2||
					e.getSource() == radio3
					){
				
				downLabel.setForeground(Color.RED);
				downLabel.setText("回答错误");
			}
			
			
		}
		
	}
	
	class checkAction implements ItemListener {

			
		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if (e.getSource() == check4) {
				downLabel.setForeground(Color.green);
				downLabel.setText("恭喜你回答正确");
			}else if(e.getSource() == check1||
					e.getSource() == check2||
					e.getSource() == check3
					){
				
				downLabel.setForeground(Color.RED);
				downLabel.setText("回答错误");
			}
			
		}
		
	}
	
	
	class comboAction implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if (e.getSource() == check4) {
				downLabel.setForeground(Color.green);
				downLabel.setText("恭喜你回答正确");
			}else if(e.getSource() == check1||
					e.getSource() == check2||
					e.getSource() == check3
					){
				
				downLabel.setForeground(Color.RED);
				downLabel.setText("回答错误");
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		In3RadioCheckBoxComboBox select = new In3RadioCheckBoxComboBox();
	}
	
	
	
}
