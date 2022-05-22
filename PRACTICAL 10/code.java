Practical-10
Createa jagged array having three rows.Where 1 row contains 3 columns ,2 row contains 4 colunmns
and 3 row contains 2 column .Insert and transverse it.

import java.util.*;
class Jagg
{
         public static void main(String args[])
         {
           int a[][]=new int[3][];
           a[0]=new int[3]; 
           a[1]=new int[4];
           a[2]=new int[2];

           Scanner in=new Scanner(System.in);
           System.out.in("Enter the elements in Jagged aarray");
           for(int i=0;i<a.length;i++)
           {
             for(int j=0;j<a[i].length;j++)
              {   a[i][j]=in.nextInt();   }
            }
              
            System.out.println("The element of jagged arrray are:");
            for(int i=0;i<a.length;i++)
            {
             for(int j=0;j<a[i].length;j++)
              {
              System.out.println(a[i][j]+""); 
               }
             System.out.println();
             }
          }
}
