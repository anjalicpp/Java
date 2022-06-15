QUESTION:
Write a class Customer having balance as a property and void withdrawal(int amount), and void deposit(int amount) as instance methods. There are two threads, the first thread wants to withdrawal 
some amount and second thread wants to deposit some amount. Apply inter thread communication 
, if withdrawal amount is higher than current balance then first thread will wait for second thread to 
deposit then resume the withdrawal.

SOURCE CODE:
import java.util.*;
 class Customer {
 int balance;
 void withdrawal(double amount) {
 synchronized (this) {
 if (amount > balance)
 { try {
 System.out.println("Insufficient balance. Waiting for another thread to Deposit money"); 
wait(); }
 catch (InterruptedException e) 
{ e.printStackTrace(); } }
 balance -= amount; 
System.out.println("Withdrawal amount: " + amount);
 System.out.println("Current balance: " + balance); } }
 void deposit(double amount) { synchronized (this)
 { balance += amount;
 System.out.println("Deposit amount: " + amount); 
System.out.println("Current balance: " + balance);
 notify(); } } }
 class Account 
{ public static void main(String[] args) 
{ Customer c = new Customer();
 Thread t1 = new Thread(new Runnable() 
{ public void run() { Scanner sc1 = new Scanner(System.in);
 System.out.println("Enter amount to withdraw");
 double withdrawAmount = sc1.nextDouble(); 
c.withdrawal(withdrawAmount); }  };
 Thread t2 = new Thread(new Runnable() { 
public void run() { 
Scanner sc2 = new Scanner(System.in);
 System.out.println("Enter amount to deposit"); 
double depositAmount = sc2.nextDouble();
 c.deposit(depositAmount); } }; 
t1.start(); 
t2.start(); 
} }
