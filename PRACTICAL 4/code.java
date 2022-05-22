Practical-4
 Create class Employee with following attributes and methods ,ID,name,department
and salary.
The setDetails() method set the values of ID ,name,department and salary.
And showDetails() method shows the value of each field.
Note:(i) Values must be entered through Scanner class.
(ii) Use proper constructor.
(iii) Use "this"reference variable to avoid ambiguity.

import java.util.*;
class Employ{
int ID;
String name;
String Department;
int salary;

Employ()
{ID=0;
name=null;
Department=null;
salary=0;

System.out.println("A new employ has been created");
}
void setDetails(int ID,String name,String Department,int salary)
{
this.ID=ID;
this.name=name;
this.Department=Department;
this.salary=salary;
}

void showDetails()
{System.out.println("Employ Id:"+ID);
System.out.println("Employ name:"+name);
System.out.println("Employ Department is :"+Department);
System.out.println("Employ salary:"+salary);
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the employ name:");
String name=sc.next();
System.out.println("Enter the Id:");
int ID =sc.nextInt();
System.out.println("Enter the department :");
String Department=sc.next();
System.out.println("Enter the salary:");
int salary=sc.nextInt();
Employ e=new Employ();
e.setDetails(ID,name,Department,salary);
e.shoeDetails();} 
}
