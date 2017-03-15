package o20170306GUI;


import java.awt.*;
import java.applet.Applet;

public class InBorderLayoutTest extends Applet {
  public void init() {
    setLayout(new BorderLayout());
    add(new Button("North"), BorderLayout.NORTH);
    add(new Button("South"), BorderLayout.SOUTH);
    add(new Button("East"), BorderLayout.EAST);
    add(new Button("West"), BorderLayout.WEST);
    add(new Button("Center"), BorderLayout.CENTER);
  }
}
