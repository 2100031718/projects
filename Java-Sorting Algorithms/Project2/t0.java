package Project2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class t0 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
t0()
{

f=new JFrame("Time Complexity ");
title=new JLabel("Time Complexity");
title.setFont(new Font("Arial", Font.PLAIN, 25));
title.setSize(300,50);
title.setLocation(300,5);
f.add(title);
h=new JButton("HOME");
h.setSize(100,50);
   h.setLocation(500,10);
   h.setBackground(Color.WHITE);
h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
h.addActionListener(this);
f.add(h);
back=new JButton("Back");
   back.setSize(100,50);
   back.setLocation(650,10);
   back.setBackground(Color.PINK);
back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
back.addActionListener(this);
f.add(back);
t=new JTextArea("\n\n\n\tBest Case Analysis\r\n"
+ "\tIn Best Case i.e., when the array is already sorted, tj = 1\r\n"
+ "\tTherefore,T( n ) = C1 * n + ( C2 + C3 ) * ( n - 1 ) + C4 * ( n - 1 ) + ( C5 + C6 ) * ( n - 2 ) + C8 * ( n - 1 )\r\n"
+ "\twhich when further simplified has dominating factor of n and gives T(n) = C * ( n ) or O(n)\r\n"
+ "\r\n"
+ "\n\tWorst Case Analysis\r\n"
+ "\tIn Worst Case i.e., when the array is reversly sorted (in descending order), tj = j\r\n"
+ "\tTherefore,T( n ) = C1 * n + ( C2 + C3 ) * ( n - 1 ) + C4 * ( n - 1 ) ( n ) / 2 + ( C5 + C6 ) * ( ( n - 1 ) (n ) / 2 - 1) + C8 * ( n - 1 )\r\n"
+ "\twhich when further simplified has dominating factor of n2 and gives T(n) = C * ( n 2) or O( n2 )\r\n"
+ "\r\n"
+ "\n\tAverage Case Analysis\r\n"
+ "\tLet's assume that tj = (j-1)/2 to calculate the average case\r\n"
+ "\tTherefore,T( n ) = C1 * n + ( C2 + C3 ) * ( n - 1 ) + C4/2 * ( n - 1 ) ( n ) / 2 + ( C5 + C6 )/2 * ( ( n - 1 ) (n ) / 2 - 1) + C8 * ( n - 1 )\r\n"
+ "\twhich when further simplified has dominating factor of n2 and gives T(n) = C * ( n 2) or O( n2 )");
f.add(t);
t.setBackground(Color.LIGHT_GRAY);
f.setSize(800,400);
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