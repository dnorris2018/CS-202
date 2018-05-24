/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program04
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     10/8/2014

 DOCUMENTATION
 -------------
   This program will determine if a one whole number is divisible by another 
   whole number.
 ******************************************************************************/

import java.util.Scanner;

public class program04
{
   public static void main(String[] args)
   {
      int numerator,
          denominator;

      Scanner keyboard = new Scanner(System.in);

      System.out.print("This program will tell where one whole number is");
      System.out.println("divisible by another whole number.");
      System.out.println("Enter numerator");
      numerator = keyboard.nextInt();
      System.out.println("Enter denominator");
      denominator = keyboard.nextInt();

      if ((numerator % denominator) == 0)
         System.out.println(
              "The number " + numerator + " is evenly divisible by " + denominator);
      else
         System.out.println(
              "The number " + numerator + " is not evenly divisible by " + denominator);
   }
}

