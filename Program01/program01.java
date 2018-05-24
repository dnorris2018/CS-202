/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program01
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-?, Introduction to Programming
   Date Due:     9/15/2014

 DOCUMENTATION
 -------------
   This program is from Listing 1.1.
 ******************************************************************************/

import java.util.Scanner;

public class program01
{
   public static void main(String[] args)
   {
      System.out.println("Hello out there.");
      System.out.println("I will add two numbers for you.");
      System.out.println("Enter two whole numbers on a line:");

      int n1, n2;

      Scanner keyboard = new Scanner(System.in);
      n1 = keyboard.nextInt();
      n2 = keyboard.nextInt();

      System.out.println("The sum of those two numbers is");
      System.out.println(n1 + n2);
   }
}

