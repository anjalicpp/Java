class B extends Thread
{}
class C extends Thread
{}
class D extends Thread
{}
class A {
    public static void main(String[] args) 
    {
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("Default Name of Thread B: "+b.getName());
        System.out.println("Default Name of Thread C: "+c.getName()); 
        System.out.println("Default Name of Thread D: "+d.getName()+"\n");
       
   b.setName("MyThread-0");
   c.setName("MyThread-1");
    d.setName("MyThread-2");

  System.out.println("New Name of Thread B: "+b.getName());
   System.out.println("New Name of Thread C: "+c.getName());
  System.out.println("New Name of Thread D: "+d.getName()+"\n");


        System.out.println("Default Priority of Thread B: "+b.getPriority());

        System.out.println("Default Priority of Thread C: "+c.getPriority());
 
        System.out.println("Default Priority of Thread D: "+d.getPriority()+"\n");


        b.setPriority(1);

        c.setPriority(7);

        d.setPriority(8);

        System.out.println("New Priority of Thread B: "+b.getPriority());

        System.out.println("New Priority of Thread C: "+c.getPriority());

        System.out.println("New Priority of Thread D: "+d.getPriority()+"\n");


    }

}
