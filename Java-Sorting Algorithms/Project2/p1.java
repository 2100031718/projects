package Project2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
public class p1 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
p1()
{
f=new JFrame("Quick Sort Program ");
title=new JLabel(" Quick Sort Program");
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
+ "\t\t\t\tint QuickSort(int a[],int first,int last)\r\n"
+ "\t\t\t\t{\r\n"
+ "    \t\t\t\tint i,pivot,j,t;\r\n"
+ "    \t\t\t\tif(first<last)\r\n"
+ "    \t\t\t\t{\r\n"
+ "        \t\t\t\tpivot=first;\r\n"
+ "       \t\t\t\t i=first;\r\n"
+ "        \t\t\t\tj=last;\r\n"
+ "        \t\t\t\twhile(i<j)\r\n"
+ "        \t\t\t\t{\r\n"
+ "            \t\t\t\twhile(a[i]<=a[pivot])\r\n"
+ "            \t\t\t\t{\r\n"
+ "               \t\t\t\t i++;\r\n"
+ "            \t\t\t\t}\r\n"
+ "            \t\t\t\twhile(a[j]>a[pivot])\r\n"
+ "            \t\t\t\t{\r\n"
+ "               \t\t\t\t j--;\r\n"
+ "            \t\t\t\t}\r\n"
+ "            \t\t\t\tif(i<j)\r\n"
+ "            \t\t\t\t{\r\n"
+ "                \t\t\t\tt=a[i];\r\n"
+ "                \t\t\t\ta[i]=a[j];\r\n"
+ "                \t\t\t\ta[j]=t;\r\n"
+ "            \t\t\t\t}\r\n"
+ "        \t\t\t\t}\r\n"
+ "       \t\t\t\t t=a[j];\r\n"
+ "        \t\t\t\ta[j]=a[pivot];\r\n"
+ "       \t\t\t\t a[pivot]=t;\r\n"
+ "        \t\t\t\tQuickSort(a,first,j-1);\r\n"
+ "        \t\t\t\tQuickSort(a,j+1,last);        \r\n"
+ "    \t\t\t\t}    \r\n"
+ "\t\t\t\t}\r\n"
+ "\t\t\t\tint main()\r\n"
+ "\t\t\t\t{\r\n"
+ "    \t\t\t\tint n,first,last;\r\n"
+ "    \t\t\t\tscanf(\"%d\",&n);\r\n"
+ "    \t\t\t\tint a[n];\r\n"
+ "    \t\t\t\tfor(int i=0;i<n;i++)\r\n"
+ "    \t\t\t\tscanf(\"%d\",&a[i]);\r\n"
+ "    \t\t\t\tfirst=0;\r\n"
+ "    \t\t\t\tlast=n-1;\r\n"
+ "    \t\t\t\tQuickSort(a,first,last);\r\n"
+ "    \t\t\t\tfor(int i=0;i<n;i++)\r\n"
+ "        \t\t\t\tprintf(\"%4d \",a[i]);\r\n"
+ "\t\t\t\t}\r\n"
+ "");
f.add(t);
t.setBackground(Color.cyan);
f.setSize(800,900);
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