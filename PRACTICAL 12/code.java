Practical-12

Create a class "Bank" having method getRateOfInterest().Create child classes as HDFC,
SBI,and PNB and override getRateOfInterest() and return interest rates as 4.0%,4.5%and 
5% correspondingly.
USE CONCEPT OF UPCASTING TO IMPLEMENT THIS SCENERIO.

import java.util.*;
class Bank
{
       float getROI(){     return 0;   }
}

class HDFC extends Bank
{      float getROI(){  return(4.0f);  }
}

class PNB extends Bank
{    float ROI(){    return(4.5f);   }
}

class SBI extends Bank
{    float ROI(){   return(5.0f);    }
}

class XYZ
{
      public static void main(String args[])
      {    Bank a=new Bank();
           System.out.println("Bank interest:"+a.getROI());
           
            a=new HDFC();
            System.out.println("HDFC Bank Interest :"+a.getROI());
 
            a=new PNB();
            System.out.println("PNB Bank Interest :"+a.getROI());
         
            a=new SBI();
            System.out.println("SBI Bank Interest :"+a.getROI());
       }
}
