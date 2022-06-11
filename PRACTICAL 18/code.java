Practical-18
Write a program that reads from text file line by line and writes on console.

import java.io.*;
class A{
public static void main(String args[])throws IOException
{
FileReader fr=new FileReader("t1.txt");
BufferedReader br=new BufferedReader(fr);

String s="";
while((s=br.readLine())!=null)
{
System.out.print(s);
}
br.close();
fr.close();
}
}
