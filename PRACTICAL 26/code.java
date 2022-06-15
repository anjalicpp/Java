QUESTION:
Create a canvas having smiley face.
SOURCE CODE:
import java.awt.*; 
class MyCanvas extends Canvas 
{
 public MyCanvas() {
 setBackground(Color.GRAY);
 setSize(500, 500); 
}
 public void paint(Graphics g) {
 g.drawOval(80, 70, 150, 150);
 g.setColor(Color.BLACK);
 g.fillOval(120, 120, 15, 15);
 g.fillOval(170, 120, 15, 15); 
g.drawArc(130, 180, 50, 20, 180, 180); } }
 class CanvasExample {
 CanvasExample() { Frame f = new Frame("Canvas Example");
 MyCanvas newCanvas = new MyCanvas(); // object of canvas class 
f.add(newCanvas);
 f.setLayout(null); 
f.setSize(800, 800);
 f.setVisible(true); }
 public static void main(String args[]) {
 new CanvasExample(); // Object creation of running Constructor 
} }
