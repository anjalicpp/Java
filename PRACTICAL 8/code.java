Practical -8

Create a class "Student" having following instance variables and methods.

Instance variable:ID,Name,Branch,City and University
While creating constructor with one ,two,three,four and five arguments reuse the constructor by using constructor chaining.

import java.util.*;
class Student
{
    long id;
    String Name,Branch,city,university;
    
    Student(String a)
    {name=a;
     System.out.println("Constructor with one argument \n");
     }

    Student(String a,String b)
    {
     this(a);
     Branch=b;
     System.out.println("Constructor with two arguments\n");
     }
    
    Student(String a,String b,String c)
    {
     this(a,b);
     city=c;
     System.out.println("Constructor with three argument \n");
    }

   Student(String a,String b,String c,String d)
   {
    this(a,b,c);
    university=d;
    System.out.println("Constructor with four argument \n");
   }
    
   Student(String a,String b,String c,String d,long e)
   {
    this(a,b,c,d);
    id=e;
    System.out.println("Constructor with five argument \n");
    }
    
   void display()
  {
   System.out.println("Name of Student:"+Name);
   System.out.println("	ID of student"+id);
   System.out.println("Branch of student"+Branch);
   System.out.println("City"+city);
   System.out.println("University"+university);
  }
 public static void main(String []args)
 {Scanner in=new Scanner(System.in);
  System.out.println("Enter the name of student:");
  String a=in.nextLine();

  System.out.println("Enter the branch of the student ");
  String b=in.nextLine();

  System.out.println("Enter the city ");
  String c=in.nextLine();

  System.out.println("Enter the university name ");
  String d=in.nextLine();
  System.out.println("Enter the Student ID ");
  long e=in.nextLong();
  
  Student s=new Student(a,b,c,d,e);
  System.out.println();
  s.display();
  }
}
