QUESTION:
Write a JFrame having three textfields. The first two textfields refers to two numbers on which sum or
subtraction will happen. The third textfield will show the result. There are two buttons “SUM” and
“SUBTRACTION”. Once user will click on sum or subtraction buttons then the corresponding result will be displayed in result field
SOURCE CODE:
import java.awt.*;
import java.awt.event.*;
class Textfields extends Frame implements ActionListener {
 TextField t1, t2, t3;
 Button b1, b2;
 Textfields() {
 setLayout(new FlowLayout());
 t1 = new TextField("Enter First Number");
 t2 = new TextField("Enter Second Number");
 t3 = new TextField(10);
 b1 = new Button("SUM");
 b2 = new Button("SUBTRACTION");
 add(t1);
 add(t2);
 add(t3);
 add(b1);
 add(b2);
 b1.addActionListener(this);
 b2.addActionListener(this);
 setSize(400, 400);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent ae) {
 int a = Integer.parseInt(t1.getText());
 int b = Integer.parseInt(t2.getText());
 if (ae.getSource() == b1) {
 t3.setText(String.valueOf(a + b));
 } else {
 t3.setText(String.valueOf(a - b));
 }
 }
 public static void main(String[] args) {
 new Textfields();
 }
}
