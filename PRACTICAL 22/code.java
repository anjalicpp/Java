QUESTION:
Write a class Display having void wish(String name) methods that wishes hello to given string 
name. Between printing hello and provided string name apply delay of 500 milliseconds. Suppose 
multiple threads are there and they are trying to access this wish() method concurrently on same 
object then irregular output will be there. Write this application in such a way so that output 
becomes regular.
SOURCE CODE:
class Display
{
  synchronized public void wish(String name)
   {
     for(int i=0;i<3;i++)
     {
       System.out.print("Hello ");
       try
       {
         Thread.sleep(500);
       }
       catch(Exception e)
       {
         System.out.print(e);
       }
     System.out.println(name);
    }
  }
}


class Mythread extends Thread
{
  Display d;
  String name;
  Mythread(Display d,String name)
  {
    this.d=d;
    this.name=name;
  }
  public void run()
  {
    d.wish(name);
  }
}
class Demo
{
  public static void main(String ags[])
  {
    	Display d=new Display();
    	Mythread t1=new Mythread(d,"ABC");
	Mythread t2=new Mythread(d,"DEF");
	Mythread t3=new Mythread(d,"XYZ");
    	t1.start();
      t2.start();
    	t3.start();
  }
}
