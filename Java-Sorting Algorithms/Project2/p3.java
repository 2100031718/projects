package Project2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
class p3 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
p3()
{
f=new JFrame("Merge Sort Program ");
title=new JLabel(" Merge Sort Program");
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
t=new JTextArea("\n\n\n\n\t\t\t\tvoid merge(int arr[], int p, int q, int r) {\r\n"
+ "\r\n"
+ "    \t\t\t\tint n1 = q - p + 1;\r\n"
+ "    \t\t\t\tint n2 = r - q;\r\n"
+ "\r\n"
+ "\t\t\t\t    int L[n1], M[n2];\r\n"
+ "\r\n"
+ "    \t\t\t\tfor (int i = 0; i < n1; i++)\r\n"
+ "        \t\t\t\tL[i] = arr[p + i];\r\n"
+ "    \t\t\t\tfor (int j = 0; j < n2; j++)\r\n"
+ "       \t\t\t\t M[j] = arr[q + 1 + j];\r\n"
+ "\r\n"
+ "   \t\t\t\t int i, j, k;\r\n"
+ "    \t\t\t\ti = 0;\r\n"
+ "    \t\t\t\tj = 0;\r\n"
+ "    \t\t\t\tk = p;\r\n"
+ "\r\n"
+ "    \t\t\t\twhile (i < n1 && j < n2) {\r\n"
+ "        \t\t\t\tif (L[i] <= M[j]) {\r\n"
+ "            \t\t\t\tarr[k] = L[i];\r\n"
+ "           \t\t\t\t i++;\r\n"
+ "       \t\t\t\t } else {\r\n"
+ "            \t\t\t\tarr[k] = M[j];\r\n"
+ "         \t\t\t\t   j++;\r\n"
+ "        \t\t\t\t}\r\n"
+ "       \t\t\t\t k++;\r\n"
+ "    \t\t\t\t}\r\n"
+ "\r\n"
+ "   \t\t\t\t while (i < n1) {\r\n"
+ "        \t\t\t\tarr[k] = L[i];\r\n"
+ "        \t\t\t\ti++;\r\n"
+ "       \t\t\t\t k++;\r\n"
+ "   \t\t\t\t }\r\n"
+ "\r\n"
+ "    \t\t\t\twhile (j < n2) {\r\n"
+ "       \t\t\t\t arr[k] = M[j];\r\n"
+ "        \t\t\t\tj++;\r\n"
+ "       \t\t\t\t k++;\r\n"
+ "   \t\t\t\t }\r\n"
+ "\t\t\t\t}");
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