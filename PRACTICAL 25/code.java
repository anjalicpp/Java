QUESTION:
Create a GUI for student’s information system. A GUI that asks all the relevant information’s related to a
student.

SOURCE CODE:
import javax.swing.*;
import java.awt.*;
class P extends JFrame {
 P() {
 JLabel l1 = new JLabel("Name");
 JTextField tf1 = new JTextField(20);
 JLabel l2 = new JLabel("Student ID");
 JTextField tf2 = new JTextField(20);
 JLabel l3 = new JLabel("Department");
 JCheckBox cb1 = new JCheckBox("CSE");
 JCheckBox cb2 = new JCheckBox("ECE");
 JLabel l4 = new JLabel("Gender");
 JRadioButton r1 = new JRadioButton("Male");
 JRadioButton r2 = new JRadioButton("Female");
 JRadioButton r3 = new JRadioButton("Others");
 ButtonGroup bg = new ButtonGroup();
 bg.add(r1);
 bg.add(r2);
 bg.add(r3);
 String s[] = { "Graphic Era Deemed University", "Graphic Era Hill University" };
 JComboBox cb = new JComboBox(s);
 String data[][] = { { "1", "Java", "TCS 401" }, { "2", "DAA", "TCS 451" }, { "3", "Automata", "TOC
402" } };
 String col[] = { "S.No", "Subject Name", "Subject Code" };
 JTable jt = new JTable(data, col);
 JScrollPane jsp = new JScrollPane(jt);
 setLayout(new FlowLayout());
 add(l1);
 add(tf1);
 add(l2);
 add(tf2);
 add(l3);
 add(cb1);
 add(cb2);
 add(l4);
 add(r1);
 add(r2);
 add(r3);
 add(cb);
 add(jsp);
 }
 public static void main(String args[]) {
 P d = new P();
 d.setSize(300, 400);
 d.setVisible(true);
 }
}      
