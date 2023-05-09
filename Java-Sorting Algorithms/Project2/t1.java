package Project2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class t1 implements ActionListener
{
JFrame f;
JLabel l,title;
JTextArea t;
JButton h,back;
t1()
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
t=new JTextArea("\n\n\n\n\n\n\tBest Case Complexity - In Quicksort, the best-case occurs when the pivot element is the middle element or near to the middle element.\n"
+ "\tThe best-case time complexity of quicksort is O(n*logn).\r\n\n"
+ "\tAverage Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly\n"
+ "\t  descending.The average case time complexity of quicksort is O(n*logn).\r\n\n"
+ "\tWorst Case Complexity - In quick sort, worst case occurs when the pivot element is either greatest or smallest element. Suppose,\n"
+ "\tif the pivot element is always the last element of the array, the worst case would occur when the given array is sorted already \n"
+ "\tin ascending or descending order. The worst-case time complexity of quicksort is O(n2).");
f.add(t);
t.setBackground(Color.LIGHT_GRAY);
f.setSize(800,380);
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