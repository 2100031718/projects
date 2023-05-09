package Project2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class t4 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
t4()
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
t=new JTextArea("\n\n\n\n\tThe Time Complexity of the Bubble Sort Algorithm\r\n"
+ "\tBubble sort employs two loops: an inner loop and an outer loop.\r\n"
+ "\tThe inner loop performs O(n) comparisons deterministically.\r\n"
+ "\n\tWorst Case\r\n"
+ "\tIn the worst-case scenario, the outer loop runs O(n) times.\r\n"
+ "\tAs a result, the worst-case time complexity of bubble sort is O(n x n) = O(n x n) (n2).\r\n"
+ "\n\tBest Case\r\n"
+ "\tIn the best-case scenario, the array is already sorted, but just in case, bubble sort performs O(n) comparisons.\r\n"
+ "\tAs a result, the time complexity of bubble sort in the best-case scenario is O(n).\r\n"
+ "\n\tAverage Case\r\n"
+ "\tBubble sort may require (n/2) passes and O(n) comparisons for each pass in the average case.\r\n"
+ "\tAs a result, the average case time complexity of bubble sort is O(n/2 x n) = O(n/2 x n) = O(n/2 x n) = O(n/2 x n) = O (n2).");
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