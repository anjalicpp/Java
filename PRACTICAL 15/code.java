Practical-15
  
  
Create a LowBalanceException that occurs when user tries to withdraw some amount that is 
greater than this current bank balance.To withdraw you have to write a void withdraw(int amount) method.
import java.io.*;             //user defined exception
class lbException extends RunTimeException{
                 lbException (String s)
                 {      super(s);       }

                                          }

class Xyz{
          int bal=1000;

          void withdraw(int amt)
         {  if(bal<amt)
            throw new lbException("Insufficient Balance");
         }
          public static void main(String[] args)
          {         Xyz d=new Xyz();
                    d.withdraw(2000); 
          }
}
********************************************************************
