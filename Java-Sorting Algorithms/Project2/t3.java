package Project2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class t3 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
t3()
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
t=new JTextArea("\n\n\n\n\tMerge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.\r\n"
+ "\r\n"
+ "\tT(n) = 2T(n/2) + O(n)\r\n"
+ "\r\n"
+ "\tThe solution of the above recurrence is O(nLogn). The list of size N is divided into a max of Logn parts, and the merging of\n"
+ "\t all sublists into a single list takes O(N) time, the worst-case run time of this algorithm is O(nLogn)\r\n"
+ "\r\n"
+ "\tBest Case Time Complexity: O(n*log n)\r\n"
+ "\r\n"
+ "\tWorst Case Time Complexity: O(n*log n)\r\n"
+ "\r\n"
+ "\tAverage Time Complexity: O(n*log n)\r\n"
+ "\r\n"
+ "\tThe time complexity of MergeSort is O(n*Log n) in all the 3 cases (worst, average and best) as the mergesort always divides\n"
+ "\t the array into two halves and takes linear time to merge two halves.");
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