package Project2; 
import javax.swing.*;
import java .awt.*;
import java.awt.event.*;
class p0 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
p0()
{
f=new JFrame("Insertion Sort Program ");
title=new JLabel(" Insertion Sort Program");
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
t=new JTextArea("\n\n\n\t\t\t\t#include<stdio.h>\r\n"
+ "\t\t\t\tvoid insort(int *a,int n)\r\n"
+ "\t\t\t\t{\r\n"
+ "  \t\t\t\t  int i,j,key;\r\n"
+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
+ "    \t\t\t\t{\r\n"
+ "      \t\t\t\t  key=a[i];\r\n"
+ "        \t\t\t\tj=i-1;\r\n"
+ "        \t\t\t\twhile(j>=0&&a[j]>key)\r\n"
+ "        \t\t\t\t{\r\n"
+ "          \t\t\t\t  a[j+1]=a[j];\r\n"
+ "           \t\t\t\t j--;\r\n"
+ "        \t\t\t\t}\r\n"
+ "        \t\t\t\ta[j+1]=key;\r\n"
+ "  \t\t\t\t}\r\n"
+ "    \t\t\t\tprintf(\"\\n After sorting :\");\r\n"
+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
+ "    \t\t\t\t{\r\n"
+ "      \t\t\t\t  printf(\"%d \",a[i]);\r\n"
+ "    \t\t\t\t}\r\n"
+ "\t\t\t\t}\r\n"
+ "\t\t\t\tint main()\r\n"
+ "\t\t\t\t{\r\n"
+ "  \t\t\t\t  int n;\r\n"
+ "    \t\t\t\tprintf(\"\\n Enter the size of the aray:\");\r\n"
+ "    \t\t\t\tscanf(\"%d\",&n);\r\n"
+ "    \t\t\t\tint a[n];\r\n"
+ "    \t\t\t\tint i,j,key;\r\n"
+ "    \t\t\t\tprintf(\"\\n Enter the Elements in the array:\");\r\n"
+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
+ "    \t\t\t\t{\r\n"
+ "      \t\t\t\t  scanf(\"%d\",&a[i]);\r\n"
+ "   \t\t\t\t}\r\n"
+ "    \t\t\t\tprintf(\"\\n Before Sorting:\");\r\n"
+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
+ "    \t\t\t\t{\r\n"
+ "      \t\t\t\t  printf(\"%d \",a[i]);\r\n"
+ "    \t\t\t\t}\r\n"
+ "    \t\t\t\tinsort(a,n);\r\n"
+ "  \t\t\t\t  return 0;\r\n"
+ "\t\t\t\t}\r\n"
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