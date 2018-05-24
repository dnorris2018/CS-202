/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program02
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     9/22/2014

 DOCUMENTATION
 -------------
   This program will take three whole numbers and display the average.
 ******************************************************************************/

import java.util.Scanner;

public class program02
{
   public static void main(String[] args)
   {
      int value1,
          value2,
          value3;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("This program will find the average of three whole numbers.");
      System.out.println("Enter value one:");
      value1 = keyboard.nextInt();
      System.out.println("Enter value two:");
      value2 = keyboard.nextInt();
      System.out.println("Enter value three:");
      value3 = keyboard.nextInt();

      System.out.println((value1 + value2 + value3) / 3.0);
   }
}

