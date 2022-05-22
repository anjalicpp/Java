Practical-11
Create a class "Shape" having area() method to calculate area.
Overload the area() method for shapes like triangle,reactangle and circle.

import java.util.*;
class Shape{
          void area(double r)
          {
          System.out.println("Area of circle"+(3.14*r*r));
          }
          void area(int s)
          {
           System.out.println("Area of square"+(s*s));
          }
          void area(int l,int b)
          {
           System.out.println("Area of reactangle"+(l*b));
           }
          void area(float b,float h)
          {
           System.out.println("Area of triangle "+(0.2*b*h));
           }
       
          public static void main(String args[])
         {
            Shape s=new Shape();
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the radius of circle");
            double r=in.nextInt();
            s.area(r);

            System.out.println("Enter the side of square ");
            int a=in.nextInt();
            s.area(a);

            System.out.println("Enter the length and breadth of reactangle");
            int l=in.nextInt();
            int b=in.nextInt();
            s.area(l,b);
            
            System.out.println("Enter the base and height of triangle");
            float x=in.nextFloat();
             float y=in.nextFoat();
             s.area(x,y);
          }
}
