package zh0307;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaSwing {
  public static void main(String[] args){
	  Frame w = new Frame();
	  w.setSize(1920,1080);
	  w.setBackground(new Color(0x000000));
//	  w.setBackground(new Color(0,0,0));
	  MyPanel mp = new MyPanel();
	  w.add(mp);
	  w.setVisible(true);
	  //
	  w.addWindowListener
	  (
		new WindowAdapter(){
        public void windowClosing(WindowEvent e){
        System.exit(0);
              }
          }
	  );
  }
}
class MyPanel extends Panel{
	public void paint(Graphics g){
		for(int i=0;i<400;i++){
		g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
		g.setFont(new Font("*",0,(int)(Math.random()*80)+20));
		g.drawString("*", (int)(Math.random()*1920),(int)(Math.random()*1080));
		}
	}
	
}