Practical-14

Write a program to divide two numbers with proper exception handlers.

import java.io.IOException;
import java.util.Scanner;

class A{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(Syestem.in);
int a,b;
System.out.print("Enter the first number:");
a=sc.nextInt();
System.out.print("Enter the second number:");
b=sc.nextInt();

try{
int c=a/b;
System.out.print("Division is:"+c);
}

catch(ArithmeticException e){
System.out.print("e");
}

}
}
******************************************

