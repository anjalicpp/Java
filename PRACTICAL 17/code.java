Practical-17
Write a program that reads char by char and writes in some other another file .Write the oprogram in efficient way.
import java.io.*;
class ReadCharByChar {
 public static void main(String[] args) {
 try {
 FileInputStream file1 = new FileInputStream("Question17Input.txt");
 BufferedInputStream f1 = new BufferedInputStream(file1);
 FileWriter fw = new FileWriter("Question17Output.txt");
 BufferedWriter bw = new BufferedWriter(fw);
 int i = f1.read();
 while (i != -1) {
 bw.write(i);
 i = f1.read();
 }
 System.out.println( "Content on Question17input.txt file is sucessfully written to
Question17Output.txt file.");
 f1.close();
 bw.close();
 }
 catch (Exception e) {
 System.out.println("Error: " + e);
 }
 }
}

******************************************
