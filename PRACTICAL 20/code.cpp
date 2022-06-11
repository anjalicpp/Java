Practical:20
Write a multithreaded program where three threads are there and printing the numbers from 1 to 10 concurrently.


class B extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("B: "+i);
        }
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("C: "+i);
        }
    }
}
class D extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("D: "+i);
        }
    }
}

class A
{
    public static void main(String[] args) 
    {
        B b = new B();
        C c = new C();
        D d = new D();
        
        b.start();
        c.start();
        d.start();
    }
}
