Program:5
REwrite program 1 with better memory management approach.
Note :Use static keyword.

class Student{
long id;
String name,branch;
static String university="Gehu";

void setDetail(String a,String b,long x)
{
        name=a;
        id=x;
        branch=b;
}

void showDetails()
{System.out.println("Student Name:"+name);
System.out.println("Student ID"+id);
System.out.println("Branch"+branch);
System.out.println("University"+university);
}

public static void main(String args[])
{
String a="Anjali";
String b="Computer Science and Engineering";
long x=2001;
Student s=new Student();
s.setDetails(a,b,x);
s.showDetails();
}
}
