Practical-2:
WRITE A JAVA PROGRAM TO DEMONSTRATE THE WORKING OF BANK SYSTEM.
INSTANCE VARIABLE:name,account_no,amount.
INSTANCE METHOD:deposit(),withdraw(),checkbalance(),insert(),and display().
here we can withdraw and deposit amount from our account using deposit() and 
withdraw() methods respectively.
The insert() method is to initialisev  state and display method is to 
display the state values.

import java.util.*;
class Account{
             int account_no;
             String name;
             int amount;

void insert(int acc,String n,int b)
{account_no=acc;
name=n;
amount=b;}

void deposit(float d)
{amount+=d;
}

void withdraw(float w)
{if(w>amount)
{System.out.println("Insufficient balance");
}
else{
amount-=w;}
}
void checkbalance()
{System.out.println("Balance"+amount);
}

void display()
{
System.out.println("Name of account holder"+name);
System.out.println("Account no:"+account_no);
System.out.println("Amount left"+amount);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the account number");
int ac=sc.nextInt();
System.out.println("Enter the name:");
String s=sc.next();
System.out.println("Enter the ammount:");
int u=sc.nextInt();
System.out.println("Enter the deposit amount:");
int d=sc.nextInt();
System.out.println("Enter the withdraw amount:");
int w=sc.nextInt();
Account st=new Account();
st.insert(ac,s,u);
st.deposit(d);
st.withdraw(w);
st.checkbalance();
st.display();
}
}
