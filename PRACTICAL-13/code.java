Practical-13
Create a package pack1 having one class C1 and one interface I1.Class C1 has two methods 
int sum(int,int) and int sub(int,int).The I1 has one method int division(int,int).Create 
another package pack2 having class C2.Reuse C1 and I1 in C2and show the results.
Note :Use appropriate Acess Modifier as required.

Package Practical
//docname:Program.java
//touch Program.java
package pack1;
public class C1{
                     public int sum(int x,int y)
                    {int sum=x+y;
                     return sum;}
                     }
public int sub(float x,float y)
{
int sub=x-y;
return sub;
}

                //doc name:I1.java
                //touch I1.java
package pack1;
public interaface I1
{ 
public int division(int x,int y);
}
 
//docname:Myc2.java
//touch Myc2.java
package pack2;
import pack1.*;
public class C2 extends Program implements I1{

public int division(int x,int y)         //interface defination
{System.out.println(x/y);}

public static void main(String args[])
{
        C2 obj=new C2();
        int sum=obj.sum(4,3);
        int sub=obj.sub(1.0f,2.0f);
        obj.division(2,3);
        System.out.println(sum);
        System.out.println(sub);       }

}
