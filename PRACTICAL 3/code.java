Practical-3:
WRITE A PROGRAM TO SUM TWO NUMBERS.HERE INPUTS ARE PROVIDED THROUGH 
COMMAND LINE ARGUMENT.

class Sum{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println("Sum of gtwo numbers using command line argument:"+(a+b));
}
}
