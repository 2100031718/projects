package Project2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Project implements ActionListener
{
  JFrame f;
JLabel title;
JButton in,qu,me,sh,bu;     
Project()
{
f=new JFrame("Sorting Techinques");
title=new JLabel("Sorting Techinques");
title.setFont(new Font("Arial", Font.PLAIN, 25));
title.setSize(600,50);
title.setLocation(620,380);
f.add(title);
in=new JButton("Insertion Sort");
in.setSize(520,126);
in.setLocation(0,50);
in.setBackground(Color.RED);
in.setFont(new Font("Arial", Font.PLAIN, 30));
in.addActionListener(this);
f.add(in);
qu=new JButton("Quick Sort");
qu.setSize(520,126);
qu.setLocation(0,200);
qu.setBackground(Color.WHITE);
qu.setFont(new Font("Arial", Font.PLAIN, 30));
qu.addActionListener(this);
f.add(qu);
me=new JButton("Merge Sort");
me.setSize(520,126);
me.setLocation(0, 350);
me.setBackground(Color.YELLOW);
me.setFont(new Font("Arial", Font.PLAIN, 30));
me.addActionListener(this);
f.add(me);
sh=new JButton("Shell Sort");
sh.setSize(520,126);
sh.setLocation(0,500);
sh.setBackground(Color.GREEN);
sh.setFont(new Font("Arial", Font.PLAIN, 30));
sh.addActionListener(this);
f.add(sh);
bu=new JButton("Bubble Sort");
bu.setSize(520,126);
bu.setLocation(0,650);
bu.setBackground(Color.PINK);
bu.setFont(new Font("Arial", Font.PLAIN, 30));
bu.addActionListener(this);
f.add(bu);
ImageIcon icon=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\Sorting.png");
f.add(new JLabel(icon));
f.pack();
f.setSize(1920,1080);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e) 
{
if(e.getSource()==in)
{
new Insertion();
}
else if(e.getSource()==qu)
{
new Quick();
}
else if(e.getSource()==sh)
{
new Shell();
}
else if(e.getSource()==me)
{
new Merge();
}
else if(e.getSource()==bu)
{
new Bubble();
}
}
public static void main(String args[])
{
new Project();
}
}