QUESTION:
Write a class Display having synchronized void wish(String) methods that wishes hello to given string 
name. Between printing hello and provided string name apply delay of 500 milliseconds. Suppose 
multiple threads are there and they are trying to access this wish() method concurrently on different 
objects then irregular output will be there. Write this application in such a way so that output becomes 
regular
SOURCE CODE:
class Display
{
  synchronized public void wish(String name)
   {
     for(int i=0;i<4;i++)
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

class Mythread1 extends Thread
{
  Display d1;
  String name;
  Mythread1(Display d1,String name)
  {
    this.d1=d1;
    this.name=name;
  }
  public void run()
  {
    d1.wish(name);
  }
}

class Mythread2 extends Thread
{
  Display d2;
  String name;
  Mythread2(Display d2,String name)
  



{
    this.d2=d2;
    this.name=name;
  }
  public void run()
  {
    d2.wish(name);
  }
}

class Demo2
{
  public static void main(String ags[])
  {
    Display d=new Display();
    Mythread1 t1=new Mythread1(d,"ABC");
    t1.start();
	
    Mythread2 t2=new Mythread2(d,"DEF");
	
    t2.start();
  }
}
 
