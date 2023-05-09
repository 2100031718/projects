package Project2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class p4 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
p4()
{
f=new JFrame("Bubble Sort Program ");
title=new JLabel(" Bubble Sort Program");
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
t=new JTextArea("\n\n\n\t\t\t\t#include <stdio.h> \r\n"
+ "\t\t\t\tint main()\r\n"
+ "\t\t\t\t{\r\n"
+ "    \t\t\t\tint n, temp;\r\n"
+ "    \t\t\t\tprintf(\"\\nEnter the size of array : \");\r\n"
+ "    \t\t\t\tscanf(\"%d\",&n);\r\n"
+ "    \t\t\t\tint arr[n];\r\n"
+ "    \t\t\t\tfor (int i = 0; i < n; i++)\r\n"
+ "    \t\t\t\t{\r\n"
+ "       \t\t\t\t scanf(\"%d\", &arr[i]);\r\n"
+ "    \t\t\t\t}\r\n"
+ "        \t\t\t\tprintf(\"\\nBefore Sorting \");\r\n"
+ "    \t\t\t\tfor (int i = 0; i < n; i++)\r\n"
+ "    \t\t\t\t{\r\n"
+ "        \t\t\t\tprintf(\"%d \", arr[i]);\r\n"
+ "    \t\t\t\t}\r\n"
+ "\r\n"
+ "\t\t\t\t    printf(\"\\n\");\r\n"
+ "\r\n"
+ "   \t\t\t\tfor (int i = 0; i < n-1; i++){ \r\n"
+ "       \t\t\t\tprintf(\"Pass = %d\\n\",i);\r\n"
+ "      \t\t\t\t for (int j = 0; j < n-i-1; j++){\r\n"
+ "          \t\t\t\t if (arr[j] > arr[j+1])\r\n"
+ "          \t\t\t\t  {    \r\n"
+ "             \t\t\t\t   temp = arr[j];\r\n"
+ "            \t\t\t\t    arr[j] = arr[j+1];\r\n"
+ "              \t\t\t\t  arr[j+1] = temp;\r\n"
+ "           \t\t\t\t }\r\n"
+ "     \t\t\t\t   printf(\"\\n\");\r\n"
+ "      \t\t\t\t  for(int i=0;i<n;i++)\r\n"
+ "      \t\t\t\t  printf(\"%d \",arr[i]);\r\n"
+ "   \t\t\t\t    }\r\n"
+ "     \t\t\t\t   printf(\"\\n\");\r\n"
+ "   \t\t\t\t}\r\n"
+ "        \r\n"
+ "   \t\t\t\t printf(\"\\nAfter Sorting \"); \r\n"
+ "  \r\n"
+ "  \t\t\t\t  for (int i = 0; i < n; i++)\r\n"
+ "   \t\t\t\t {\r\n"
+ "     \t\t\t\t   printf(\"%d \", arr[i]);\r\n"
+ "  \t\t\t\t  }\r\n"
+ "   \t\t\t\t return 0;\r\n"
+ "\t\t\t\t}\r\n"
+ "\r\n"
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