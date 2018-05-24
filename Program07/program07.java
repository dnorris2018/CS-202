/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program07
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     11/3/2014

 DOCUMENTATION
 -------------
   This program will ask the user for a beginning balance then determine where
   its positive or negative. If its negative then it will ask the user again to
   enter a positive balance. Then it will find the balance with the interest 
   rate. Then it will ask the user for a transaction per month and then add it 
   to the balance and it will go threw all 12 months. Then display the yearly 
   balance. 
 ******************************************************************************/

import java.util.Scanner;

public class program07
{
   public static final double INTEREST_RATE = .015;
   public static void main(String[] args)
   {
      double balance,
             transaction;
      int    count; 
      Scanner keyboard = new Scanner(System.in);

      System.out.println("\n\n                Yearly Bank Balance");
      System.out.println("***************************************************");
      System.out.println("This program will ask the user for a beginning");
      System.out.println("balance then determine where its positive or");
      System.out.println("negative. If its negative then it will ask the user");
      System.out.println("again to enter a positive balance. Then it will");
      System.out.println("find the balance with the interest rate. Then it");
      System.out.println("will ask the user for a transaction per month and");
      System.out.println("then add it to the balance and it will go threw all");
      System.out.println("12 months. Then display the yearly balance.\n\n");       
      
      System.out.println("Please enter the beginning balance.");
      System.out.print("Balance = $");      
      balance = keyboard.nextDouble();

      while (balance < 0)
      {
         System.out.println("\nPlease enter a positive balance.");
         System.out.print("Balance = $");
         balance = keyboard.nextDouble();
      }

      count = 1;
      while (count <= 12)
      {
         balance = balance + (balance * (INTEREST_RATE / 12));
         System.out.println("\nPlease enter a deposit or withdraw.");
         System.out.print("Transaction = $");
         transaction = keyboard.nextDouble();
         balance = balance + transaction;

         count++;
      }

      System.out.println("\n\nThe balance at the end of the year.");
      System.out.printf("Balance = $%.2f \n\n", balance);
   }
}
