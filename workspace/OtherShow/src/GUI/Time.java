package GUI;

/**
 * 
 * auther ţ���� 20170327
 * 
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;


public class Time extends JFrame implements Runnable{
   Thread clock;   
    
   public Time(){
       super("����ʱ��");  //���ø��๹�캯��  
       setFont(new Font("Times New Roman",Font.BOLD,60));  //����ʱ�ӵ���ʾ����
       start(); //��ʼ����
       setSize(280,100);  //���ô��ڳߴ�
       setVisible(true);  //���ڿ���
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�رմ���ʱ�˳�����
   }
    
   public void start(){ //��ʼ����
       if (clock==null){ //�������Ϊ��ֵ
           clock=new Thread(this); //ʵ��������
           clock.start(); //��ʼ����
       }
   }
    
   public void run(){  //���н���
       while (clock!=null){ 
           repaint(); //����paint�����ػ����
           try{
               Thread.sleep(1000);  //�߳���ͣһ��(1000����)
           }
           catch (Exception e){
               e.printStackTrace();  
           }
       }   
   }
    
   public void stop(){  //ֹͣ����
       clock=null;
   }
    
   public void paint(Graphics g){  //���������paint����
       Graphics2D g2=(Graphics2D)g;  //�õ�Graphics2D����,Graphics2D ����չ Graphics �࣬���ṩ�Լ�����״������ת������ɫ������ı����ָ�Ϊ���ӵĿ��ơ����������� Java(tm) ƽ̨�ϳ��ֶ�ά��״���ı���ͼ��Ļ�����
       Calendar now=new GregorianCalendar(); //ʵ������������Ĭ��ʱ����ʹ�õ�ǰʱ��
       String timeInfo=""; //�����Ϣ
       int hour=now.get(Calendar.HOUR_OF_DAY); //�õ�Сʱ��
       int minute=now.get(Calendar.MINUTE);   //�õ�����
       int second=now.get(Calendar.SECOND);  //�õ�����
        
       if (hour<=9) 
           timeInfo+="0"+hour+":"; //��ʽ�����  ��λ��ǰ��0
       else
           timeInfo+=hour+":";
       if (minute<=9)
           timeInfo+="0"+minute+":";
       else
           timeInfo+=minute+":";
       if (second<=9)
           timeInfo+="0"+second;
       else
           timeInfo+=second;

       g.setColor(Color.yellow);  //���õ�ǰ��ɫΪ��ɫ
       Dimension dim=getSize();  //�õ����ڳߴ�
       g.fillRect(0,0,dim.width,dim.height);  //��䱳��ɫΪ��ɫ
       g.setColor(Color.red);  //���õ�ǰ��ɫΪ��ɫ
       g.drawString(timeInfo,30,80);  //��ʾʱ���ַ���
   }

   public static void main(String[] args){
       new Time();
   }
}

	
	
	
	
	
	
	
	
	
	
	
	
	

