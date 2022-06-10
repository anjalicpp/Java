Practical -16

Write a program that reads byte by byte and writes in some other another file .Write the oprogram in efficient way.

import java.io.*;
class A
{
public static void main(String args[])throws IOException
{
FileInputStream fis=new FileInputStream("t1.txt");
BufferedInputStream bis=new BufferedInputStream(fis);
FileOutputStream fos=new FileOutputStream("t2.txt");
BufferedOutputStream bos=new BufferedOutputStream("fos");
int i=0;
while((i=bis.read())!=-1)
{
bos.write(i);
}
bos.close();
fos.close();
bis.close();
fis.close();

}
}
