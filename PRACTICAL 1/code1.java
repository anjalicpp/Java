PRACTICAL-1:
1.CREATE A CLASS "STUDENT" HAVING FOLLOWING INSTANCE VARIABLES AND METHODS .
INSTANCE VARIABLE:  ID,NAME,

class Student 
{               long id;
                String Name,Branch,university;

                void setdetails(String a,String b,String c,long x)       
               {Name=a;
                Branch=b;
                university=c;
                id=x;}

               void showDetails()
              {
               System.out.println("Student Name:"+Name);
               System.out.println("Student id: "+id);
               System.out.println("Branch:"+Branch);
               System.out.println("University:"+university);
               }          
              public static void main(String args[])
             {
              String a="Anjali";
              String b="Computer and Engineering";
              String c="GEHU";
              long x=200012;
             Student s=new Student();
             s.setDetail(a,b,c,x);
             s.showDetail();
              }         }
