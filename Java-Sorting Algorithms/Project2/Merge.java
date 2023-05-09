package Project2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
public class Merge implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton home,youtube,tcom,pg;
    Merge()
{
f=new JFrame("Merge Sort  ");
title=new JLabel("Merge Sort ");
title.setFont(new Font("Arial Black", Font.PLAIN, 25));
title.setSize(300,50);
title.setLocation(150,2);
title.setForeground(Color.white);
f.add(title);
      
home=new JButton("Home");
home.setSize(120,60);
   home.setLocation(60,100);
   home.setBackground(Color.WHITE);
home.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
home.addActionListener(this);
f.add(home);
youtube=new JButton("Youtube");
youtube.setSize(120,60);
   youtube.setLocation(250,100);
   youtube.setBackground(Color.red);
youtube.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
youtube.addActionListener(this);
f.add(youtube);
tcom=new JButton("Time Complexity");
tcom.setSize(120,60);
tcom.setLocation(60,200);
tcom.setBackground(Color.GREEN);
tcom.setFont(new Font("Bauhaus 93",Font.PLAIN,11));
tcom.addActionListener(this);
f.add(tcom);
pg=new  JButton("Program");
pg.setSize(120,60);
pg.setLocation(250,200);
pg.setBackground(Color.cyan);
pg.setFont(new Font("Bauhaus 93",Font.PLAIN,20));
pg.addActionListener(this);
f.add(pg);
ImageIcon icon=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\sort.jpeg");
f.add(new JLabel(icon));
f.pack();
f.setSize(500,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e) 
{
if(e.getSource()==home)
{
new Project();
}
else if(e.getSource()==youtube)
{

       openWebPage("https://youtu.be/dENca26N6V4");
}
else if(e.getSource()==pg)
{
new p3();
}
else if(e.getSource()==tcom)
{
new t3();
}
}
private void openWebPage(String url) {
try
{
java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
  }
  catch (java.io.IOException e) {
      System.out.println(e.getMessage());
  }
}
}