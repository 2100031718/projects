package Project2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class p2 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
p2()
{
f=new JFrame("Shell Sort Program ");
title=new JLabel(" Shell Sort Program");
title.setFont(new Font("Arial", Font.PLAIN, 25));
title.setSize(300,50);
title.setLocation(300,5);
f.add(title);
h=new JButton("HOME");
h.setSize(120,60);
   h.setLocation(60,600);
   h.setBackground(Color.WHITE);
h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
h.addActionListener(this);
f.add(h);
back=new JButton("Back");
   back.setSize(120,60);
   back.setLocation(60,690);
   back.setBackground(Color.PINK);
back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
back.addActionListener(this);
f.add(back);
t=new JTextArea("\n\n\n\n\t\t\t\t#include<stdio.h>\r\n"
+ "\t\t\t\tvoid shell_sort(int q[],int n)\r\n"
+ "\t\t\t\t{\r\n"
+ "    \t\t\t\tint gap,i,j,t;\r\n"
+ "    \t\t\t\tfor(gap=n/2;gap>=1;gap=gap/2)\r\n"
+ "    \t\t\t\t{\r\n"
+ "        \t\t\t\tfor(i=gap;i<n;i++)\r\n"
+ "        \t\t\t\t{\r\n"
+ "            \t\t\t\tfor(j=i;j>=gap;j=j-gap)\r\n"
+ "            \t\t\t\t{\r\n"
+ "                \t\t\t\tif(q[j-gap]>q[j])\r\n"
+ "                \t\t\t\t{\r\n"
+ "                    \t\t\t\tt=q[j];\r\n"
+ "                    \t\t\t\tq[j]=q[j-gap];\r\n"
+ "                   \t\t\t\t q[j-gap]=t;\r\n"
+ "                \t\t\t\t}\r\n"
+ "            \t\t\t\t}\r\n"
+ "        \t\t\t\t}\r\n"
+ "    \t\t\t\t}\r\n"
+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
+ "    \t\t\t\t{\r\n"
+ "        \t\t\t\tprintf(\"%d \",q[i]);\r\n"
+ "    \t\t\t\t}\r\n"
+ "\t\t\t\t}\r\n"
+ "\t\t\t\tint main()\r\n"
+ "\t\t\t\t{\r\n"
+ "    \t\t\t\tint n;\r\n"
+ "    \t\t\t\tscanf(\"%d\",&n);\r\n"
+ "    \t\t\t\tint a[n];\r\n"
+ "    \t\t\t\tfor(int i=0;i<n;i++)\r\n"
+ "    \t\t\t\tscanf(\"%d\",&a[i]);\r\n"
+ "    \t\t\t\tshell_sort(a,n);\r\n"
+ "\t\t\t\t}\r\n"
+ "\t\t\t\t\r\n"
+ "");
f.add(t);
t.setBackground(Color.cyan);
f.setSize(800,800);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==h)
{
new Project();
}
if(e.getSource()==back)
{
new Insertion();
}
}
}