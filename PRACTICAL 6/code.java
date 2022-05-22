
Practical-7
Apply following functions on StringBuffer object "HELLO".
(i)    Append "Java".
(ii)   Insert "Java" at index 1.
(iii)  Replace with "Java" with character between index 1 to 2.
(iv)   Delete characters between index 1and 2.
(v)    Reverse the string "HELLO"

class stringBuffer
{
  public ststic void main(String args[])
  {StringBuffer s=new StringBuffer("HELLO");
   s.append("Java");
   System.out.println("String after appending Java "+s+"\n");
   
   s.insert(1,"Java");
   System.out.println("String after inserting Java at index 1 :"+s+"\n");

   s.replace(1,2,"Java");
   System.out.println("String after replacing character at 1 and 2 with Java :"+s+"\n");
  
   s.delete(1,2);
   System.out.println("String after deleting character at index 1 and 2 :"+s+"\n");
   
   s=new StringBuffer("HELLO");
   s.reverse();
   
   System.out.println("String HELLO after reversing :"+s+"\n");   

  } 
}
